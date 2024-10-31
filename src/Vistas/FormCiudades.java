package Vistas;

import accesoADatos.CiudadData;
import entidades.Ciudad;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormCiudades extends javax.swing.JInternalFrame {
    
    public CiudadData Cdata = new CiudadData();
    public ArrayList<Ciudad> listado = new ArrayList();
    
    
    private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
       }
  };
    
    
    public FormCiudades() {
       initComponents();
       armarCabecera();
       cargarTabla();
        
       JtNombre.setText("");
       JRBactivo.setSelected(false);

    ListSelectionModel modeloS = TCiudades.getSelectionModel();
    modeloS.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int filaSeleccionada = TCiudades.getSelectedRow();
                if (filaSeleccionada != -1) {
                    leerTabla();
                }
            }
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TCiudades = new javax.swing.JTable();
        LbCiudadesDisp = new javax.swing.JLabel();
        JRBactivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        JtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbId = new javax.swing.JTextField();
        JBNuevo = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        JBSalir = new javax.swing.JButton();

        TCiudades.setModel(new javax.swing.table.DefaultTableModel(
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
        TCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TCiudadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TCiudades);

        LbCiudadesDisp.setText("Ciudades Disponibles:");

        JRBactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBactivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Activo:");

        JtNombre.setToolTipText("");
        JtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        tbId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbId.setForeground(new java.awt.Color(51, 51, 255));
        tbId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbId.setEnabled(false);

        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JRBactivo)
                                    .addComponent(JtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(JBNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(JBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LbCiudadesDisp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LbCiudadesDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JRBactivo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(JBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leerTabla() { 
    int filaSeleccionada = TCiudades.getSelectedRow();

    if (filaSeleccionada != -1) {
        
        //ID
            int id = (int) TCiudades.getValueAt(filaSeleccionada, 0);
            String code = String.valueOf(id);
        // NOMBRE DE LA CIUDAD
        String nombre = (String) TCiudades.getValueAt(filaSeleccionada, 1); 
        JtNombre.setText(nombre);
        // DESTINO ACTIVO
        boolean destinoActivo = (boolean) TCiudades.getValueAt(filaSeleccionada, 2);
        JRBactivo.setSelected(destinoActivo);
    }
}

    
    private void Nuevo(){
        TCiudades.clearSelection();
        JtNombre.setText("");
        JRBactivo.setSelected(false);
    }
    
    private void JRBactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBactivoActionPerformed

    private void JtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNombreActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar los datos ingresados de la ciudad. ¿Esta Seguro/a?"
            ,"Grabar datos de la Ciudad"
            ,JOptionPane.YES_NO_OPTION);
        
        if(respuesta == JOptionPane.YES_OPTION){  
            try{
                if(JtNombre.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete los datos de la Ciudad","Atención", JOptionPane.ERROR_MESSAGE);
                }else{
  
                    String nombre = JtNombre.getText();
                    boolean activo = JRBactivo.isSelected();
                
                    int filaSeleccionada = TCiudades.getSelectedRow();
                    
                    if(filaSeleccionada == -1){
                        Ciudad ciudad = new Ciudad(nombre, activo);
                        Cdata.agregarCiudad(ciudad);
                    }else{
                     int idCiudad =(int)TCiudades.getValueAt(filaSeleccionada, 0);
                     Ciudad ciudad = new Ciudad(idCiudad, nombre, activo);
                    }
                    
                    limpiarFormulario();
                    cargarTabla();
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        if (TCiudades.isEnabled()){
            int filaSeleccionada = TCiudades.getSelectedRow();

            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada
                    int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar la ciudad seleccionada?"
                    ,"Eliminar Ciudad"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int ciudadEliminar = (int) TCiudades.getValueAt(filaSeleccionada, 0);
                    Cdata.eliminarCiudad(ciudadEliminar);
                    Nuevo();
                    cargarTabla();
                }
            }
        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void TCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TCiudadesMouseClicked
        if (TCiudades.isEnabled()){
            int filaSeleccionada = TCiudades.getSelectedRow();

            if (filaSeleccionada != -1) { 
                leerTabla();
                
            }
        }
    }//GEN-LAST:event_TCiudadesMouseClicked

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JBSalirActionPerformed

    private void limpiarFormulario() {
    TCiudades.clearSelection();
    JtNombre.setText("");
    JRBactivo.setSelected(false);
}
    
    private void cargarTabla(){
    
        limpiarTabla();    
        listado = (ArrayList) Cdata.listarCiudades();
        for (Ciudad m: listado) {
                modelo.addRow(new Object[] {m.getIdCiudad(),m.getNombre(),m.getDestinoActivo()});
        }
        
    }    
    
    private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("DestinoActivo");
        
        
        TCiudades.setModel(modelo);
        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = TCiudades.getColumnModel();

        //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(10);  // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Nombre"
        columnModel.getColumn(2).setPreferredWidth(80);  // "DestinoActivo"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplicar el renderizador a la segunda columna ID (índice 0)
        TCiudades.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
    }

    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JButton JBSalir;
    private javax.swing.JRadioButton JRBactivo;
    private javax.swing.JTextField JtNombre;
    private javax.swing.JLabel LbCiudadesDisp;
    private javax.swing.JTable TCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField tbId;
    // End of variables declaration//GEN-END:variables
}
