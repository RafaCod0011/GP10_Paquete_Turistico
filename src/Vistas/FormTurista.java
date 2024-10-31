package Vistas;

import accesoADatos.TuristaData;
import entidades.Turista;
import javax.swing.JOptionPane;

/**
 *
 * @author Santino
 */
public class FormTurista extends javax.swing.JInternalFrame {
    
    private TuristaData turistaData;
    Turista encontrado = new Turista();

    public FormTurista() {
        initComponents();
        this.setTitle("Formulario Turista");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpGeneral = new javax.swing.JPanel();
        jlTuristaTitle = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jtFullName = new javax.swing.JTextField();
        jtEdad = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlCrearModificarTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlControles = new javax.swing.JLabel();
        tbId = new javax.swing.JTextField();
        jlDNI = new javax.swing.JLabel();
        jlEdad = new javax.swing.JLabel();
        jlFullName = new javax.swing.JLabel();

        jlTuristaTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTuristaTitle.setForeground(new java.awt.Color(51, 51, 255));
        jlTuristaTitle.setText("Turista");

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

        jbBuscar.setText("Buscar!");
        jbBuscar.setToolTipText("");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar!");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir!");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlCrearModificarTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCrearModificarTitle.setForeground(new java.awt.Color(51, 51, 255));
        jlCrearModificarTitle.setText("Crear/modificar");

        jlControles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlControles.setForeground(new java.awt.Color(51, 51, 255));
        jlControles.setText("Controles");

        tbId.setBackground(new java.awt.Color(255, 255, 255));
        tbId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbId.setForeground(new java.awt.Color(255, 255, 255));
        tbId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbId.setEnabled(false);
        tbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIdActionPerformed(evt);
            }
        });

        jlDNI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(71, 107, 250));
        jlDNI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDNI.setText("DNI:");

        jlEdad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEdad.setForeground(new java.awt.Color(71, 107, 250));
        jlEdad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEdad.setText("EDAD:");

        jlFullName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlFullName.setForeground(new java.awt.Color(71, 107, 250));
        jlFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlFullName.setText("NOMBRE COMPLETO:");

        javax.swing.GroupLayout jpGeneralLayout = new javax.swing.GroupLayout(jpGeneral);
        jpGeneral.setLayout(jpGeneralLayout);
        jpGeneralLayout.setHorizontalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlTuristaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCrearModificarTitle)
                .addGap(26, 26, 26))
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(tbId)
                            .addComponent(jlEdad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFullName)
                                    .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpGeneralLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDNI)
                                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))))
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlControles)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpGeneralLayout.setVerticalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTuristaTitle)
                    .addComponent(jlCrearModificarTitle))
                .addGap(18, 18, 18)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jlDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEdad)
                    .addComponent(jlFullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jlControles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        TuristaData movimiento = new TuristaData();
        
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese el DNI del Turista a buscar:", "Buscar Turista", JOptionPane.PLAIN_MESSAGE);
        
        try {
            if (respuesta == null) {
                return;
            }
            int codigoBuscar = Integer.parseInt(respuesta);
            Turista encontrado = movimiento.buscarTurista(codigoBuscar);
            if (encontrado == null) {
                JOptionPane.showMessageDialog(null, "No se ha encontrado un Turista con el DNI ingersado",
                "Corrobore el DNI ingresado", JOptionPane.ERROR_MESSAGE);
                
            } else {
                tbId.setText(String.valueOf(encontrado.getIdTurista()));
                jtDNI.setText(String.valueOf(encontrado.getDocumento()));
                jtFullName.setText(encontrado.getFullName());
                jtEdad.setText(String.valueOf(encontrado.getEdad()));
            }
            
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la informacion ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
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
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEdadActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        if (tbId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Busque el turista que quiera eliminar",
            "No se ha encontrado el turista seleccionado", JOptionPane.ERROR_MESSAGE);
        }else {
                
                TuristaData movimiento = new TuristaData();
                
                int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar El Turista seleccionado?"
                    ,"Eliminar Turista"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int turistaEliminar = Integer.parseInt(tbId.getText());
                    movimiento.eliminarTurista(turistaEliminar);
                }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void tbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIdActionPerformed

    
    private void Nuevo(){
        tbId.setText("");
        jtDNI.setText("");
        jtFullName.setText("");
        jtEdad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlControles;
    private javax.swing.JLabel jlCrearModificarTitle;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlTuristaTitle;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtFullName;
    private javax.swing.JTextField tbId;
    // End of variables declaration//GEN-END:variables
}
