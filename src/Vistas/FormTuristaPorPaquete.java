package Vistas;

import accesoADatos.PaqueteData;
import accesoADatos.TuristaData;
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

public class FormTuristaPorPaquete extends javax.swing.JInternalFrame {
    public TuristaData tData;
    public PaqueteData pData;
    public ArrayList<Turista> listadoT;
    public ArrayList<Paquete> listadoP;
    
    public DefaultTableModel modelo;

    public FormTuristaPorPaquete() {
        initComponents();
        this.setTitle("Formulario Turista Por Paquete");
        tData = new TuristaData(); // inicializar antes de cargar la tabla
        pData = new PaqueteData(); // inicializar antes de cargar la tabla
        listadoT = (ArrayList<Turista>) tData.listarTurista();
        listadoP = (ArrayList<Paquete>) pData.listarPaquetes();
        modelo = new DefaultTableModel();

        armarCabecera();
        cargaTablaTurista();
        cargaTablaPaquete();

               // Configuración del selector de filas
        ListSelectionModel modeloS = tTuristaPaquete.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = tTuristaPaquete.getSelectedRow();
                    if (filaSeleccionada != -1) {
                }
            }
        }
    });
        
        tData = new TuristaData();
        pData = new PaqueteData();
        listadoT = (ArrayList<Turista>)tData.listarTurista();
        listadoP = (ArrayList<Paquete>)pData.listarPaquetes();
        modelo = new DefaultTableModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbFormTP = new javax.swing.JLabel();
        lbEstadisticaTP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTuristaPaquete = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        lbFormTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFormTP.setForeground(new java.awt.Color(51, 51, 255));
        lbFormTP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFormTP.setText("Formulario Turista por Paquete");

        lbEstadisticaTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEstadisticaTP.setForeground(new java.awt.Color(51, 51, 255));
        lbEstadisticaTP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEstadisticaTP.setText("Estadistica Turistas en Paquetes");

        tTuristaPaquete.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tTuristaPaquete);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbFormTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEstadisticaTP)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFormTP)
                    .addComponent(lbEstadisticaTP))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }

    private void cargaTablaTurista(){
        limpiarTabla();    
        listadoT = (ArrayList) tData.listarTurista();
        for (Turista m: listadoT) {
                modelo.addRow(new Object[] {m.getIdTurista(),m.getFullName(),m.getEdad()});
        } 
    }
    
    private void cargaTablaPaquete(){
        limpiarTabla();    
        listadoP = (ArrayList) pData.listarPaquetes();
        for (Paquete m: listadoP) {
                modelo.addRow(new Object[] {m.getIdPaquete()});
        } 
    }
    
    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Turista");
        modelo.addColumn("Edad Turista");
        modelo.addColumn("ID Paquete");
        
        tTuristaPaquete.setModel(modelo);
        
        TableColumnModel columnModel = tTuristaPaquete.getColumnModel();
        
         //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(1);   // "idTurista"
        columnModel.getColumn(1).setPreferredWidth(80);  // "FullName"
        columnModel.getColumn(2).setPreferredWidth(80);  // "Edad"
        columnModel.getColumn(0).setPreferredWidth(1);   // "idPaquete"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tTuristaPaquete.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEstadisticaTP;
    private javax.swing.JLabel lbFormTP;
    private javax.swing.JTable tTuristaPaquete;
    // End of variables declaration//GEN-END:variables
}
