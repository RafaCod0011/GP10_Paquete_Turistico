package Vistas;

import accesoADatos.TuristaData;
import entidades.Turista;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Santino
 */
public class FormTurista extends javax.swing.JInternalFrame {
    
    private TuristaData tData;
    Turista encontrado = new Turista();
    public ArrayList<Turista> listado = new ArrayList();

     private DefaultTableModel modelo= new DefaultTableModel(){

    
        @Override
        public boolean isCellEditable(int f, int c){

            return false;
        }
    };
    
    public FormTurista() {
        initComponents();
        this.setTitle("Formulario Turista");
        tData = new TuristaData();
        armarCabecera();
        cargarTabla();
        
        ListSelectionModel modeloS = tTurista.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = tTurista.getSelectedRow();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jpGeneral = new javax.swing.JPanel();
        lbControles = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jtFullName = new javax.swing.JTextField();
        jtEdad = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        tbId = new javax.swing.JTextField();
        jlEmpresa1 = new javax.swing.JLabel();
        jlEmpresa2 = new javax.swing.JLabel();
        jlEmpresa3 = new javax.swing.JLabel();
        lbTransportes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbGuardar1 = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jlTuristaTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTurista = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbControles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbControles.setText("Controles");

        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });

        jtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFullNameActionPerformed(evt);
            }
        });

        jtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEdadActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(245, 245, 245));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/EliminarTurista.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
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

        tbId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbId.setForeground(new java.awt.Color(51, 51, 255));
        tbId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbId.setEnabled(false);
        tbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIdActionPerformed(evt);
            }
        });

        jlEmpresa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmpresa1.setForeground(new java.awt.Color(71, 107, 250));
        jlEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmpresa1.setText("EDAD:");

        jlEmpresa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmpresa2.setForeground(new java.awt.Color(71, 107, 250));
        jlEmpresa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmpresa2.setText("DNI:");

        jlEmpresa3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmpresa3.setForeground(new java.awt.Color(71, 107, 250));
        jlEmpresa3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmpresa3.setText("NOMBRE COMPLETO:");

        lbTransportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTransportes.setForeground(new java.awt.Color(51, 51, 255));
        lbTransportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes.setText("Crear/Modificar Turista");

        jbGuardar1.setBackground(new java.awt.Color(245, 245, 245));
        jbGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ModificarTurista.png"))); // NOI18N
        jbGuardar1.setText("Guardar");
        jbGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardar1ActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(245, 245, 245));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/NuevoTurista.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jlTuristaTitle1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlTuristaTitle1.setText("Turista");

        tTurista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tTurista);

        javax.swing.GroupLayout jpGeneralLayout = new javax.swing.GroupLayout(jpGeneral);
        jpGeneral.setLayout(jpGeneralLayout);
        jpGeneralLayout.setHorizontalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbTransportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTuristaTitle1)
                .addGap(19, 19, 19))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEmpresa1))
                        .addGap(81, 81, 81)
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEmpresa2)
                            .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtFullName)
                                .addComponent(jlEmpresa3)
                                .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbControles))
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpGeneralLayout.setVerticalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTransportes)
                    .addComponent(jlTuristaTitle1))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlEmpresa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addComponent(jlEmpresa3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jlEmpresa2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(lbControles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNIActionPerformed

    private void jtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFullNameActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEdadActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
       if (tTurista.isEnabled()){
            int filaSeleccionada = tTurista.getSelectedRow();

            if (filaSeleccionada != -1) { 
                    int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar el Turista seleccionado/a?"
                    ,"Eliminar Turista"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int turistaEliminar = (int) tTurista.getValueAt(filaSeleccionada, 0);
                    tData.eliminarTurista(turistaEliminar);
                    Nuevo();
                }
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardar1ActionPerformed
        TuristaData movimiento = new TuristaData();
        
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar los datos ingresados de un Turista ¿Esta seguro/a?"
            ,"Nuevo Turista"
            ,JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
    
            try {

                    if (jtFullName.getText().isEmpty() || jtEdad.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Complete los datos del Turista a ingresar","Atención", JOptionPane.ERROR_MESSAGE);
                    }else{
                        
                        int documento = Integer.parseInt(jtDNI.getText());
                        int edad = Integer.parseInt(jtEdad.getText());
                        
                        // Buscar el turista por dni
                        encontrado = movimiento.buscarTurista(documento);
                        if (encontrado == null) {
                            encontrado = new Turista (documento, jtFullName.getText(), edad);
                            movimiento.guardarTurista(encontrado);
                            tbId.setText(String.valueOf(encontrado.getIdTurista()));
                        } else {
                            // Turista a modificar
                            encontrado.setFullName(jtFullName.getText());
                            encontrado.setDocumento(documento);
                            encontrado.setEdad(edad);
                            movimiento.modificarTurista(encontrado);
                        }
                        
                        encontrado = null;
                    }

                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_jbGuardar1ActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void tbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIdActionPerformed

    private void leerTabla() { 
    int filaSeleccionada = tTurista.getSelectedRow();

    if (filaSeleccionada != -1) {
        
        //ID
            int id = (int) tTurista.getValueAt(filaSeleccionada, 0);
            String code = String.valueOf(id);
            tbId.setText(code);
            
        // DNI DEL TURISTA
            int dni = (int) tTurista.getValueAt(filaSeleccionada, 1); 
            String doc = String.valueOf(dni);
            jtDNI.setText(doc);
        
        // NOMBRE COMPLETO DEL TURISTA
            String nombre = (String) tTurista.getValueAt(filaSeleccionada, 2); 
            jtFullName.setText(nombre);
            
        //ID
            int edad = (int) tTurista.getValueAt(filaSeleccionada, 3);
            String anios = String.valueOf(edad);
            jtEdad.setText(anios);
    }
}
    
    
    private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Documento");
        modelo.addColumn("Nombre Completo");
        modelo.addColumn("Edad");
        
        tTurista.setModel(modelo);
        
        TableColumnModel columnModel = tTurista.getColumnModel();

        
        columnModel.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Documento"
        columnModel.getColumn(2).setPreferredWidth(80);  // "Nombre"
        columnModel.getColumn(3).setPreferredWidth(30);   // "Edad"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        
        tTurista.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }
    
    private void cargarTabla(){
        
         limpiarTabla();
        listado = (ArrayList) tData.listarTurista();
        for (Turista t : listado) {
            modelo.addRow(new Object[] {t.getIdTurista(),t.getDocumento(),t.getFullName(), t.getEdad()});
        }
     }
    
    
    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }
    
    
    private void Nuevo(){
        tbId.setText("");
        jtDNI.setText("");
        jtFullName.setText("");
        jtEdad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar1;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlEmpresa1;
    private javax.swing.JLabel jlEmpresa2;
    private javax.swing.JLabel jlEmpresa3;
    private javax.swing.JLabel jlTuristaTitle1;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtFullName;
    private javax.swing.JLabel lbControles;
    private javax.swing.JLabel lbTransportes;
    private javax.swing.JTable tTurista;
    private javax.swing.JTextField tbId;
    // End of variables declaration//GEN-END:variables
}
