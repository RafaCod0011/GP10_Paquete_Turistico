package Vistas;

import accesoADatos.PaqueteData;
import accesoADatos.TuristaData;
import entidades.Paquete;
import entidades.Turista;
import java.util.ArrayList;
import java.util.List;
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
    public ArrayList<Turista> listadoPaqueteTurista;
    
    public DefaultTableModel modelo;

    public FormTuristaPorPaquete() {
        initComponents();
        this.setTitle("Formulario Turista Por Paquete");
        tData = new TuristaData(); // inicializar antes de cargar la tabla
        pData = new PaqueteData(); // inicializar antes de cargar la tabla
        listadoPaqueteTurista = (ArrayList<Turista>) tData.listarTuristaPaquete();
        modelo = new DefaultTableModel();

        armarCabecera();
        cargaTabla();

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
        listadoPaqueteTurista = (ArrayList<Turista>)tData.listarTurista();
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
        rbOrdenDescendente = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();

        lbFormTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbFormTP.setForeground(new java.awt.Color(51, 51, 255));
        lbFormTP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFormTP.setText("Cantidad de Paquetes por Turista");

        lbEstadisticaTP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEstadisticaTP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEstadisticaTP.setText("Estadísticas");

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

        rbOrdenDescendente.setText("Orden Descendente");
        rbOrdenDescendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOrdenDescendenteActionPerformed(evt);
            }
        });

        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(245, 245, 245));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbFormTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEstadisticaTP)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(rbTodos)
                        .addGap(18, 18, 18)
                        .addComponent(rbOrdenDescendente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOrdenDescendente)
                    .addComponent(rbTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        rbOrdenDescendente.setSelected(false);
        cargaTabla();
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbOrdenDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOrdenDescendenteActionPerformed
        rbTodos.setSelected(false); // HAY QUE REVISAR ESTE METODO
        cargaTabla();
    }//GEN-LAST:event_rbOrdenDescendenteActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
 
    
    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }

    private void cargaTabla() {
    limpiarTabla();
    List<Turista> listadoT = tData.listarTuristaPaquete();
    for (Turista m : listadoT) {
        modelo.addRow(new Object[] { m.getCantidadPaquetes(), m.getIdTurista(), m.getFullName() }); // trae cant paquetes, idTurista y nombreTurista
    }
    }
   
    
    private void armarCabecera(){
    modelo.addColumn("Cantidad de Paquetes Comprados");
    modelo.addColumn("ID Turista");
    modelo.addColumn("Nombre");

    tTuristaPaquete.setModel(modelo);

    TableColumnModel columnModel = tTuristaPaquete.getColumnModel();
    
    // Ancho de las columnas
    columnModel.getColumn(0).setPreferredWidth(1);   // "Cant paquetes"
    columnModel.getColumn(1).setPreferredWidth(1);   // "idTurista"
    columnModel.getColumn(2).setPreferredWidth(150); // "FullName"

    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    tTuristaPaquete.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    tTuristaPaquete.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel lbEstadisticaTP;
    private javax.swing.JLabel lbFormTP;
    private javax.swing.JRadioButton rbOrdenDescendente;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tTuristaPaquete;
    // End of variables declaration//GEN-END:variables

}
