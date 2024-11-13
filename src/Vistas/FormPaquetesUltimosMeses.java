package Vistas;

import accesoADatos.AlojamientoData;
import accesoADatos.CiudadData;
import accesoADatos.HabitacionData;
import accesoADatos.PaqueteData;
import accesoADatos.PaqueteTuristaData;
import accesoADatos.RegimenData;
import accesoADatos.TransporteData;
import accesoADatos.TuristaData;
import entidades.Transporte;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import entidades.*;
import java.time.temporal.ChronoUnit;
import javax.swing.table.JTableHeader;



public class FormPaquetesUltimosMeses extends javax.swing.JInternalFrame {

public Turista viajero = new Turista();
public Transporte transporte = new Transporte();
public Paquete paquete;

public TuristaData tData = new TuristaData();
public PaqueteData pData = new PaqueteData();
public PaqueteTuristaData ptData = new PaqueteTuristaData();

public ArrayList<Turista> viajeros = new ArrayList<>();
public ArrayList<Paquete> listado = new ArrayList();
   
    
    
private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};
    
    
    public FormPaquetesUltimosMeses() {
        initComponents();
        armarCabecera();
        cargarTabla();
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tPaquetes = new javax.swing.JTable();
        tbCantidad = new javax.swing.JTextField();
        lbFormTP = new javax.swing.JLabel();
        lbEstadisticaTP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        tPaquetes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tPaquetes);

        tbCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbCantidad.setForeground(new java.awt.Color(51, 51, 255));
        tbCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total de Paquetes de los últimos 2 meses:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbCantidad.setEnabled(false);

        lbFormTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbFormTP.setForeground(new java.awt.Color(51, 51, 255));
        lbFormTP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFormTP.setText("Paquetes presupuestados en los últimos dos meses");

        lbEstadisticaTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEstadisticaTP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEstadisticaTP.setText("Estadísticas");

        tbTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbTotal.setForeground(new java.awt.Color(51, 51, 255));
        tbTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total $", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbFormTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEstadisticaTP)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                        .addComponent(tbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFormTP)
                    .addComponent(lbEstadisticaTP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void cargarTabla(){

            limpiarTabla();    
            double total = 0;
            int cantidad =0;
            listado = (ArrayList) pData.listarPaquetesUltimos2Meses();
            for (Paquete m: listado) {
                    long cantidadDeDias = m.getFechaDesde().until(m.getFechaHasta(), ChronoUnit.DAYS);
                    modelo.addRow(new Object[] {
                        m.getIdPaquete(),
                        m.getCiudadDestino().getNombre(),
                        m.getGrupoBase().size(),
                        m.getFechaDesde(),
                        m.getFechaHasta(),
                        cantidadDeDias,
                        m.getTransporte().getTipoTransporte(),
                        m.getAlojamiento().getNombre(),
                        m.getRegimen().getDenominacion(),
                        String.format("$%.2f", m.getMontoTotal())
                    });
                    total = total + m.getMontoTotal();
                    cantidad++;
            }
            tbTotal.setText(String.format("$%.2f", total));
            tbCantidad.setText(String.valueOf(cantidad));

        } 
        
        private void limpiarTabla(){

            int indice= modelo.getRowCount()-1;
            for (int i = indice; i>=0; i--) {
                    modelo.removeRow(i);
            }
        }
        
        private void armarCabecera(){

            modelo.addColumn("ID");
            modelo.addColumn("Destino");
            modelo.addColumn("Viajeros");
            modelo.addColumn("Desde");
            modelo.addColumn("Hasta");
            modelo.addColumn("Días");
            modelo.addColumn("Transporte");
            modelo.addColumn("Aljoamiento");
            modelo.addColumn("Regimen");
            modelo.addColumn("Monto");


            tPaquetes.setModel(modelo);
            // Obtener el modelo de columnas de la tabla
            TableColumnModel columnModel = tPaquetes.getColumnModel();

            //Ancho de las columnas
            columnModel.getColumn(0).setPreferredWidth(5);   // "ID"
            columnModel.getColumn(1).setPreferredWidth(10);  // "Destino"
            columnModel.getColumn(2).setPreferredWidth(20);  // "Viajeros"
            columnModel.getColumn(3).setPreferredWidth(20);  // "Desde"
            columnModel.getColumn(4).setPreferredWidth(20);  // "Hasta"
            columnModel.getColumn(5).setPreferredWidth(50);  // "Días"
            columnModel.getColumn(6).setPreferredWidth(40);  // "Transporte"
            columnModel.getColumn(7).setPreferredWidth(50);  // "Alojamiento"
            columnModel.getColumn(8).setPreferredWidth(30);  // "Regimen"
            columnModel.getColumn(9).setPreferredWidth(10);  // "Monto"

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            tPaquetes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tPaquetes.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tPaquetes.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);                
            tPaquetes.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);  
            tPaquetes.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);  
            tPaquetes.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);  

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            tPaquetes.getColumnModel().getColumn(9).setCellRenderer(rightRenderer); 
            
            JTableHeader header = tPaquetes.getTableHeader();
            DefaultTableCellRenderer rendererCentrado = (DefaultTableCellRenderer) header.getDefaultRenderer();
            rendererCentrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            header.setDefaultRenderer(rendererCentrado);



        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEstadisticaTP;
    private javax.swing.JLabel lbFormTP;
    private javax.swing.JTable tPaquetes;
    private javax.swing.JTextField tbCantidad;
    private javax.swing.JTextField tbTotal;
    // End of variables declaration//GEN-END:variables
}
