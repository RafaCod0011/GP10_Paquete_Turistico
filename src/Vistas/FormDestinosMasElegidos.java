package Vistas;

import accesoADatos.CiudadData;
import accesoADatos.PaqueteData;
import accesoADatos.TuristaData;
import entidades.Ciudad;
import entidades.Paquete;
import entidades.Turista;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormDestinosMasElegidos extends javax.swing.JInternalFrame {
    public CiudadData Cdata;
    public TuristaData Tdata;
    public PaqueteData Pdata;
    public ArrayList<Turista> listadoT;
    public ArrayList<Ciudad> listadoC;
    public ArrayList<Paquete> listadoP;
    
    private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
       }
    };
    
    public FormDestinosMasElegidos() {
        initComponents();
        armarCabecera();
        this.setTitle("Formulario Turista Por Paquete");
        Cdata = new CiudadData(); 
        Tdata = new TuristaData();
        Pdata = new PaqueteData();
        listadoT = (ArrayList<Turista>) Tdata.listarTurista();
        listadoP = (ArrayList<Paquete>) Pdata.listarPaquetes();
        listadoC = (ArrayList<Ciudad>) Cdata.listarCiudades();
        modelo = new DefaultTableModel();

        armarCabecera();
        cargaTablaTurista();
        cargaTablaPaquete();
        cargaTablaCiudad();

               // Configuración del selector de filas
        ListSelectionModel modeloS = JtCiudades.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = JtCiudades.getSelectedRow();
                    if (filaSeleccionada != -1) {
                }
            }
        }
    });
        
        Tdata = new TuristaData();
        Pdata = new PaqueteData();
        Cdata = new CiudadData();
        listadoT = (ArrayList<Turista>)Tdata.listarTurista();
        listadoP = (ArrayList<Paquete>)Pdata.listarPaquetes();
        listadoC = (ArrayList<Ciudad>)Cdata.listarCiudades();
        modelo = new DefaultTableModel();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JDestinosMasElegidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtCiudades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 223));
        setClosable(true);
        setForeground(java.awt.Color.black);
        setIconifiable(true);

        JDestinosMasElegidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JDestinosMasElegidos.setForeground(new java.awt.Color(51, 51, 255));
        JDestinosMasElegidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JDestinosMasElegidos.setText("Destinos mas elegidos");

        JtCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtCiudades);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Estadisticas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDestinosMasElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(JDestinosMasElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }
    
    private void cargaTablaCiudad(){
        limpiarTabla();
        listadoC = (ArrayList) Cdata.listarCiudades();
    }
    
    private void cargaTablaTurista(){
        limpiarTabla();    
        listadoT = (ArrayList) Tdata.listarTurista();
        for (Turista m: listadoT) {
                modelo.addRow(new Object[] {m.getIdTurista(),m.getFullName(),m.getEdad()});
        } 
    }
    
    private void cargaTablaPaquete(){
        limpiarTabla();    
        listadoP = (ArrayList) Pdata.listarPaquetes();
        for (Paquete m: listadoP) {
                modelo.addRow(new Object[] {m.getIdPaquete()});
        } 
    }
    
    private void armarCabecera(){
        
        modelo.addColumn("ID Ciudad");
        modelo.addColumn("Nombre del destino");
        modelo.addColumn("Cantidad de Pasajeros");
        modelo.addColumn("fechas mas buscadas");
        modelo.addColumn("Cantidad de pasajeros");
        
        JtCiudades.setModel(modelo);
        
        TableColumnModel ColumnModel = JtCiudades.getColumnModel();
        
        ColumnModel.getColumn(0).setPreferredWidth(100); //id
        ColumnModel.getColumn(1).setPreferredWidth(80);  //Nombre del destino
        ColumnModel.getColumn(2).setPreferredWidth(80);  //Cantidad de pasajeros
        ColumnModel.getColumn(3).setPreferredWidth(80);  //Fechas mas buscadas
        ColumnModel.getColumn(4).setPreferredWidth(80);  //Cantidad de paquetes
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplicar el renderizador a la segunda columna ID (índice 0)
        JtCiudades.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JDestinosMasElegidos;
    private javax.swing.JTable JtCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
