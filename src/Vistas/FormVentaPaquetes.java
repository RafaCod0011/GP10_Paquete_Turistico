
package Vistas;

import accesoADatos.CiudadData;
import accesoADatos.TransporteData;
import accesoADatos.TuristaData;
import accesoADatos.AlojamientoData;
import accesoADatos.RegimenData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.*;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class FormVentaPaquetes extends javax.swing.JInternalFrame {
    

    
public Turista viajero = new Turista();
public Transporte transporte = new Transporte();


public TuristaData tData = new TuristaData();
public TransporteData tpData = new TransporteData();
public CiudadData cData = new CiudadData();
public AlojamientoData aloData= new AlojamientoData();
public RegimenData rData= new RegimenData();


public ArrayList<Turista> viajeros = new ArrayList<>();
public ArrayList<Transporte> listadoT = new ArrayList<>();
public ArrayList<Ciudad> listadoC = new ArrayList<>();
public ArrayList<Alojamiento> listadoA= new ArrayList<>();
public ArrayList<Regimen> listadoR = new ArrayList<>();

boolean cargandoComboBox;
boolean consultando;

//Variables para los cálculos de valores $$$
int contarMayores, contarMenores;
double precioPersonaTransporte, transporteMayores, transporteMenores, transporteTotal;


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
        bloquearPanel(panelOpciones);
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
        jPanelResultados = new javax.swing.JPanel();
        lMen = new javax.swing.JLabel();
        lMay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lTransMay = new javax.swing.JLabel();
        lTransMen = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lTransTotal = new javax.swing.JLabel();
        lAlojamientoTotal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelDestino = new javax.swing.JPanel();
        cbOrigen = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbTransportesRecorridos = new javax.swing.JLabel();
        lbTransportes = new javax.swing.JLabel();
        tbAlojamiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbRegimen = new javax.swing.JTextField();
        tbTemporada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        lbTransportes1 = new javax.swing.JLabel();
        cbTransportes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbAlojamientos = new javax.swing.JComboBox<>();
        cbRegimen = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btVerOpciones = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

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

        jPanelResultados.setBackground(new java.awt.Color(121, 176, 213));
        jPanelResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de valores de los Servicios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        lMen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMen.setText(".");

        lMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMay.setText(".");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Viajeros Menores:");

        jLabel2.setText("Viajeros Mayores:");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setText("Valor transporte para Menores:");

        jLabel16.setText("Valor transporte para Mayores:");

        lTransMay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTransMay.setText(".");

        lTransMen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTransMen.setText(".");

        jLabel17.setBackground(new java.awt.Color(51, 51, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Valor Total del Transporte:");

        lTransTotal.setForeground(new java.awt.Color(51, 51, 255));
        lTransTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTransTotal.setText(".");

        lAlojamientoTotal.setForeground(new java.awt.Color(0, 102, 102));
        lAlojamientoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lAlojamientoTotal.setText(".");

        jLabel18.setBackground(new java.awt.Color(51, 51, 255));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Valor del Alojamiento");

        javax.swing.GroupLayout jPanelResultadosLayout = new javax.swing.GroupLayout(jPanelResultados);
        jPanelResultados.setLayout(jPanelResultadosLayout);
        jPanelResultadosLayout.setHorizontalGroup(
            jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lMen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lMay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lTransMen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTransMay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addComponent(lTransTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAlojamientoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanelResultadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lAlojamientoTotal, lMay, lMen, lTransMay, lTransMen, lTransTotal});

        jPanelResultadosLayout.setVerticalGroup(
            jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addComponent(lTransMen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTransMay))
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lMen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lMay)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lTransTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lAlojamientoTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelResultadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lMay, lMen, lTransMay, lTransMen});

        javax.swing.GroupLayout panelGrupoTuristasLayout = new javax.swing.GroupLayout(panelGrupoTuristas);
        panelGrupoTuristas.setLayout(panelGrupoTuristasLayout);
        panelGrupoTuristasLayout.setHorizontalGroup(
            panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                        .addComponent(btAgregarTuristas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEliminar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGrupoTuristasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAgregarTuristas1, tbEliminar});

        panelGrupoTuristasLayout.setVerticalGroup(
            panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregarTuristas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbEliminar))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jPanelResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelGrupoTuristasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAgregarTuristas1, tbEliminar});

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Origen:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText(" Destino:");

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Fechas:");

        javax.swing.GroupLayout panelDestinoLayout = new javax.swing.GroupLayout(panelDestino);
        panelDestino.setLayout(panelDestinoLayout);
        panelDestinoLayout.setHorizontalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDestinoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDestinoLayout.setVerticalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbTransportesRecorridos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportesRecorridos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTransportesRecorridos.setText("Paquetes turísticos");

        lbTransportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes.setForeground(new java.awt.Color(51, 51, 255));
        lbTransportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes.setText("Confección de Presupuestos");

        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Alojamiento");

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Régimen");

        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Temporada Alta");

        lbTransportes1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes1.setForeground(new java.awt.Color(102, 102, 102));
        lbTransportes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes1.setText("Seleccione los medios de Transporte y las opciones de alojamiento que existen para el Paquete:");

        cbTransportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransportesActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Transporte:");

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Alojamiento:");

        cbAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlojamientosActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Régimen:");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTransportes1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelOpcionesLayout.createSequentialGroup()
                                .addComponent(cbAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTransportes1)
                .addGap(18, 18, 18)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        btVerOpciones.setText("Ver Opciones Disponibles");
        btVerOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGrupoTuristas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTransportesRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(489, 489, 489)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(tbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addContainerGap()
                            .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(btVerOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVerOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tbTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerOpcionesActionPerformed
   
        
        //controlamos el enabled de los paneles, si están bloqueados significa que está consultando y quiere reconfigurar (turistas / destinos / fechas)
        if (panelGrupoTuristas.isEnabled()) {
            JOptionPane.showMessageDialog(this, contarMenores + " " + contarMayores);
             //debemos controlar que:
            //haya ingresado al menos un turista
            //Tenga seleccionados origen y destino 
            if ((contarMenores == 0 && contarMayores == 0) || cbOrigen.getSelectedIndex() == -1 || cbDestino.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Complete los datos solicitados por el sistema para poder ver las opciones disponibles", 
                                              "No es posible realizar la consulta", JOptionPane.ERROR_MESSAGE);
                return;
            }

            cargarCombosFiltro();
            bloquearPanel(panelGrupoTuristas);
            bloquearPanel(panelDestino);
            habilitarPanel(panelOpciones);
            btVerOpciones.setText("Seleccionar viajeros y destinos");
            
            
            panelGrupoTuristas.repaint();
            panelDestino.repaint();
            panelOpciones.repaint();
            
            //Cargamos el combo de Regimen
            listadoR = (ArrayList) rData.listarRegimenes();
            for (Regimen regimen : listadoR) {
                cbRegimen.addItem(regimen);
            }
            cbRegimen.repaint();
            cbRegimen.updateUI();
            cbRegimen.setSelectedItem(null);

        } else {
            
            JOptionPane.showMessageDialog(this, "No tomo como enabled el panel turistas");
            habilitarPanel(panelGrupoTuristas);
            habilitarPanel(panelDestino);
            bloquearPanel(panelOpciones);
            btVerOpciones.setText("Ver opciones disponibles");

            panelGrupoTuristas.repaint();
            panelDestino.repaint();
            panelOpciones.repaint();
            reiniciarResultados();
        }

    }//GEN-LAST:event_btVerOpcionesActionPerformed

    private void reiniciarResultados(){

        lTransMen.setText(".");
        lTransMay.setText(".");
        lTransTotal.setText(".");
        cbTransportes.removeAllItems();
        cbAlojamientos.removeAllItems();
        cbRegimen.removeAllItems();
        
   
    }
    
    
    private void btAgregarTuristas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarTuristas1ActionPerformed
 
        try {
                String doc = JOptionPane.showInputDialog(this,"Ingrese el número de documento del viajero");
                int documento = Integer.parseInt(doc);
                if (!doc.isEmpty()){
                    //primero deberia controla que el documento no exista en el arreglo
                    for (Turista viajero1 : viajeros) {
                        if (viajero1.getDocumento()==documento){
                            JOptionPane.showMessageDialog(this, "El documento ingresado ya se encuentra en la lista de viajeros");
                            return;
                        }
                    }
                    //si no está en el arreglo, lo buscamos en la base de datos
                    viajero = tData.buscarTurista(documento);
                    if (viajero!=null){
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
        
        if (cargandoComboBox==false){
            Transporte transporteSeleccionado = (Transporte) cbTransportes.getSelectedItem();

            if (transporteSeleccionado != null) {
                    // Verificar de qué tipo es el transporte seleccionado
                 if (transporteSeleccionado instanceof Avion) {
                     precioPersonaTransporte = transporteSeleccionado.calcularPrecio();
                     JOptionPane.showMessageDialog(this, "El transporte en AVIÓN tiene un cargo Adicional por IMPUESTOS","Información Importante", JOptionPane.INFORMATION_MESSAGE);
                 } else if (transporteSeleccionado instanceof Colectivo) {
                     precioPersonaTransporte = transporteSeleccionado.calcularPrecio();
                 } else if (transporteSeleccionado instanceof Auto) {
                     precioPersonaTransporte = transporteSeleccionado.calcularPrecio();
                 }
                 
                transporteMayores = precioPersonaTransporte * contarMayores ;   
                transporteMenores = (precioPersonaTransporte * contarMenores)/2 ;        
                transporteTotal = transporteMayores + transporteMenores;        
                String transMen = Double.toString(transporteMenores);
                String transMay = Double.toString(transporteMayores);
                String transTot = Double.toString(transporteTotal);
                lTransMen.setText(transMen);
                lTransMay.setText(transMay);
                lTransTotal.setText(transTot);
            
            }    
        }    
        
    }//GEN-LAST:event_cbTransportesActionPerformed

    private void cbAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlojamientosActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_cbAlojamientosActionPerformed
    private void cargarCombosFiltro(){
     
       
        cargarComboTransporte();
        cargarComboAlojamientos();
        
    }
    
    private void cargarComboTransporte(){
        
        //Controlamos que haya seleccionado un origen y un destino, y traemos los transportes
        //que realicen ese recorrido
        
        cbTransportes.removeAllItems();
        cargandoComboBox = true;
        
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
        }    
        if (cbTransportes.getItemCount()!=0){
            JOptionPane.showMessageDialog(this, "Tenemos " + cbTransportes.getItemCount() + " opciones de transporte para realizar el viaje entre ciudades","Opciones disponbles", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Lamentablemente no disponemos de opciones de transporte para realizar el viaje entre ciudades","Opciones disponbles", JOptionPane.ERROR_MESSAGE);
        }
        cbTransportes.updateUI();
        cbTransportes.setSelectedItem(null);
        cargandoComboBox = false;
    
    
    }
        
    private void cargarComboAlojamientos() {

        cbAlojamientos.removeAllItems(); 
        cargandoComboBox = true;
        // Verificamos que haya una ciudad de destino seleccionada
        if (cbDestino.getSelectedItem() != null) {
            Ciudad cDestino = (Ciudad) cbDestino.getSelectedItem();


            listadoA = (ArrayList) aloData.listarPorCiudad(cDestino.getIdCiudad());

            for (Alojamiento alojamiento : listadoA) {
                cbAlojamientos.addItem(alojamiento);
            }
        }

        if (cbAlojamientos.getItemCount() != 0) {
            JOptionPane.showMessageDialog(this, "Tenemos " + cbAlojamientos.getItemCount() + " opciones de alojamiento en la ciudad seleccionada",
                                          "Opciones disponibles", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Lamentablemente no disponemos de opciones de alojamiento en la ciudad seleccionada",
                                          "Opciones disponibles", JOptionPane.ERROR_MESSAGE);
        }
        cbAlojamientos.updateUI(); 
        cbAlojamientos.setSelectedItem(null); 
        cargandoComboBox = false;

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
        
        contarMayores = 0;
        contarMenores = 0;
        
        lMay.setText("");
        lMen.setText("");

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
    

    
public void bloquearPanel(JPanel panel) {
    panel.setEnabled(false);  
    for (Component component : panel.getComponents()) {
        component.setEnabled(false);  
    }
}

public void habilitarPanel(JPanel panel) {
    panel.setEnabled(true);  
    for (Component component : panel.getComponents()) {
        component.setEnabled(true);  
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarTuristas1;
    private javax.swing.JButton btVerOpciones;
    private javax.swing.JComboBox<Alojamiento> cbAlojamientos;
    private javax.swing.JComboBox<Ciudad> cbDestino;
    private javax.swing.JComboBox<Ciudad> cbOrigen;
    private javax.swing.JComboBox<Regimen> cbRegimen;
    private javax.swing.JComboBox<Transporte> cbTransportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lAlojamientoTotal;
    private javax.swing.JLabel lMay;
    private javax.swing.JLabel lMen;
    private javax.swing.JLabel lTransMay;
    private javax.swing.JLabel lTransMen;
    private javax.swing.JLabel lTransTotal;
    private javax.swing.JLabel lbTransportes;
    private javax.swing.JLabel lbTransportes1;
    private javax.swing.JLabel lbTransportesRecorridos;
    private javax.swing.JPanel panelDestino;
    private javax.swing.JPanel panelGrupoTuristas;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTable tTuristas;
    private javax.swing.JTextField tbAlojamiento;
    private javax.swing.JButton tbEliminar;
    private javax.swing.JTextField tbRegimen;
    private javax.swing.JTextField tbTemporada;
    // End of variables declaration//GEN-END:variables
}
