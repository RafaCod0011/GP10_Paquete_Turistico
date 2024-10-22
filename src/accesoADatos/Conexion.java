
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
     private static final String URL= "jdbc:mariadb://localhost/";
    private static final String DB = "gp10_paqueteturistico";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private Conexion() {}

    
    public static Connection getConexion() {

        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC", 
                                                          USUARIO, PASSWORD);
            } catch (SQLException ex) {
                if (ex.getMessage().contains("Communications link failure") || 
                    ex.getMessage().contains("Connection refused") ||
                    ex.getMessage().contains("Socket fail to connect")) {
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos. Verifique que el servidor esté iniciado.", 
                                                  "Error de conexión", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                 } else {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                    
                }
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());
                System.exit(0);
                
            }
        
        }

        return connection;

    }
    
    
    
}
