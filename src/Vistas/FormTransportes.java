
package Vistas;

import accesoADatos.TransporteData;
import entidades.Ciudad;
import entidades.Transporte;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class FormTransportes extends javax.swing.JInternalFrame {
public TransporteData tData = new TransporteData();
public ArrayList<Transporte> listado = new ArrayList();
    
private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};
    
public FormTransportes() {
        
        initComponents();
        armarCabecera();
        cargarTabla();
        cbTipoTransporte.setSelectedItem(null);
//        JOptionPane.showMessageDialog(null, "Tipo " + tipo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        JLAlumno = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTransportes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        tbId = new javax.swing.JTextField();
        tbEmpresa = new javax.swing.JTextField();
        cbCiudadHasta = new javax.swing.JComboBox<>();
        cbCiudadDesde = new javax.swing.JComboBox<>();
        jldesde = new javax.swing.JLabel();
        cbTipoTransporte = new javax.swing.JComboBox();
        tbPrecio = new javax.swing.JTextField();
        jlEmpresa1 = new javax.swing.JLabel();
        jlEmpresa2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btEliminar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Desde la ciudad:");

        JLAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLAlumno.setForeground(new java.awt.Color(51, 51, 255));
        JLAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLAlumno.setText("TRANSPORTES");

        jSeparator2.setMaximumSize(new java.awt.Dimension(31767, 31767));
        jSeparator2.setName(""); // NOI18N

        tTransportes.setModel(new javax.swing.table.DefaultTableModel(
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
        tTransportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTransportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tTransportes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbId.setForeground(new java.awt.Color(51, 51, 255));
        tbId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 8))); // NOI18N
        tbId.setEnabled(false);

        tbEmpresa.setBackground(new java.awt.Color(214, 217, 223));
        tbEmpresa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa Prestadora del Servicio de Transporte", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        cbCiudadHasta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbCiudadHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadHastaActionPerformed(evt);
            }
        });

        cbCiudadDesde.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbCiudadDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadDesdeActionPerformed(evt);
            }
        });

        jldesde.setForeground(new java.awt.Color(51, 51, 255));
        jldesde.setText("Tipo:");

        cbTipoTransporte.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbTipoTransporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Avion", "Colectivo", "Auto" }));
        cbTipoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoTransporteActionPerformed(evt);
            }
        });

        tbPrecio.setBackground(new java.awt.Color(214, 217, 223));
        tbPrecio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio de Venta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        jlEmpresa1.setForeground(new java.awt.Color(51, 51, 255));
        jlEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmpresa1.setText("Desde:");

        jlEmpresa2.setForeground(new java.awt.Color(51, 51, 255));
        jlEmpresa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEmpresa2.setText("Hasta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jlEmpresa1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbCiudadDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlEmpresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbCiudadHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jldesde)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbCiudadDesde, cbCiudadHasta});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCiudadHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmpresa2)
                    .addComponent(cbCiudadDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmpresa1)
                    .addComponent(jldesde)
                    .addComponent(cbTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tbEmpresa, tbPrecio});

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btEliminar, btGuardar, btNuevo, btSalir});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btEliminar, btGuardar, btNuevo, btSalir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, Short.MAX_VALUE)
                        .addComponent(JLAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Nuevo(){
        
        tTransportes.clearSelection(); // Sacamos cualquier seleccion de la tabla
        cbTipoTransporte.setSelectedItem(null);
        tbEmpresa.setText("");
        tbPrecio.setText("");

    }
    
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        
        if (tTransportes.isEnabled()){
            int filaSeleccionada = tTransportes.getSelectedRow();

            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada
                    int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar el transporte seleccionado?"
                    ,"Eliminar Transporte"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int transporteEliminar= Integer.parseInt(tbId.getText());
                    tData.eliminarTransporte(transporteEliminar);
                    Nuevo();
                }
            }
        }    
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

               
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar los datos ingresados del Transporte. ¿Esta Seguro/a?"
            ,"Grabar Alumno"
            ,JOptionPane.YES_NO_OPTION);
        
        if(respuesta == JOptionPane.YES_OPTION){  
            try{
                if(tbEmpresa.getText().isEmpty()||tbPrecio.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete los datos del Transporte","Atención", JOptionPane.ERROR_MESSAGE);
                }else{
  
                    //DEBEMOS DETECTAR SI ES NUEVO O MODIFICACION
                    
                    
                    
//                    int documento = Integer.parseInt(tbDNI.getText());

                    // Buscamos el alumno por DNI
//                    encontrada = movimientos.buscarAlumnoPorDni(documento);
//                    if (encontrada == null) {
//                        //Nuevo Alumno
//                        encontrada = new Alumno(documento, tbNombre.getText(), tbApellido.getText(), fechanac, jrEstado.isSelected());
//                        movimientos.guardarAlumno(encontrada);
//                        tbID.setText(String.valueOf(encontrada.getIdAlumno()));
//                    } else {
//                        //Alumno a modificar
//                        encontrada.setNombre(tbNombre.getText());
//                        encontrada.setApellido(tbApellido.getText());
//                        encontrada.setFechaNacimiento(fechanac);
//                        encontrada.setActivo(jrEstado.isSelected());
//                        movimientos.modificarAlumno(encontrada);
//                    }
//
//                    Nuevo(); 
//                    encontrada = null; 
                    
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void tTransportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTransportesMouseClicked
            
        if (tTransportes.isEnabled()){
            int filaSeleccionada = tTransportes.getSelectedRow();

            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada
                
                //Cargamos los valores de la tabla en los campos    
                
                //ID
                int id = (int) tTransportes.getValueAt(filaSeleccionada, 0);
                String code = String.valueOf(id);
                tbId.setText(code);
                //CIUDAD ORIGEN
                
                //CIUDAD DESTINO
                
                //TIPO
                String tipo = (String) tTransportes.getValueAt(filaSeleccionada, 3);
                cbTipoTransporte.setSelectedItem(tipo);

                cbTipoTransporte.repaint();
                
                //NOMBRE EMPRESA
                String nombre = (String) tTransportes.getValueAt(filaSeleccionada, 4);
                tbEmpresa.setText(nombre);

                
//                String descripcion = (String) tTransportes.getValueAt(filaSeleccionada, 1);
//                tbDescripcion.setText(descripcion);
//                String rubro = (String) tTransportes.getValueAt(filaSeleccionada, 2);
//                cbRubro.setSelectedItem(rubro);

                //PRECIO POR PERSONA
                double precio = (double) tTransportes.getValueAt(filaSeleccionada, 5);
                String prec = String.valueOf(precio);
                tbPrecio.setText(prec);

            }
        }
    
        
        
    }//GEN-LAST:event_tTransportesMouseClicked

    private void cbCiudadHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadHastaActionPerformed



    }//GEN-LAST:event_cbCiudadHastaActionPerformed

    private void cbCiudadDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCiudadDesdeActionPerformed

    private void cbTipoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoTransporteActionPerformed

    private void cargarTabla(){
    
        limpiarTabla();    
        listado = (ArrayList) tData.listarTransportes();
        for (Transporte m: listado) {
                modelo.addRow(new Object[] {m.getIdTransporte(),m.getCiudadOrigen(),m.getCiudadDestino(),m.getTipoTransporte(),m.getNombreEmpresaTransporte(),m.getPrecioPersona()});
        }
        
    } 
    
    
    private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Origen");
        modelo.addColumn("Destino");
        modelo.addColumn("Tipo");
        modelo.addColumn("Empresa");
        modelo.addColumn("Precio");
        
        
        tTransportes.setModel(modelo);
        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = tTransportes.getColumnModel();

        //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Origen"
        columnModel.getColumn(2).setPreferredWidth(80);  // "Destino"
        columnModel.getColumn(3).setPreferredWidth(30);   // "Tipo"
        columnModel.getColumn(4).setPreferredWidth(50);  // "Empresa"
        columnModel.getColumn(5).setPreferredWidth(10);  // "Precio"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplicar el renderizador a la segunda columna ID (índice 0)
        tTransportes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
    }

    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }
 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLAlumno;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Ciudad> cbCiudadDesde;
    private javax.swing.JComboBox<Ciudad> cbCiudadHasta;
    private javax.swing.JComboBox cbTipoTransporte;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlEmpresa1;
    private javax.swing.JLabel jlEmpresa2;
    private javax.swing.JLabel jldesde;
    private javax.swing.JTable tTransportes;
    private javax.swing.JTextField tbEmpresa;
    private javax.swing.JTextField tbId;
    private javax.swing.JTextField tbPrecio;
    // End of variables declaration//GEN-END:variables
}
