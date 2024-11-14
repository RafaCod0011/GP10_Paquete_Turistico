package Vistas;

import accesoADatos.PaqueteData;
import accesoADatos.TuristaData;
import entidades.Paquete;
import entidades.Turista;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;  
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class FormTurista extends javax.swing.JInternalFrame {
    
    public TuristaData tData;
    public PaqueteData pData;
    public ArrayList<Turista> listado = new ArrayList();
    public ArrayList<Paquete> paquetes = new ArrayList();
    public int id;
    
    Turista encontrado = new Turista();
    

    private DefaultTableModel modelo= new DefaultTableModel(){

    
        @Override
        public boolean isCellEditable(int f, int c){

            return false;
        }
    };
    private final DefaultTableModel modelo2= new DefaultTableModel(){

    
        @Override
        public boolean isCellEditable(int f, int c){

            return false;
        }
    };
    
    public FormTurista() {
        
        initComponents();
        tData = new TuristaData();
        pData = new PaqueteData();
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTurista = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tbId = new javax.swing.JTextField();
        jlEmpresa3 = new javax.swing.JLabel();
        jtFullName = new javax.swing.JTextField();
        jlEmpresa1 = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jlEmpresa2 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        lbTransportes1 = new javax.swing.JLabel();
        lbTransportesRecorridos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbGuardar1 = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tPaquetes = new javax.swing.JTable();
        lbTransportes2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);

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

        jlEmpresa3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmpresa3.setForeground(new java.awt.Color(71, 107, 250));
        jlEmpresa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEmpresa3.setText("Apellido y Nombres:");

        jtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFullNameActionPerformed(evt);
            }
        });

        jlEmpresa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmpresa1.setForeground(new java.awt.Color(71, 107, 250));
        jlEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEmpresa1.setText("Edad:");

        jtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEdadActionPerformed(evt);
            }
        });

        jlEmpresa2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlEmpresa2.setForeground(new java.awt.Color(71, 107, 250));
        jlEmpresa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEmpresa2.setText("Documento:");

        jtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtFullName)
                    .addComponent(jlEmpresa3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtDNI)
                    .addComponent(jlEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtEdad)
                    .addComponent(jlEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEmpresa3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEmpresa2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEmpresa1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        lbTransportes1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes1.setForeground(new java.awt.Color(51, 51, 255));
        lbTransportes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes1.setText("Turistas Registrados");

        lbTransportesRecorridos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportesRecorridos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTransportesRecorridos.setText("Turistas");

        jbNuevo.setBackground(new java.awt.Color(100, 149, 237));
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/NuevoTurista.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar1.setBackground(new java.awt.Color(50, 205, 50));
        jbGuardar1.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ModificarTurista.png"))); // NOI18N
        jbGuardar1.setText("Guardar");
        jbGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardar1ActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(139, 0, 0));
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/EliminarTurista.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(245, 245, 245));
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Salir.png"))); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
        jScrollPane2.setViewportView(tPaquetes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );

        lbTransportes2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbTransportes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTransportes2.setText("Paquetes asociados al turista seleccionado");

        javax.swing.GroupLayout jpGeneralLayout = new javax.swing.GroupLayout(jpGeneral);
        jpGeneral.setLayout(jpGeneralLayout);
        jpGeneralLayout.setHorizontalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTransportes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGeneralLayout.createSequentialGroup()
                                .addComponent(lbTransportes1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTransportesRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jSeparator1)))
                    .addGroup(jpGeneralLayout.createSequentialGroup()
                        .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpGeneralLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpGeneralLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jpGeneralLayout.setVerticalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeneralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTransportesRecorridos)
                    .addComponent(lbTransportes1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbTransportes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                     //int transporteEliminar= Integer.parseInt(tbId.getText());
                    String mensaje = tData.eliminarTurista(turistaEliminar);
                    JOptionPane.showMessageDialog(this, mensaje);
                    tData.eliminarTurista(turistaEliminar);
                    Nuevo();
                }
            }
            Nuevo();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardar1ActionPerformed


    int respuesta = JOptionPane.showConfirmDialog(null,
        "Va a grabar los datos ingresados de un Turista ¿Está seguro/a?",
        "Nuevo Turista",
        JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            if (jtFullName.getText().isEmpty() || jtDNI.getText().isEmpty() || jtEdad.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete los datos del Turista a ingresar", "Atención", JOptionPane.ERROR_MESSAGE);
            } else {
                if(tbId.getText().isEmpty()) {
                    String fullName = jtFullName.getText();
                    int documento = Integer.parseInt(jtDNI.getText());
                    int edad = Integer.parseInt(jtEdad.getText());

                    encontrado = new Turista(0, documento, fullName, edad);
                    tData.guardarTurista(encontrado);

                    tbId.setText(String.valueOf(encontrado.getIdTurista()));

                    cargarTabla();
                    Nuevo();
                    encontrado = null;
                } else {
                    int idTurista = Integer.parseInt(tbId.getText());
                    Turista turistaActual = tData.buscarTuristaPorId(idTurista);

                    int documento = Integer.parseInt(jtDNI.getText());
                    String fullName = jtFullName.getText();
                    int edad = Integer.parseInt(jtEdad.getText());

                    if (turistaActual.getDocumento() == documento &&
                        turistaActual.getFullName().equals(fullName) &&
                        turistaActual.getEdad() == edad) { 
                        JOptionPane.showMessageDialog(this, "Debe modificar algún parámetro para editar", "Atención", JOptionPane.WARNING_MESSAGE);
                    } else {
                        encontrado = new Turista(idTurista, documento, fullName, edad);
                        tData.modificarTurista(encontrado);
                        
                    }
                    cargarTabla();
                    Nuevo();
                    encontrado = null;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            id = (int) tTurista.getValueAt(filaSeleccionada, 0);
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
            
        cargarTablaPaquetes();
            
    }
}
    
    
    private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Documento");
        modelo.addColumn("Apellido y Nombres");
        modelo.addColumn("Edad");
        tTurista.setModel(modelo);
        TableColumnModel columnModel = tTurista.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(20);  // "Documento"
        columnModel.getColumn(2).setPreferredWidth(100);  // "Nombre"
        columnModel.getColumn(3).setPreferredWidth(20);   // "Edad"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tTurista.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tTurista.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tTurista.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        tTurista.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
        
        JTableHeader header = tTurista.getTableHeader();
        DefaultTableCellRenderer rendererCentrado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        rendererCentrado.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        header.setDefaultRenderer(rendererCentrado);
        
                
        modelo2.addColumn("ID");
        modelo2.addColumn("Destino");
        modelo2.addColumn("Desde");
        modelo2.addColumn("Días");
        modelo2.addColumn("Monto");
        tPaquetes.setModel(modelo2);
        TableColumnModel columnModel2 = tPaquetes.getColumnModel();
        columnModel2.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel2.getColumn(1).setPreferredWidth(80);  // "Destino"
        columnModel2.getColumn(2).setPreferredWidth(30);  // "Desde"
        columnModel2.getColumn(3).setPreferredWidth(30);   // "Días"
        columnModel2.getColumn(4).setPreferredWidth(40);   // "Monto"
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tPaquetes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tPaquetes.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tPaquetes.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tPaquetes.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);    
   
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tPaquetes.getColumnModel().getColumn(4).setCellRenderer(rightRenderer); 
        
        JTableHeader header2 = tPaquetes.getTableHeader();
        DefaultTableCellRenderer rendererCentrado2 = (DefaultTableCellRenderer) header2.getDefaultRenderer();
        rendererCentrado2.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        header2.setDefaultRenderer(rendererCentrado2);
        
    }
    
    private void cargarTabla(){
        
        limpiarTabla();
        listado = (ArrayList) tData.listarTurista();
        for (Turista t : listado) {
            modelo.addRow(new Object[] {t.getIdTurista(),t.getDocumento(),t.getFullName(), t.getEdad()});
        }
     }
    
    private void cargarTablaPaquetes(){
        
        limpiarTablaPaquetes();
        paquetes = (ArrayList) pData.listarPaquetesXTurista(id);
        for (Paquete p : paquetes) {
            long cantidadDeDias = p.getFechaDesde().until(p.getFechaHasta(), ChronoUnit.DAYS);
            modelo2.addRow(new Object[] {
                p.getIdPaquete(),
                p.getCiudadDestino().getNombre(),
                p.getFechaDesde(),
                cantidadDeDias,
                String.format("$%.2f", p.getMontoTotal())
            });
        }
     }
    
    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }
    
    private void limpiarTablaPaquetes(){

        int indice= modelo2.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo2.removeRow(i);
        }
    }

    
    private void Nuevo(){
        tbId.setText("");
        jtDNI.setText("");
        jtFullName.setText("");
        jtEdad.setText("");
        limpiarTablaPaquetes();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar1;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlEmpresa1;
    private javax.swing.JLabel jlEmpresa2;
    private javax.swing.JLabel jlEmpresa3;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtFullName;
    private javax.swing.JLabel lbTransportes1;
    private javax.swing.JLabel lbTransportes2;
    private javax.swing.JLabel lbTransportesRecorridos;
    private javax.swing.JTable tPaquetes;
    private javax.swing.JTable tTurista;
    private javax.swing.JTextField tbId;
    // End of variables declaration//GEN-END:variables
}
