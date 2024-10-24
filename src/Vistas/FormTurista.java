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
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addComponent(LineaSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                                .addComponent(jlEdad)
                                .addGap(169, 169, 169)
                                .addComponent(jlFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpGeneralLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jlID)
                                    .addGap(220, 220, 220)
                                    .addComponent(jlDNI))
                                .addGroup(jpGeneralLayout.createSequentialGroup()
                                    .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtID)
                                        .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(76, 76, 76)
                                    .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbBuscar))))))
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
                        .addGap(241, 241, 241)
                        .addComponent(jlTuristaTitle)))
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
                    .addComponent(jlDNI)
                    .addComponent(jlID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFullName)
                    .addComponent(jlEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
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
            .addComponent(jpGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                jtID.setText(String.valueOf(encontrado.getIdTurista()));
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
            ,"Va a grabar un nuevo Turista ¿Esta seguro/a?"
            ,"Nuevo Turista"
            ,JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
    
            try {

                    if (jtFullName.getText().isEmpty() || jtEdad.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Complete los datos del Turista a ingresar","Atención", JOptionPane.ERROR_MESSAGE);
                    }else{
                        int documento = Integer.parseInt(jtDNI.getText());
                        int edad= Integer.parseInt(jtEdad.getText());
                        Turista turistaNuevo = new Turista(documento ,jtFullName.getText(), edad);
                        movimiento.guardarTurista(turistaNuevo);

                        //Asignamos el ID al CODIGO
                        jtID.setText(String.valueOf(turistaNuevo.getIdTurista()));
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
        
        if (jtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Busque el turista que quiera eliminar",
            "No se ha encontrado el turista seleccionado", JOptionPane.ERROR_MESSAGE);
        }else {
                
                TuristaData movimiento = new TuristaData();
                
                int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar El Turista seleccionado?"
                    ,"Eliminar Turista"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int turistaEliminar = Integer.parseInt(jtID.getText());
                    movimiento.eliminarTurista(turistaEliminar);
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
