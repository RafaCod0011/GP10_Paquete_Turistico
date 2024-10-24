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
    Turista encontrada= new Turista();

    public FormTurista() {
        initComponents();
        this.setTitle("Formulario Turista");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpGeneral = new javax.swing.JPanel();
        jlTuristaTitle = new javax.swing.JLabel();
        LineaSeparadora = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jlDNI = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jlFullName = new javax.swing.JLabel();
        jtFullName = new javax.swing.JTextField();
        jlEdad = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jlTuristaTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlTuristaTitle.setText("Turista");

        LineaSeparadora.setText("_____________________________________________________________________________________________________________________________________");

        jlID.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlID.setText("ID:");

        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });

        jlDNI.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlDNI.setText("Dni:");

        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });

        jlFullName.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlFullName.setText("Nombre Completo:");

        jtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFullNameActionPerformed(evt);
            }
        });

        jlEdad.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlEdad.setText("Edad:");

        jtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEdadActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/chat_bubbles_messages_conversation_icon_264209.png"))); // NOI18N
        jbBuscar.setText("Buscar!");
        jbBuscar.setToolTipText("");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/invite_envelope_letter_inbox_icon_264211.png"))); // NOI18N
        jbGuardar.setText("Guardar!");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/chat_contact_conversation_message_icon_264218.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/mailbox_icon_264215.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/mail_open_open_envelope_icon_264213.png"))); // NOI18N
        jbSalir.setText("Salir!");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpGeneralLayout = new javax.swing.GroupLayout(jpGeneral);
        jpGeneral.setLayout(jpGeneralLayout);
        jpGeneralLayout.setHorizontalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LineaSeparadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jlTuristaTitle))
                    .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbBuscar)
                        .addGroup(jpGeneralLayout.createSequentialGroup()
                            .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpGeneralLayout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addComponent(jlFullName))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlID)
                                            .addComponent(jlDNI))
                                        .addComponent(jlEdad, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGap(29, 29, 29)
                            .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(jtDNI)
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpGeneralLayout.setVerticalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlTuristaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineaSeparadora)
                .addGap(28, 28, 28)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlID)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFullName)
                    .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEdad)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDActionPerformed

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNIActionPerformed

    private void jtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFullNameActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

    if (jtDNI.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Ingrese el Documento a buscar en el campo correspondiente", "Atención", JOptionPane.ERROR_MESSAGE);
    jtDNI.requestFocus();
} else {
    try {
        int documentoBuscar = Integer.parseInt(jtDNI.getText());
        
        String edadText = jtEdad.getText();
        int edadBuscar = edadText.isEmpty() ? -1 : Integer.parseInt(edadText); // -1 indica que no se busca por edad

        Turista encontrada = (edadBuscar == -1) ? 
            turistaData.buscarTurista(documentoBuscar) : 
            turistaData.buscarTuristaPorEdad(documentoBuscar, edadBuscar);
        
        if (encontrada == null) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado un turista con el documento" +
                    (edadBuscar != -1 ? " y edad ingresados" : "") + ".", "Corrobore la información", JOptionPane.ERROR_MESSAGE);
        } else {
            jtID.setText(String.valueOf(encontrada.getIdTurista()));
            jtDNI.setText(String.valueOf(encontrada.getDocumento()));
            jtFullName.setText(encontrada.getFullName());
            jtEdad.setText(String.valueOf(encontrada.getEdad()));
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Corrobore la información ingresada", "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
    }
    }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null
        , "Va a grabar los datos ingresados del turista. ¿Está Seguro/a?"
        , "Grabar Turista"
        , JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            if (jtFullName.getText().isEmpty() || jtDNI.getText().isEmpty() || jtEdad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete los datos del Turista", "Atención", JOptionPane.ERROR_MESSAGE);
            } else {
                int documento = Integer.parseInt(jtDNI.getText());
                int edad = Integer.parseInt(jtEdad.getText());

                Turista encontrada = turistaData.buscarTurista(documento);
                if (encontrada == null) {
                    encontrada = new Turista(0, documento, jtFullName.getText(), edad); // ID temporal, se asigna al guardar
                    turistaData.guardarTurista(encontrada);
                    jtID.setText(String.valueOf(encontrada.getIdTurista())); // Muestra el ID después de guardar
                } else {
                    encontrada.setFullName(jtFullName.getText());
                    encontrada.setEdad(edad);
                    turistaData.modificarTurista(encontrada);
                }
                Nuevo();
                encontrada = null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Corrobore la información ingresada", "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEdadActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (jtDNI.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Busque el turista que quiera eliminar",
            "No se ha encontrado el turista seleccionado", JOptionPane.ERROR_MESSAGE);
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null
            , "¿Estas seguro/a de eliminar el turista seleccionado?"
            , "Eliminar Turista"
            , JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            int documentoEliminar = Integer.parseInt(jtDNI.getText());
            turistaData.eliminarTurista(documentoEliminar);
            Nuevo();
        }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    
    private void Nuevo(){
        jtID.setText("");
        jtDNI.setText("");
        jtFullName.setText("");
        jtEdad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LineaSeparadora;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlTuristaTitle;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtFullName;
    private javax.swing.JTextField jtID;
    // End of variables declaration//GEN-END:variables
}
