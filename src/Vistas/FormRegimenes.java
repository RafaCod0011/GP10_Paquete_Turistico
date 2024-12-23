package Vistas;

import accesoADatos.RegimenData;
import entidades.Regimen;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormRegimenes extends javax.swing.JInternalFrame {
    
    public RegimenData rData;
    public ArrayList<Regimen> listadoR;
    Regimen regimen = new Regimen();
    
    
    
    
    private DefaultTableModel modelo= new DefaultTableModel(){

    
        @Override
        public boolean isCellEditable(int f, int c){

            return false;
        }
    };

    public FormRegimenes() {
        
        initComponents();

        rData= new RegimenData();

        armarCabecera();
        cargaTabla(); // cargar después de inicializar rData y listadoR

        // Configuración del selector de filas
        ListSelectionModel modeloS = jtRegimenes.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = jtRegimenes.getSelectedRow();
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

        jpGeneral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlListRegimenes = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRegimenes = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jlDenominacion = new javax.swing.JLabel();
        jlCargoExtra = new javax.swing.JLabel();
        tfDenominacion = new javax.swing.JTextField();
        tfCargoExtra = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        tbId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jlListRegimenes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlListRegimenes.setForeground(new java.awt.Color(51, 51, 255));
        jlListRegimenes.setText("Lista de Regimenes");

        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTitle.setText("Regimenes");

        jtRegimenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtRegimenes);

        jbEliminar.setBackground(new java.awt.Color(139, 0, 0));
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RedondoEliminar.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(50, 205, 50));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RedondoNuevo.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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

        jlDenominacion.setBackground(new java.awt.Color(71, 107, 250));
        jlDenominacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlDenominacion.setForeground(new java.awt.Color(71, 107, 250));
        jlDenominacion.setText("Denominacion:");

        jlCargoExtra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCargoExtra.setForeground(new java.awt.Color(71, 107, 250));
        jlCargoExtra.setText("Cargo Extra:");

        jbNuevo.setBackground(new java.awt.Color(100, 149, 237));
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RedondoNuevo.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addGap(12, 12, 12)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlListRegimenes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jlCargoExtra)
                        .addGap(18, 18, 18)
                        .addComponent(tfCargoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlDenominacion)
                        .addGap(18, 18, 18)
                        .addComponent(tfDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitle)
                    .addComponent(jlListRegimenes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDenominacion)
                    .addComponent(tfDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCargoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCargoExtra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpGeneralLayout = new javax.swing.GroupLayout(jpGeneral);
        jpGeneral.setLayout(jpGeneralLayout);
        jpGeneralLayout.setHorizontalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpGeneralLayout.setVerticalGroup(
            jpGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void leerTabla() { 
    int filaSeleccionada = jtRegimenes.getSelectedRow();

    if (filaSeleccionada != -1) {
            // ID
            int id = (int) jtRegimenes.getValueAt(filaSeleccionada, 0);
            String code = String.valueOf(id);
            tbId.setText(code); // Mostrar el ID en el campo tbId

            // NOMBRE DEL REGIMEN
            String denominacion = (String) jtRegimenes.getValueAt(filaSeleccionada, 1); 
            tfDenominacion.setText(denominacion);

            // CARGO EXTRA
            double cargoExtra = (double) jtRegimenes.getValueAt(filaSeleccionada, 2);
            tfCargoExtra.setText(String.valueOf(cargoExtra));
    }
    }

    
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (jtRegimenes.isEnabled()){
            int filaSeleccionada = jtRegimenes.getSelectedRow();

            if (filaSeleccionada != -1) { 
                    int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar el Regimen seleccionado?"
                    ,"Eliminar Regimen"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int regimenEliminar = (int) jtRegimenes.getValueAt(filaSeleccionada, 0);
                    String mensaje = rData.eliminarRegimen(regimenEliminar);
                    JOptionPane.showMessageDialog(this, mensaje);
                    
                }
            }
            Nuevo();
            cargaTabla();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

       int respuesta = JOptionPane.showConfirmDialog(null,
        "Va a guardar los datos ingresados del Régimen. ¿Está seguro/a?",
        "Guardar Régimen",
        JOptionPane.YES_NO_OPTION);

    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            if (tfDenominacion.getText().isEmpty() || tfCargoExtra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete los datos del Régimen a ingresar", "Atención", JOptionPane.ERROR_MESSAGE);
            } else {
                String denominacion = tfDenominacion.getText();
                double cargoExtra = Double.parseDouble(tfCargoExtra.getText());

                if (tbId.getText().isEmpty()) {
                    // Nuevo régimen
                    regimen = new Regimen(denominacion, cargoExtra);
                    rData.agregarRegimenes(regimen);
                    tbId.setText(String.valueOf(regimen.getIdRegimen()));
                    Nuevo();
                    cargaTabla();
                    regimen = null;

                } else {
                    // Editar régimen existente
                    int idRegimen = Integer.parseInt(tbId.getText());
                    Regimen regimenActual = rData.buscarRegimenes(idRegimen);

                    if (regimenActual != null) {
                        if (regimenActual.getCargoExtra() == cargoExtra && regimenActual.getDenominacion().equals(denominacion)) {
                            JOptionPane.showMessageDialog(null, "Debe modificar algún parámetro para continuar", "Atención", JOptionPane.ERROR_MESSAGE);
                        } else {
                            regimen = new Regimen(idRegimen, denominacion, cargoExtra);
                            rData.editarRegimen(regimen);
                            cargaTabla();
                            Nuevo();
                            regimen = null;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el régimen para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void tbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIdActionPerformed

    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Denominacion");
        modelo.addColumn("Cargo Extra");
        
        jtRegimenes.setModel(modelo);
        
        TableColumnModel columnModel = jtRegimenes.getColumnModel();
        
         //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(1);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Denominacion"
        columnModel.getColumn(2).setPreferredWidth(80);  // "CargoExtra"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        jtRegimenes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }

    
    private void cargaTabla(){
    
        limpiarTabla();    
        listadoR = (ArrayList) rData.listarRegimenes();
        for (Regimen m: listadoR) {
                modelo.addRow(new Object[] {m.getIdRegimen(),m.getDenominacion(),m.getCargoExtra()});
        } 
        jtRegimenes.revalidate();
        jtRegimenes.repaint();
    }
    
    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }
    
    private void Nuevo(){
        jtRegimenes.clearSelection(); 
        tfDenominacion.setText("");
        tfCargoExtra.setText("");
        tbId.setText("");
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCargoExtra;
    private javax.swing.JLabel jlDenominacion;
    private javax.swing.JLabel jlListRegimenes;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTable jtRegimenes;
    private javax.swing.JTextField tbId;
    private javax.swing.JTextField tfCargoExtra;
    private javax.swing.JTextField tfDenominacion;
    // End of variables declaration//GEN-END:variables
}
