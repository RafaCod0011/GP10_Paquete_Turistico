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
    
    
    public DefaultTableModel modelo;

    public FormRegimenes() {
        initComponents();

        rData = new RegimenData(); // inicializar antes de cargar la tabla
        listadoR = (ArrayList<Regimen>) rData.listarRegimenes();
        modelo = new DefaultTableModel();

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
        
        rData = new RegimenData();
        listadoR = (ArrayList<Regimen>)rData.listarRegimenes();
        modelo = new DefaultTableModel();
        
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
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jlDenominacion = new javax.swing.JLabel();
        jlCargoExtra = new javax.swing.JLabel();
        tfDenominacion = new javax.swing.JTextField();
        tfCargoExtra = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jlListRegimenes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlListRegimenes.setForeground(new java.awt.Color(51, 51, 255));
        jlListRegimenes.setText("Lista de Regimenes");

        jlTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        jbAgregar.setBackground(new java.awt.Color(50, 205, 50));
        jbAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/RedondoNuevo.png"))); // NOI18N
        jbAgregar.setText("Guardar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
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

        jlDenominacion.setText("Denominacion:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlDenominacion)
                            .addComponent(jlCargoExtra))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDenominacion)
                            .addComponent(tfCargoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar)
                        .addGap(12, 12, 12)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jlListRegimenes)
                    .addContainerGap(428, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDenominacion)
                    .addComponent(tfDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCargoExtra)
                    .addComponent(tfCargoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jlListRegimenes)
                    .addContainerGap(503, Short.MAX_VALUE)))
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
        
        //ID
            int id = (int) jtRegimenes.getValueAt(filaSeleccionada, 0);
            String code = String.valueOf(id);
        // NOMBRE DE EL REGIMEN
        String denominacion = (String) jtRegimenes.getValueAt(filaSeleccionada, 1); 
        tfDenominacion.setText(denominacion);
        // DESTINO ACTIVO
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
                    Nuevo();
                }
            }
            Nuevo();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        RegimenData movimiento = new RegimenData();

        int respuesta = JOptionPane.showConfirmDialog(null
            , "Va a grabar un nuevo Regimen ¿Esta seguro/a?"
            ,"Nuevo Regimen"
            ,JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {

            try {

                if (tfDenominacion.getText().isEmpty() || tfCargoExtra.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Complete los datos del Regimen a ingresar","Atención", JOptionPane.ERROR_MESSAGE);
                }else{
                    String denominacion = tfDenominacion.getText();
                    double cargoExtra = Double.parseDouble(tfCargoExtra.getText());
                    Regimen regimenNuevo = new Regimen(denominacion ,cargoExtra);
                    movimiento.agregarRegimenes(regimenNuevo);
                }
                Nuevo();
                
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                    "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

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
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCargoExtra;
    private javax.swing.JLabel jlDenominacion;
    private javax.swing.JLabel jlListRegimenes;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTable jtRegimenes;
    private javax.swing.JTextField tfCargoExtra;
    private javax.swing.JTextField tfDenominacion;
    // End of variables declaration//GEN-END:variables
}
