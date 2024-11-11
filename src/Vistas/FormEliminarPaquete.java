
package Vistas;

import entidades.Alojamiento;
import entidades.Habitacion;
import entidades.Ciudad;
import entidades.Paquete;
import accesoADatos.AlojamientoData;
import accesoADatos.CiudadData;
import accesoADatos.HabitacionData;
import entidades.Transporte;
import accesoADatos.PaqueteData;
import accesoADatos.PaqueteTuristaData;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;




public class FormEliminarPaquete extends javax.swing.JInternalFrame {

    public PaqueteData pqData = new PaqueteData();
    public List<Paquete> listado = new ArrayList();
    public PaqueteTuristaData tuData= new PaqueteTuristaData();
    
    
    
     private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};
    
    
    
    
    public FormEliminarPaquete() {
        initComponents();
        armarCabecera();
        cargarTabla();
        
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaquetes = new javax.swing.JTable();
        lbEliminar = new javax.swing.JLabel();
        lbPaquetes = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtPaquetes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPaquetes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1170, 330));

        lbEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEliminar.setForeground(new java.awt.Color(51, 51, 255));
        lbEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbEliminar.setText("Eliminar un Paquete");
        jPanel1.add(lbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbPaquetes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPaquetes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPaquetes.setText("Listado de paquetes");
        jPanel1.add(lbPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        btEliminar.setBackground(new java.awt.Color(245, 245, 245));
        btEliminar.setText("Eliminar Paquete");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 400, 50));

        jLabel1.setText("Seleccione un paquete de la lista para eliminarlo. Recuerde que solo puede eliminarlo 30 dias antes de la fecha de salida.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1204, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

      if (jtPaquetes.isEnabled()) {
        int filaSeleccionada = jtPaquetes.getSelectedRow();

        if (filaSeleccionada != -1) {
            
            int paqueteEliminar = (int) jtPaquetes.getValueAt(filaSeleccionada, 0);
            LocalDate fechaDesde = (LocalDate) jtPaquetes.getValueAt(filaSeleccionada, 1); 

            LocalDate today = LocalDate.now();
            long daysBetween = ChronoUnit.DAYS.between(today, fechaDesde);

            if (daysBetween >= 30) {
                int respuesta = JOptionPane.showConfirmDialog(null,
                    "¿Está seguro/a de Eliminar el paquete seleccionado?",
                    "Eliminar Paquete",
                    JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    tuData.eliminarTuristasEnPaquete(paqueteEliminar);
                    String mensaje = pqData.eliminarPaquete(paqueteEliminar);
                    JOptionPane.showMessageDialog(this, mensaje);
                    cargarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El paquete solo se puede eliminar 30 días antes de la fecha de salida.");
            }
        }
    }

    }//GEN-LAST:event_btEliminarActionPerformed

private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Desde");
        modelo.addColumn("Hasta");
        modelo.addColumn("Destino");
        modelo.addColumn("Transporte");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Planta");
        modelo.addColumn("Numero de habitacion");
        
     
        
        jtPaquetes.setModel(modelo);
        
        TableColumnModel columnModel = jtPaquetes.getColumnModel();

        
        columnModel.getColumn(0).setPreferredWidth(10);   // "ID"
        columnModel.getColumn(1).setPreferredWidth(80);  // "Desde"
        columnModel.getColumn(2).setPreferredWidth(80);  // "Hasta"
        columnModel.getColumn(3).setPreferredWidth(80);   // "Destino"
        columnModel.getColumn(4).setPreferredWidth(50);  // "Transporte"
        columnModel.getColumn(5).setPreferredWidth(30);  // "Alojamiento"
        columnModel.getColumn(6).setPreferredWidth(10); //"Planta"
        columnModel.getColumn(7).setPreferredWidth(80); // "Numero de habitacion"
        
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        
        jtPaquetes.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
    }
    
    private void cargarTabla() {
    limpiarTabla();

    List<Paquete> listado = pqData.listarPaquetesConDetalles();

    for (Paquete p : listado) {
        String planta = "-";
        String nroHabitacion = "-";

        // Check if the accommodation is a "Hostel" and has rooms
        if ("Hostel".equalsIgnoreCase(p.getAlojamiento().getTipoAlojamiento()) && p.getAlojamiento().getHabitaciones() != null && !p.getAlojamiento().getHabitaciones().isEmpty()) {
            // Get the first room's details
            Habitacion habitacion = p.getAlojamiento().getHabitaciones().get(0);
            planta = String.valueOf(habitacion.getPlanta());
            nroHabitacion = String.valueOf(habitacion.getNroHabitacion());
        }

        // Add a single row per Paquete
        modelo.addRow(new Object[]{
            p.getIdPaquete(),
            p.getFechaDesde(),
            p.getFechaHasta(),
            p.getCiudadDestino().getNombre(),
            p.getTransporte().getTipoTransporte(),
            p.getAlojamiento().getTipoAlojamiento(),
            planta,
            nroHabitacion
        });
    }
}



    
    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPaquetes;
    private javax.swing.JLabel lbEliminar;
    private javax.swing.JLabel lbPaquetes;
    // End of variables declaration//GEN-END:variables
}
