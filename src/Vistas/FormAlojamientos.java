
package Vistas;
import entidades.Alojamiento;
import entidades.Habitacion;
import entidades.Ciudad;
import accesoADatos.AlojamientoData;
import accesoADatos.CiudadData;
import accesoADatos.HabitacionData;
import entidades.Transporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;




public class FormAlojamientos extends javax.swing.JInternalFrame {
public ArrayList<Alojamiento> listado = new ArrayList();
public AlojamientoData alo= new AlojamientoData();
public Alojamiento nuevoAlojamiento= new Alojamiento();



    private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};
   
   
    public FormAlojamientos() {
        initComponents();
        cargarComboCiudades();
        armarCabecera();
        cargarTabla();
        cbTipo.setSelectedItem(null);
        cbCiudad.setSelectedItem(null);
        
        ListSelectionModel modeloS = jtAlojamientos.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = jtAlojamientos.getSelectedRow();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        txDireccion = new javax.swing.JTextField();
        txPrecio = new javax.swing.JTextField();
        cbCiudad = new javax.swing.JComboBox<>();
        rbActivo = new javax.swing.JRadioButton();
        txCapacidad = new javax.swing.JTextField();
        txCamas = new javax.swing.JTextField();
        txBaños = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlojamientos = new javax.swing.JTable();
        tbId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        JLAlumno = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 107, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ciudad:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 107, 250));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Activo:");

        txNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(71, 107, 250))); // NOI18N

        txDireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dirección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(71, 107, 250))); // NOI18N

        txPrecio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Precio por noche", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(71, 107, 250))); // NOI18N

        cbCiudad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        rbActivo.setBorder(null);

        txCapacidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txCapacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txCapacidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Capacidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(71, 107, 250))); // NOI18N

        txCamas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txCamas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txCamas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Camas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(71, 107, 250))); // NOI18N

        txBaños.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txBaños.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txBaños.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Baños", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(71, 107, 250))); // NOI18N

        cbTipo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel", "Hostel", "Cabaña" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 107, 250));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tipo:");

        jtAlojamientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAlojamientos);

        tbId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbId.setForeground(new java.awt.Color(51, 51, 255));
        tbId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbId.setEnabled(false);

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

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        JLAlumno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(51, 51, 255));
        JLAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLAlumno.setText("Agregar y Modificar Alojamientos.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(JLAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(rbActivo)
                                        .addGap(14, 14, 14))
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txBaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbActivo)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Listado de alojamientos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(392, 392, 392))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
         Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        if (jtAlojamientos.isEnabled()){
            int filaSeleccionada = jtAlojamientos.getSelectedRow();

            if (filaSeleccionada != -1) { 
                    int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar el alojamiento seleccionado?"
                    ,"Eliminar Alojamiento"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int alojamientoEliminar= (int) jtAlojamientos.getValueAt(filaSeleccionada, 0);
                    String mensaje = alo.eliminarAlojamiento(alojamientoEliminar);
                    JOptionPane.showMessageDialog(this, mensaje);
                    cargarTabla();
                    Nuevo();
                }
            }
        }    
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       guardarAlojamiento();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        
        String tipoAlojamiento = (String) cbTipo.getSelectedItem();
//        habilitarCamposHabitacion("Hostel".equals(tipoAlojamiento));
        
    }//GEN-LAST:event_cbTipoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

//private void habilitarCamposHabitacion(boolean habilitar) {
//        txNumHab.setEnabled(habilitar);
//        txPlanta.setEnabled(habilitar);
//        txCupo.setEnabled(habilitar);
//        rbEstado.setEnabled(habilitar);
//    }    
    
private void guardarAlojamiento() {
    
    
    int respuesta = JOptionPane.showConfirmDialog(this
            ,"Va a grabar los datos ingresados del Alojamiento. ¿Esta Seguro/a?"
            ,"Grabar Datos del Alojamiento."
            ,JOptionPane.YES_NO_OPTION);
    
    if(respuesta == JOptionPane.YES_OPTION){
    
   try{
       if(cbTipo.getSelectedIndex()==-1||txNombre.getText().isEmpty()||txDireccion.getText().isEmpty()||
       cbCiudad.getSelectedIndex()==-1||txPrecio.getText().isEmpty()||txCapacidad.getText().isEmpty()||
       txBaños.getText().isEmpty()){
       JOptionPane.showMessageDialog(this, "Complete los datos del Alojamiento","Atención", JOptionPane.ERROR_MESSAGE);
   }else{
           if(tbId.getText().isEmpty()){
           String tipoAlojamiento = cbTipo.getSelectedItem().toString(); 
           String nombre = txNombre.getText();  
           String direccion = txDireccion.getText();  
    
           Ciudad ciudad = (Ciudad) cbCiudad.getSelectedItem();  
    
           double precioNoche = Double.parseDouble(txPrecio.getText());  
           boolean activo = rbActivo.isSelected();  
           int capacidad = Integer.parseInt(txCapacidad.getText());  
           int camas = Integer.parseInt(txCamas.getText());  
           int banios = Integer.parseInt(txBaños.getText());  

    
           nuevoAlojamiento = new Alojamiento(0, tipoAlojamiento, nombre, direccion, ciudad, precioNoche, activo, capacidad, camas, banios);
           alo.agregarAlojamiento(nuevoAlojamiento);
           
           tbId.setText(String.valueOf(nuevoAlojamiento.getIdAlojamiento()));
           
           }else{
               
           int idAlojamiento = Integer.parseInt(tbId.getText());
           Alojamiento alojamientoActual = alo.buscarAlojamientoPorId(idAlojamiento);
              
           String tipoAlojamiento = cbTipo.getSelectedItem().toString(); 
           String nombre = txNombre.getText();  
           String direccion = txDireccion.getText();  
    
           Ciudad ciudad = (Ciudad) cbCiudad.getSelectedItem();  
    
           double precioNoche = Double.parseDouble(txPrecio.getText());  
           boolean activo = rbActivo.isSelected();  
           int capacidad = Integer.parseInt(txCapacidad.getText());  
           int camas = Integer.parseInt(txCamas.getText());  
           int banios = Integer.parseInt(txBaños.getText()); 
              
               if(alojamientoActual.getTipoAlojamiento().equals(tipoAlojamiento) &&
                   alojamientoActual.getNombre().equals(nombre) &&
                   alojamientoActual.getDireccion().equals(direccion) &&
                   alojamientoActual.getCiudad().getIdCiudad() == ciudad.getIdCiudad() &&
                   alojamientoActual.getPrecioNoche() == precioNoche &&
                   alojamientoActual.isActivo() == activo &&
                   alojamientoActual.getCapacidad() == capacidad &&
                   alojamientoActual.getCamas() == camas &&
                   alojamientoActual.getBanios() == banios){
                   JOptionPane.showMessageDialog(this, "Debe modificar algún parámetro para editar", "Atención", JOptionPane.WARNING_MESSAGE);
           }else{
                   nuevoAlojamiento = new Alojamiento(idAlojamiento, tipoAlojamiento, nombre, direccion, ciudad, precioNoche, activo, capacidad, camas, banios);
                   alo.modificarAlojamiento(nuevoAlojamiento);
                   JOptionPane.showMessageDialog(null, "Alojamiento modificado correctamente");
               }
           
           cargarTabla();
           Nuevo();
           nuevoAlojamiento = null;
       }
       }
    }catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Error al guardar el alojamiento: " + e.getMessage());
   
}
   
}
}

private void cargarComboCiudades() {
    CiudadData ciudadData = new CiudadData();
    List<Ciudad> listaCiudades = ciudadData.listarCiudades();  

    
    cbCiudad.removeAllItems();

    
    for (Ciudad ciudad : listaCiudades) {
        cbCiudad.addItem(ciudad);  
    }
}

private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }

private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Tipo Alojamiento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Precio");
        modelo.addColumn("Activo");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Camas");
        modelo.addColumn("Baños");
        
        
        jtAlojamientos.setModel(modelo);
        
        TableColumnModel columnModel = jtAlojamientos.getColumnModel();

        
        columnModel.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Tipo"
        columnModel.getColumn(2).setPreferredWidth(80);  // "Nombre"
        columnModel.getColumn(3).setPreferredWidth(80);   // "Direccion"
        columnModel.getColumn(4).setPreferredWidth(50);  // "Ciudad"
        columnModel.getColumn(5).setPreferredWidth(10);  // "Precio"
        columnModel.getColumn(6).setPreferredWidth(10); //"Activo"
        columnModel.getColumn(7).setPreferredWidth(40); // "Capacidad"
        columnModel.getColumn(8).setPreferredWidth(10); // "Camas"
        columnModel.getColumn(9).setPreferredWidth(10); // "Baños"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        
        jtAlojamientos.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
    }

private void cargarTabla(){
    limpiarTabla();
    listado = (ArrayList) alo.listarTodos();
    for(Alojamiento a:listado){
        modelo.addRow(new Object[]{a.getIdAlojamiento(),a.getTipoAlojamiento(),a.getNombre(),a.getDireccion(),a.getCiudad(),a.getPrecioNoche(),a.isActivo(),a.getCapacidad(),a.getCamas(),a.getBanios()});
    }
    
}

private void leerTabla(){
    
    int filaSeleccionada = jtAlojamientos.getSelectedRow();
    
    int id = (int) jtAlojamientos.getValueAt(filaSeleccionada, 0);
    tbId.setText(String.valueOf(id));
    
    cbTipo.setSelectedItem(jtAlojamientos.getValueAt(filaSeleccionada, 1));
    
    String nombre = (String) jtAlojamientos.getValueAt(filaSeleccionada, 2);
    txNombre.setText(nombre);
    String direccion = (String) jtAlojamientos.getValueAt(filaSeleccionada, 3);
    txDireccion.setText(direccion);
    cbCiudad.setSelectedItem(jtAlojamientos.getValueAt(filaSeleccionada, 4));
    
    double precio= (double) jtAlojamientos.getValueAt(filaSeleccionada, 5);
    txPrecio.setText(String.valueOf(precio));
    
    boolean disponible = (boolean) jtAlojamientos.getValueAt(filaSeleccionada, 6);
    rbActivo.setSelected(disponible);
    
    int capacidad = (int) jtAlojamientos.getValueAt(filaSeleccionada, 7);
    txCapacidad.setText(String.valueOf(capacidad));
    
    int camas = (int) jtAlojamientos.getValueAt(filaSeleccionada, 8);
    txCamas.setText(String.valueOf(camas));
    
    int banos = (int) jtAlojamientos.getValueAt(filaSeleccionada, 9);
    txBaños.setText(String.valueOf(banos));
    
}

private void Nuevo(){
        
        
        jtAlojamientos.clearSelection(); 
        cbTipo.setSelectedItem(null);
        cbCiudad.setSelectedItem(null);
        tbId.setText("");
        txNombre.setText("");
        txDireccion.setText("");
        txPrecio.setText("");
        rbActivo.setSelected(false);
        txCapacidad.setText(""); 
        txCamas.setText("");
        txBaños.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JComboBox<Ciudad> cbCiudad;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtAlojamientos;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JTextField tbId;
    private javax.swing.JTextField txBaños;
    private javax.swing.JTextField txCamas;
    private javax.swing.JTextField txCapacidad;
    private javax.swing.JTextField txDireccion;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txPrecio;
    // End of variables declaration//GEN-END:variables
}
