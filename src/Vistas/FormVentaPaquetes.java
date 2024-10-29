
package Vistas;

import accesoADatos.CiudadData;
import accesoADatos.TransporteData;
import accesoADatos.TuristaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.*;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class FormVentaPaquetes extends javax.swing.JInternalFrame {
    
public Turista viajero = new Turista();
public Transporte transporte = new Transporte();

public TuristaData tData = new TuristaData();
public TransporteData tpData = new TransporteData();
public CiudadData cData = new CiudadData();

public ArrayList<Turista> viajeros = new ArrayList<>();
public ArrayList<Transporte> listadoT = new ArrayList<>();
public ArrayList<Ciudad> listadoC = new ArrayList<>();
    
private DefaultTableModel modelo= new DefaultTableModel(){

    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};  
    public FormVentaPaquetes() {
        
        initComponents();
        armarCabecera();
        cargarCombos();
        cbOrigen.setSelectedItem(null);
        cbDestino.setSelectedItem(null);

        
        //no olvidar; hay que hacer un metodo que reciba un arraylist de turistas y lo agregue
        //en la tabla paquetes / turistas
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGrupoTuristas = new javax.swing.JPanel();
        tbEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tTuristas = new javax.swing.JTable();
        btAgregarTuristas1 = new javax.swing.JButton();
        lMen = new javax.swing.JLabel();
        lMay = new javax.swing.JLabel();
        panelDestino = new javax.swing.JPanel();
        cbOrigen = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        btVerOpciones = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbTransportesRecorridos = new javax.swing.JLabel();
        lbTransportes = new javax.swing.JLabel();
        cbAlojamiento = new javax.swing.JComboBox<>();
        cbRegimen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTransportes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tbTransporteMenores = new javax.swing.JTextField();
        tbTransporteMayores1 = new javax.swing.JTextField();
        tbAlojamiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbRegimen = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tbTemporada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tbPasajerosMayores = new javax.swing.JTextField();
        tbPasajerosMenores = new javax.swing.JTextField();

        setClosable(true);

        panelGrupoTuristas.setBackground(new java.awt.Color(204, 204, 204));

        tbEliminar.setText("Quitar de la lista");
        tbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEliminarActionPerformed(evt);
            }
        });

        tTuristas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tTuristas);

        btAgregarTuristas1.setText("Agregar viajeros");
        btAgregarTuristas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarTuristas1ActionPerformed(evt);
            }
        });

        lMen.setText(".");

        lMay.setText(".");

        javax.swing.GroupLayout panelGrupoTuristasLayout = new javax.swing.GroupLayout(panelGrupoTuristas);
        panelGrupoTuristas.setLayout(panelGrupoTuristasLayout);
        panelGrupoTuristasLayout.setHorizontalGroup(
            panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(tbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lMen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lMay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btAgregarTuristas1)
                    .addContainerGap(721, Short.MAX_VALUE)))
        );
        panelGrupoTuristasLayout.setVerticalGroup(
            panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tbEliminar))
                    .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lMay)
                            .addComponent(lMen))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(btAgregarTuristas1)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );

        panelDestino.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Origen:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText(" Destino:");

        btVerOpciones.setText("Ver Opciones Disponibles");
        btVerOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerOpcionesActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Fechas:");

        javax.swing.GroupLayout panelDestinoLayout = new javax.swing.GroupLayout(panelDestino);
        panelDestino.setLayout(panelDestinoLayout);
        panelDestinoLayout.setHorizontalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDestinoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(cbOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVerOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDestinoLayout.setVerticalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btVerOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        lbTransportesRecorridos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportesRecorridos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTransportesRecorridos.setText("Paquetes turísticos");

        lbTransportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes.setForeground(new java.awt.Color(51, 51, 255));
        lbTransportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes.setText("Confección de Presupuestos");

        cbAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Alojamiento:");

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Transporte:");

        cbTransportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransportesActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Régimen:");

        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Mayores:");

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Menores");

        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Alojamiento");

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Régimen");

        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Transporte");

        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Temporada Alta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTransportesRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbTransporteMayores1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbTransporteMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(tbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(tbTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(tbPasajerosMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbPasajerosMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelGrupoTuristas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTransportesRecorridos)
                    .addComponent(lbTransportes))
                .addGap(18, 18, 18)
                .addComponent(panelGrupoTuristas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbPasajerosMayores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbPasajerosMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbTransporteMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbTransporteMayores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tbTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerOpcionesActionPerformed
   
        cargarCombosFiltro();
        
        
        
    }//GEN-LAST:event_btVerOpcionesActionPerformed

    private void btAgregarTuristas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarTuristas1ActionPerformed
 
        try {
                String doc = JOptionPane.showInputDialog(this,"Ingrese el número de documento del viajero");
                int documento = Integer.parseInt(doc);
                if (!doc.isEmpty()){
                    //primero deberia controla que el documento no exista en el arreglo
                    for (Turista viajero1 : viajeros) {
                        JOptionPane.showMessageDialog(this, "documento del array: " + viajero1.getDocumento());
                        if (viajero1.getDocumento()==documento){
                            JOptionPane.showMessageDialog(this, "El documento ingresado ya se encuentra en la lista de viajeros");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(this, "ya controlé todos");       
                    //si no está en el arreglo, lo buscamos en la base de datos
                    viajero = tData.buscarTurista(documento);
                    if (viajero!=null){
                        JOptionPane.showMessageDialog(this, "Está en tabla");    
                        //si recuerpero un turista, lo cargo en la tabla y en el arraylist
                        modelo.addRow(new Object[] {viajero.getIdTurista(),viajero.getDocumento(),viajero.getFullName(),viajero.getEdad()});   
                        viajeros.add(viajero);
                        calcularEdades();
                    }else{
                        String apelNom = JOptionPane.showInputDialog(this, "Ingrese el apellido y nombres", "Datos del Viajero", JOptionPane.PLAIN_MESSAGE);
                        if (apelNom == null) {
                            return;
                        }
                        boolean edadCorrecta=false;
                        int edad = 0;
                        do {
                              String edadS = JOptionPane.showInputDialog(this, "Ingrese la edad de " + apelNom, "Datos del Viajero", JOptionPane.PLAIN_MESSAGE);
                              if (edadS == null || edadS.isEmpty()) {
                                  return; 
                              }
                              try {
                                  edad = Integer.parseInt(edadS);
                                  if (edad >= 1 && edad <= 150) {
                                      edadCorrecta = true;
                                  } else {
                                      JOptionPane.showMessageDialog(this, "La edad es incorrecta...", "Edad Inválida", JOptionPane.ERROR_MESSAGE);
                                  }
                              } catch (NumberFormatException e) {
                                  JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para la edad.", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
                              }
                          } while (!edadCorrecta);
                        JOptionPane.showMessageDialog(this, "El pasajaero es " + apelNom + " y tiene " + edad + " años");
                        //Al nuevo turista ingresado, lo agrego a la base de datos, lo cargo en la tabla y al ArrayList
                        Turista viajero= new Turista(documento, apelNom, edad);
                        tData.guardarTurista(viajero);
                        modelo.addRow(new Object[] {viajero.getIdTurista(),viajero.getDocumento(),viajero.getFullName(),viajero.getEdad()});
                        viajeros.add(viajero);
                        calcularEdades();
                    }
                }  
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para el documento.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
        }

    }//GEN-LAST:event_btAgregarTuristas1ActionPerformed

    private void tbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEliminarActionPerformed
        
        int filaSeleccionada = tTuristas.getSelectedRow();
        if (filaSeleccionada==-1){
             JOptionPane.showMessageDialog(this, "Seleccione un viajero para poder quitarlo del presupuesto","Quitar viajero", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if (tTuristas.isEnabled()){
            //int filaSeleccionada = tTuristas.getSelectedRow();
            
            JOptionPane.showMessageDialog(this, "Fila " + filaSeleccionada);
                   
            
            if (filaSeleccionada != -1) { 
                    int respuesta = JOptionPane.showConfirmDialog(this
                    ,"¿Está seguro/a de eliminar de la lista el viajero seleccionado?"
                    ,"Eliminar Viajero de la Lista"
                    ,JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    int docu = (int) tTuristas.getValueAt(filaSeleccionada, 1);
                    
                    viajero = tData.buscarTurista(docu);
                    viajeros.remove(viajero);
                    ((DefaultTableModel) tTuristas.getModel()).removeRow(filaSeleccionada);
                    
                    calcularEdades();

                }
            }
        }   
     }//GEN-LAST:event_tbEliminarActionPerformed

    private void cbTransportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTransportesActionPerformed
    

        Transporte transporteSeleccionado = (Transporte) cbTransportes.getSelectedItem();


        if (transporteSeleccionado != null) {

         
        

             // Verificar de qué tipo es el transporte seleccionado
             if (transporteSeleccionado instanceof Avion) {
                 double precioPersona = transporteSeleccionado.calcularPrecio();
                 JOptionPane.showMessageDialog(this, "El transporte seleccionado es un avión. Precio Final x Persona: " + precioPersona);
             } else if (transporteSeleccionado instanceof Colectivo) {
                      double precioPersona = transporteSeleccionado.calcularPrecio();
                 JOptionPane.showMessageDialog(this, "El transporte seleccionado es un colectivo. Precio Final x Persona: " + precioPersona);
             } else {
                      double precioPersona = transporteSeleccionado.calcularPrecio();
                 JOptionPane.showMessageDialog(this, "Transporte genérico. Precio Final x Persona: " + precioPersona);
             }

        }     
    }//GEN-LAST:event_cbTransportesActionPerformed
    private void cargarCombosFiltro(){
        
        //Controlamos que haya seleccionado un origen y un destino, y traemos los transportes
        //que realicen ese recorrido
        
        cbTransportes.removeAllItems();
        if (cbOrigen.getSelectedItem()!=null && cbDestino.getSelectedItem()!=null){
            Ciudad cOrigen = (Ciudad) cbOrigen.getSelectedItem();
            Ciudad cDestino = (Ciudad) cbDestino.getSelectedItem();
            listadoT = (ArrayList) tpData.buscarTransporte(cOrigen,cDestino);
            
            
            
            for (Transporte transporte : listadoT) {
            
                if ("Avion".equals(transporte.getTipoTransporte())) {
                    Avion avion = new Avion(transporte.getIdTransporte(), 
                                             transporte.getCiudadOrigen(), 
                                             transporte.getCiudadDestino(), 
                                             transporte.getNombreEmpresaTransporte(), 
                                             transporte.getPrecioPersona());
                    cbTransportes.addItem(avion);
                } else if ("Colectivo".equals(transporte.getTipoTransporte())) {
                    Colectivo colectivo = new Colectivo(transporte.getIdTransporte(), 
                                                         transporte.getCiudadOrigen(), 
                                                         transporte.getCiudadDestino(), 
                                                         transporte.getNombreEmpresaTransporte(), 
                                                         transporte.getPrecioPersona());
                    cbTransportes.addItem(colectivo);
                }
        }
            
//            for (Transporte transporte : listadoT) {
//                
//                if (transporte.getTipoTransporte())
//                cbTransportes.addItem(transporte);
//            }
        }    
        
        
    }
    
    private void cargarCombos(){
    
            listadoC = (ArrayList) cData.listarCiudades();
            for (Ciudad ciudad : listadoC) {
                cbOrigen.addItem(ciudad);
                cbDestino.addItem(ciudad);
            }
    
    }
    
    private void cargarTabla(){
    
//        limpiarTabla();    
//        listado = (ArrayList) tData.listarTransportes();
//        for (Transporte m: listado) {
//                modelo.addRow(new Object[] {m.getIdTransporte(),m.getCiudadOrigen(),m.getCiudadDestino(),m.getTipoTransporte(),m.getNombreEmpresaTransporte(),m.getPrecioPersona()});
//        }
        
    } 
    
    private void calcularEdades(){
        
        lMay.setText("");
        lMen.setText("");
        int contarMayores = 0;
        int contarMenores = 0;
        for (Turista viajero1 : viajeros) {
            if (viajero1.getEdad()>10){
                contarMayores++;
            }else {
                contarMenores++;
            }
        }
        String mayores = String.valueOf(contarMayores);
        String menores = String.valueOf(contarMenores);
        lMay.setText(mayores);
        lMen.setText(menores);
    
    }
    
    
    private void armarCabecera(){

        modelo.addColumn("ID");
        modelo.addColumn("Documento");
        modelo.addColumn("Apellido y Nombres");
        modelo.addColumn("Edad");
        
        
        tTuristas.setModel(modelo);
        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = tTuristas.getColumnModel();

        //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(10);  // "Documento"
        columnModel.getColumn(1).setPreferredWidth(20);  // "Documento"
        columnModel.getColumn(2).setPreferredWidth(80);  // "Apellido y Nombres"
        columnModel.getColumn(3).setPreferredWidth(20);  // "Edad"

        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        tTuristas.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tTuristas.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        
    }

    private void limpiarTabla(){

        int indice= modelo.getRowCount()-1;
        for (int i = indice; i>=0; i--) {
        	modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarTuristas1;
    private javax.swing.JButton btVerOpciones;
    private javax.swing.JComboBox<String> cbAlojamiento;
    private javax.swing.JComboBox<Ciudad> cbDestino;
    private javax.swing.JComboBox<Ciudad> cbOrigen;
    private javax.swing.JComboBox<String> cbRegimen;
    private javax.swing.JComboBox<Transporte> cbTransportes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lMay;
    private javax.swing.JLabel lMen;
    private javax.swing.JLabel lbTransportes;
    private javax.swing.JLabel lbTransportesRecorridos;
    private javax.swing.JPanel panelDestino;
    private javax.swing.JPanel panelGrupoTuristas;
    private javax.swing.JTable tTuristas;
    private javax.swing.JTextField tbAlojamiento;
    private javax.swing.JButton tbEliminar;
    private javax.swing.JTextField tbPasajerosMayores;
    private javax.swing.JTextField tbPasajerosMenores;
    private javax.swing.JTextField tbRegimen;
    private javax.swing.JTextField tbTemporada;
    private javax.swing.JTextField tbTransporteMayores1;
    private javax.swing.JTextField tbTransporteMenores;
    // End of variables declaration//GEN-END:variables
}
