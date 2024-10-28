
package Vistas;

import accesoADatos.CiudadData;
import entidades.Ciudad;
import java.time.LocalDate;
import java.time.ZoneId;
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
    
public CiudadData cData = new CiudadData();
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
    JrbActivo.setSelected(false);
    jcInicioTemporada.setDate(null);
    jcFinTemporada.setDate(null);

    ListSelectionModel modeloS = tCiudades.getSelectionModel();
    modeloS.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int filaSeleccionada = tCiudades.getSelectedRow();
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

        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jcInicioTemporada = new com.toedter.calendar.JCalendar();
        jcFinTemporada = new com.toedter.calendar.JCalendar();
        jFechaFinTemporada = new javax.swing.JLabel();
        jFechaInicioTemporada = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btEliminar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        lbCiudades = new javax.swing.JLabel();
        lbCiudesRecorridas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCiudades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JrbActivo = new javax.swing.JRadioButton();

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Desde la ciudad:");

        jSeparator2.setMaximumSize(new java.awt.Dimension(31767, 31767));
        jSeparator2.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jFechaFinTemporada.setText("Fecha fin de temporada");

        jFechaInicioTemporada.setText("Fecha inicio de temporada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jcInicioTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcFinTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jFechaInicioTemporada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFechaFinTemporada)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFechaFinTemporada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFechaInicioTemporada, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcInicioTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcFinTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

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

        lbCiudades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCiudades.setForeground(new java.awt.Color(51, 51, 255));
        lbCiudades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCiudades.setText("Ciudades Disponibles:");

        lbCiudesRecorridas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCiudesRecorridas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCiudesRecorridas.setText("Ciudades");

        tCiudades.setModel(new javax.swing.table.DefaultTableModel(
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
        tCiudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCiudadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCiudades);

        jLabel1.setText("Nombre:");

        JtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Activo:");

        JrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrbActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(364, 364, 364)
                                        .addComponent(JrbActivo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCiudesRecorridas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCiudesRecorridas)
                    .addComponent(lbCiudades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JrbActivo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leerTabla() { 
    int filaSeleccionada = tCiudades.getSelectedRow();

    if (filaSeleccionada != -1) {
        
        // NOMBRE DE LA CIUDAD
        String nombre = (String) tCiudades.getValueAt(filaSeleccionada, 1); 
        JtNombre.setText(nombre);
        // INICIO DE LA TEMPORADA
        java.sql.Date inicioTemporada = (java.sql.Date) tCiudades.getValueAt(filaSeleccionada, 2); 
        jcInicioTemporada.setDate(java.util.Date.from(inicioTemporada.toLocalDate().atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant()));
        // FIN DE LA TEMPORADA
        java.sql.Date finTemporada = (java.sql.Date) tCiudades.getValueAt(filaSeleccionada, 3);
        jcFinTemporada.setDate(java.util.Date.from(finTemporada.toLocalDate().atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant()));
        // DESTINO ACTIVO
        boolean destinoActivo = (boolean) tCiudades.getValueAt(filaSeleccionada, 4);
        JrbActivo.setSelected(destinoActivo);
    }
}

    
    private void Nuevo(){
        tCiudades.clearSelection();
        JtNombre.setText("");
        JrbActivo.setSelected(false);
        jcInicioTemporada.setDate(null);
        jcFinTemporada.setDate(null);
    }
    
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        
        if (tCiudades.isEnabled()){
            int filaSeleccionada = tCiudades.getSelectedRow();

            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada
                    int respuesta = JOptionPane.showConfirmDialog(null
                    ,"¿Está seguro/a de Eliminar la ciudad seleccionada?"
                    ,"Eliminar Ciudad"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int ciudadEliminar = (int) tCiudades.getValueAt(filaSeleccionada, 0);
                    cData.eliminarCiudad(ciudadEliminar);
                    Nuevo();
                    cargarTabla();
                }
            }
        }    
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

               
        int respuesta = JOptionPane.showConfirmDialog(null
            ,"Va a grabar los datos ingresados de la ciudad. ¿Esta Seguro/a?"
            ,"Grabar datos de la Ciudad"
            ,JOptionPane.YES_NO_OPTION);
        
        if(respuesta == JOptionPane.YES_OPTION){  
            try{
                if(JtNombre.getText().isEmpty()||jcInicioTemporada.getDate() == null || jcFinTemporada.getDate() == null){
                    JOptionPane.showMessageDialog(null, "Complete los datos de la Ciudad","Atención", JOptionPane.ERROR_MESSAGE);
                }else{
  
                    String nombre = JtNombre.getText();
                    boolean activo = JrbActivo.isSelected();
                    LocalDate inicio = jcInicioTemporada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    LocalDate fin = jcFinTemporada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                    int filaSeleccionada = tCiudades.getSelectedRow();
                    
                    if(filaSeleccionada == -1){
                        Ciudad ciudad = new Ciudad(nombre, inicio, fin, activo);
                        cData.agregarCiudad(ciudad);
                    }else{
                     int idCiudad =(int)tCiudades.getValueAt(filaSeleccionada, 0);
                     Ciudad ciudad = new Ciudad(idCiudad, nombre, inicio, fin, activo);
                    }
                    
                    limpiarFormulario();
                    cargarTabla();
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                        "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    
    }//GEN-LAST:event_btGuardarActionPerformed

    private void limpiarFormulario() {
    tCiudades.clearSelection();
    JtNombre.setText("");
    JrbActivo.setSelected(false);
    jcInicioTemporada.setDate(null);
    jcFinTemporada.setDate(null);
}
    
    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void tCiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCiudadesMouseClicked
            
        if (tCiudades.isEnabled()){
            int filaSeleccionada = tCiudades.getSelectedRow();

            if (filaSeleccionada != -1) { 
                leerTabla();
                
            }
        }
    
        
        
    }//GEN-LAST:event_tCiudadesMouseClicked

    private void JtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtNombreActionPerformed

    private void JrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrbActivoActionPerformed

    
    private void cargarTabla(){
    
        limpiarTabla();    
        listado = (ArrayList) cData.listarCiudades();
        for (Ciudad m: listado) {
                modelo.addRow(new Object[] {m.getIdCiudad(),m.getNombre(),m.getFechaInicioTemporada(),m.getFechaFinTemporada(),m.getDestinoActivo()});
        }
        
    } 
       
    
    private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("FechaInicioTemporada");
        modelo.addColumn("FechaFinTemporada");
        modelo.addColumn("DestinoActivo");
        
        
        tCiudades.setModel(modelo);
        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = tCiudades.getColumnModel();

        //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(10);  // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Nombre"
        columnModel.getColumn(2).setPreferredWidth(80);  // "FechaInicioTemporada"
        columnModel.getColumn(3).setPreferredWidth(30);  // "FechaFinTemporada"
        columnModel.getColumn(4).setPreferredWidth(50);  // "DestinoActivo"
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplicar el renderizador a la segunda columna ID (índice 0)
        tCiudades.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
    }

    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }
 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JrbActivo;
    private javax.swing.JTextField JtNombre;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jFechaFinTemporada;
    private javax.swing.JLabel jFechaInicioTemporada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JCalendar jcFinTemporada;
    private com.toedter.calendar.JCalendar jcInicioTemporada;
    private javax.swing.JLabel lbCiudades;
    private javax.swing.JLabel lbCiudesRecorridas;
    private javax.swing.JTable tCiudades;
    // End of variables declaration//GEN-END:variables
}
