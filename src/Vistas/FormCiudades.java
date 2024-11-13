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
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class FormCiudades extends javax.swing.JInternalFrame {
    
    public CiudadData Cdata = new CiudadData();
    public ArrayList<Ciudad> listado = new ArrayList();
    public Ciudad ciudad = new Ciudad();
    
    
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
        JRBactivo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        JtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbId = new javax.swing.JTextField();
        JBNuevo = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbTransportes = new javax.swing.JLabel();
        lbTransportesRecorridos = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);

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

        JRBactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBactivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Activa:");

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

        JBNuevo.setBackground(new java.awt.Color(245, 245, 245));
        JBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RedondoNuevo.png"))); // NOI18N
        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBGuardar.setBackground(new java.awt.Color(245, 245, 245));
        JBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Guardar.png"))); // NOI18N
        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBEliminar.setBackground(new java.awt.Color(245, 245, 245));
        JBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RedondoEliminar.png"))); // NOI18N
        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBSalir.setBackground(new java.awt.Color(245, 245, 245));
        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Salir.png"))); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        lbTransportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes.setForeground(new java.awt.Color(51, 51, 255));
        lbTransportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes.setText("Listado de Ciudades");

        lbTransportesRecorridos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportesRecorridos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTransportesRecorridos.setText("Ciudades");

        jSeparator3.setMaximumSize(new java.awt.Dimension(31767, 31767));
        jSeparator3.setName(""); // NOI18N

        jSeparator4.setMaximumSize(new java.awt.Dimension(31767, 31767));
        jSeparator4.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTransportesRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTransportes)
                    .addComponent(lbTransportesRecorridos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JRBactivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JRBactivo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtNombre))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(JBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leerTabla() { 
    int filaSeleccionada = TCiudades.getSelectedRow();

    if (filaSeleccionada != -1) {
        
        //ID
            int id = (int) TCiudades.getValueAt(filaSeleccionada, 0);
            String code = String.valueOf(id);
            tbId.setText(code);
        // NOMBRE DE LA CIUDAD
        String nombre = (String) TCiudades.getValueAt(filaSeleccionada, 1); 
        JtNombre.setText(nombre);
        // DESTINO ACTIVO
        boolean destinoActivo = (boolean) TCiudades.getValueAt(filaSeleccionada, 2);
        JRBactivo.setSelected(destinoActivo);
    }
}

    
    private void Nuevo(){
        tbId.setText("");
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
        guardarCiudad();
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        if (TCiudades.isEnabled()) {
          int filaSeleccionada = TCiudades.getSelectedRow();

          if (filaSeleccionada != -1) { 
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro/a de Eliminar la ciudad seleccionada?",
                    "Eliminar Ciudad",
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                int idCiudad = Integer.parseInt(tbId.getText());
                String mensaje = Cdata.eliminarCiudad(idCiudad);
                JOptionPane.showMessageDialog(this, mensaje);
                Nuevo();
            }
            cargarTabla();
            Nuevo();
            ciudad = null; 
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

    private void guardarCiudad(){
    int respuesta = JOptionPane.showConfirmDialog(null,
        "Va a grabar los datos ingresados de la ciudad. ¿Está Seguro/a?",
        "Grabar datos de la Ciudad",
        JOptionPane.YES_NO_OPTION);

    if(respuesta == JOptionPane.YES_OPTION){  
        try {
            if(JtNombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Complete los datos de la Ciudad", "Atención", JOptionPane.ERROR_MESSAGE);
            } else {
                if (tbId.getText().isEmpty()) {  // Nuevo registro
                    String nombre= JtNombre.getText();
                    boolean Activo = JRBactivo.isSelected();

                    // Crear la nueva ciudad sin ID
                    ciudad = new Ciudad(0, nombre, Activo);
                    Cdata.agregarCiudad(ciudad);

                    // Actualizar tbId con el ID generado
                    tbId.setText(String.valueOf(ciudad.getIdCiudad()));
                } else {  // Actualizar ciudad existente
                    int idCiudad = Integer.parseInt(tbId.getText());
                    
                    //Ciudad ciudadActual = Cdata.buscarCiudad(idCiudad);
                    String nombre= JtNombre.getText();
                    boolean Activo = JRBactivo.isSelected();
                    
                    Ciudad ciudadActual = new Ciudad(idCiudad,nombre, Activo);
                    Cdata.modificarCiudad(ciudadActual);

                }

                cargarTabla();
                Nuevo();
                ciudad = null;    
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Corrobore la información ingresada",
                    "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
      }
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
        TCiudades.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);        
        
        
        JTableHeader header = TCiudades.getTableHeader();
        DefaultTableCellRenderer rendererCentrado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        rendererCentrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        header.setDefaultRenderer(rendererCentrado);
        
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
    private javax.swing.JTable TCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbTransportes;
    private javax.swing.JLabel lbTransportesRecorridos;
    private javax.swing.JTextField tbId;
    // End of variables declaration//GEN-END:variables
}
