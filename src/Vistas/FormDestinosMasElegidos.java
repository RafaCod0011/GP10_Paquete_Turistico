package Vistas;

import accesoADatos.CiudadData;
import accesoADatos.PaqueteData;
import entidades.Ciudad;
import entidades.CiudadVisitada;
import entidades.Paquete;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormDestinosMasElegidos extends javax.swing.JInternalFrame {
    public CiudadData cData;
    public PaqueteData pData;
    public ArrayList<Paquete> listadoPaquetes;
    public ArrayList<Ciudad> listadoCiudades;
    
    public DefaultTableModel modelo;
    
    public FormDestinosMasElegidos(){
        initComponents();
        cData = new CiudadData();
        pData = new PaqueteData();
        listadoPaquetes = (ArrayList<Paquete>) pData.listarPaquetes();
        listadoCiudades = (ArrayList<Ciudad>) cData.listarCiudades();
        modelo = new DefaultTableModel();
        
        armarCabecera();
        cargaTabla();
        
        ListSelectionModel modeloS = JtCiudades.getSelectionModel();
        modeloS.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int filaSeleccionada = JtCiudades.getSelectedRow();
                    if (filaSeleccionada != -1) {
                    }
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JDestinosMasElegidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtCiudades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 223));
        setClosable(true);
        setIconifiable(true);

        JDestinosMasElegidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JDestinosMasElegidos.setForeground(new java.awt.Color(51, 51, 255));
        JDestinosMasElegidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JDestinosMasElegidos.setText("Destinos mas elegidos");

        JtCiudades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JtCiudades);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Estadisticas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDestinosMasElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JDestinosMasElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

   private void cargaTabla() {
        limpiarTabla();
        List<Ciudad> listadoC = cData.listarCiudadesMasElegidas();
        for (Ciudad c : listadoC) {
            modelo.addRow(new Object[] { c.getIdCiudad(), c.getNombre(),c.getTotalTuristas(),c.getTotalPaquetes() });
            
        }
   }


    private void armarCabecera() {
        modelo.addColumn("ID Ciudad");
        modelo.addColumn("Nombre Ciudad Destino");
        modelo.addColumn("Turistas que visitaron el Destino");
        modelo.addColumn("Paquetes con el mismo Destino");

        JtCiudades.setModel(modelo);

        TableColumnModel columnModel = JtCiudades.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(50); // ID Ciudad
        columnModel.getColumn(1).setPreferredWidth(150); // Nombre de la Ciudad
        columnModel.getColumn(2).setPreferredWidth(180); // Total de Turistas
        columnModel.getColumn(3).setPreferredWidth(180); // Cantidad de Paquetes

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        JtCiudades.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        JtCiudades.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        JtCiudades.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        JtCiudades.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JDestinosMasElegidos;
    private javax.swing.JTable JtCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
