
package Vistas;

import accesoADatos.CiudadData;
import accesoADatos.TransporteData;
import accesoADatos.TuristaData;
import accesoADatos.AlojamientoData;
import accesoADatos.PaqueteData;
import accesoADatos.RegimenData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entidades.*;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.ZoneId;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class FormVentaPaquetes extends javax.swing.JInternalFrame {
    

    
public Turista viajero = new Turista();
public Transporte transporte = new Transporte();
public Paquete paquete;


public TuristaData tData = new TuristaData();
public TransporteData tpData = new TransporteData();
public CiudadData cData = new CiudadData();
public AlojamientoData aloData= new AlojamientoData();
public RegimenData rData= new RegimenData();
public PaqueteData pData = new PaqueteData();


public ArrayList<Turista> viajeros = new ArrayList<>();
public ArrayList<Transporte> listadoT = new ArrayList<>();
public ArrayList<Ciudad> listadoC = new ArrayList<>();
public ArrayList<Alojamiento> listadoA= new ArrayList<>();
public ArrayList<Regimen> listadoR = new ArrayList<>();

boolean cargandoComboBox;
boolean cargandoComboBoxA;
boolean cargandoComboBoxR;
boolean consultando;
LocalDate fechaDesde, fechaHasta;
LocalDate fechaHoy = LocalDate.now();



//Variables para los cálculos de valores $$$
int contarMayores, contarMenores;
double precioPersonaTransporte, transporteMayores, transporteMenores, transporteTotal;
double precioEstadia, incrementoRegimen;
double incrementoTemporada;
double precioTemporada;
double incrementoTraslados;
double totalFinal;


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
        
        incrementoTraslados = 0;

        //no olvidar; hay que hacer un metodo que reciba un arraylist de turistas y lo agregue
        //en la tabla paquetes / turistas
        //Multiplicar los pasajes x 2 porque es ida y vuelta!!
        
        
          }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelResultados1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lTransMay = new javax.swing.JLabel();
        lTransMen = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lTransTotal = new javax.swing.JLabel();
        lAlojamientoTotal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lRegimen = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lSubtotal = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lTemporada = new javax.swing.JLabel();
        lSubtotalPaquete = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lTraslados = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        panelGrupoTuristas = new javax.swing.JPanel();
        btAgregarTuristas1 = new javax.swing.JButton();
        tbEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tTuristas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lMen = new javax.swing.JLabel();
        lMay = new javax.swing.JLabel();
        lConformacion = new javax.swing.JLabel();
        panelDestino = new javax.swing.JPanel();
        cbOrigen = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbDestino = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jcDesde = new com.toedter.calendar.JDateChooser();
        jcHasta = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbTransportesRecorridos = new javax.swing.JLabel();
        lbTransportes = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelPresupuesto1 = new javax.swing.JPanel();
        lbTransportes1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTransportes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbAlojamientos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbRegimen = new javax.swing.JComboBox<>();
        rbTraslados = new javax.swing.JRadioButton();
        btVerOpciones = new javax.swing.JButton();
        btCalcular1 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        panelResultados1.setBackground(new java.awt.Color(121, 176, 213));
        panelResultados1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRESUPUESTO 1 - Detalle de valores de los Servicios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 10))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setText("Valor transporte para Menores:");

        jLabel16.setText("Valor transporte para Mayores:");

        lTransMay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTransMay.setText(".");

        lTransMen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTransMen.setText(".");

        jLabel17.setBackground(new java.awt.Color(51, 51, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
        jLabel18.setText("Valor del Alojamiento:");

        jLabel19.setBackground(new java.awt.Color(51, 51, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Adicional por Régimen:");

        lRegimen.setForeground(new java.awt.Color(0, 102, 102));
        lRegimen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lRegimen.setText(".");

        jLabel20.setBackground(new java.awt.Color(51, 51, 255));
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Sub-total Servicios:");

        lSubtotal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lSubtotal.setText(".");

        jLabel21.setBackground(new java.awt.Color(51, 51, 255));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Adicional por Temporada:");

        lTemporada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTemporada.setText(".");

        lSubtotalPaquete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lSubtotalPaquete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lSubtotalPaquete.setText(".");

        jLabel22.setBackground(new java.awt.Color(51, 51, 255));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Sub-total Paquete:");

        jLabel23.setBackground(new java.awt.Color(51, 51, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Traslados:");

        jLabel24.setBackground(new java.awt.Color(51, 51, 255));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("TOTAL :");

        lTraslados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTraslados.setText(".");

        lTotal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTotal.setText(".");

        javax.swing.GroupLayout panelResultados1Layout = new javax.swing.GroupLayout(panelResultados1);
        panelResultados1.setLayout(panelResultados1Layout);
        panelResultados1Layout.setHorizontalGroup(
            panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel15)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lTransMen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lTransMay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                            .addComponent(lTransTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAlojamientoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTemporada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lSubtotalPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTraslados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelResultados1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lAlojamientoTotal, lTransMay, lTransMen, lTransTotal});

        panelResultados1Layout.setVerticalGroup(
            panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultados1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(lTransMen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTransMay))
                    .addGroup(panelResultados1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lTransTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lAlojamientoTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRegimen)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lTemporada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lSubtotalPaquete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lTraslados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelResultados1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lTransMay, lTransMen});

        btAgregarTuristas1.setText("Agregar viajeros");
        btAgregarTuristas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarTuristas1ActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Viajeros Menores:");

        jLabel2.setText("Viajeros Mayores:");

        lMen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMen.setText(".");

        lMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMay.setText(".");

        javax.swing.GroupLayout panelGrupoTuristasLayout = new javax.swing.GroupLayout(panelGrupoTuristas);
        panelGrupoTuristas.setLayout(panelGrupoTuristasLayout);
        panelGrupoTuristasLayout.setHorizontalGroup(
            panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                        .addComponent(btAgregarTuristas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lMen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panelGrupoTuristasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAgregarTuristas1, tbEliminar});

        panelGrupoTuristasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lMay, lMen});

        panelGrupoTuristasLayout.setVerticalGroup(
            panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoTuristasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGrupoTuristasLayout.createSequentialGroup()
                        .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lMen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lMay)
                            .addComponent(jLabel2)))
                    .addGroup(panelGrupoTuristasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAgregarTuristas1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tbEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        panelGrupoTuristasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAgregarTuristas1, tbEliminar});

        lConformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lConformacion.setText(".");

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addComponent(panelResultados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGrupoTuristas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lConformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelResultados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addComponent(panelGrupoTuristas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lConformacion)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Origen:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Destino:");

        jcDesde.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcDesdePropertyChange(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Desde:");

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hasta:");

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
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDestinoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelDestinoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jcDesde, jcHasta});

        panelDestinoLayout.setVerticalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelDestinoLayout.createSequentialGroup()
                            .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(28, 28, 28))
                        .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDestinoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbDestino, cbOrigen, jcDesde, jcHasta});

        lbTransportesRecorridos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportesRecorridos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTransportesRecorridos.setText("Paquetes turísticos");

        lbTransportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes.setForeground(new java.awt.Color(51, 51, 255));
        lbTransportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTransportes.setText("Confección de Presupuestos");

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        panelPresupuesto1.setBackground(new java.awt.Color(121, 176, 213));

        lbTransportes1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTransportes1.setForeground(new java.awt.Color(102, 102, 102));
        lbTransportes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTransportes1.setText("Seleccione medio de Transporte y alojamiento para el Paquete:");

        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Transporte:");

        cbTransportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransportesActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Alojamiento:");

        cbAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlojamientosActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Régimen:");

        cbRegimen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRegimenActionPerformed(evt);
            }
        });

        rbTraslados.setText("Traslados");
        rbTraslados.setBorder(null);
        rbTraslados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbTraslados.setFocusable(false);
        rbTraslados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbTraslados.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelPresupuesto1Layout = new javax.swing.GroupLayout(panelPresupuesto1);
        panelPresupuesto1.setLayout(panelPresupuesto1Layout);
        panelPresupuesto1Layout.setHorizontalGroup(
            panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresupuesto1Layout.createSequentialGroup()
                .addGroup(panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTransportes1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPresupuesto1Layout.createSequentialGroup()
                        .addGroup(panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPresupuesto1Layout.createSequentialGroup()
                                .addComponent(cbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbTraslados)
                                .addGap(67, 67, 67)))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        panelPresupuesto1Layout.setVerticalGroup(
            panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresupuesto1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTransportes1)
                .addGap(18, 18, 18)
                .addGroup(panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPresupuesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(rbTraslados))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btVerOpciones.setText("Ver Opciones Disponibles");
        btVerOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerOpcionesActionPerformed(evt);
            }
        });

        btCalcular1.setText("Calcular precio final del paquete");
        btCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcular1ActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTransportes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTransportesRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btVerOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPresupuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 464, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTransportesRecorridos)
                    .addComponent(lbTransportes))
                .addGap(18, 18, 18)
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVerOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPresupuesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCalcular1)
                    .addComponent(guardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVerOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerOpcionesActionPerformed
        
        
        //controlamos el enabled de los paneles, si están bloqueados significa que está consultando y quiere reconfigurar (turistas / destinos / fechas)
        if (panelGrupoTuristas.isEnabled()) {
             //debemos controlar que:
            //haya ingresado al menos un turista
            //Tenga seleccionados origen y destino 
            if ((contarMenores == 0 && contarMayores == 0) || cbOrigen.getSelectedIndex() == -1 || cbDestino.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Complete los datos solicitados por el sistema para poder ver las opciones disponibles", 
                                              "No es posible realizar la consulta", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Date fechaD = jcDesde.getDate();
            Date fechaH = jcHasta.getDate();

            // VerificaR que las fechas no sean nulas 
            if (fechaD == null || fechaH == null) {
                JOptionPane.showMessageDialog(this, "Seleccione fechas válidas para el viaje", 
                                              "Fechas Inválidas", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            //convertimos a localDate
            fechaDesde = fechaD.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fechaHasta = fechaH.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            if (fechaDesde.isBefore(fechaHoy)){
                JOptionPane.showMessageDialog(this, "El viaje no puede ser anterior al día de hoy!", 
                              "Fechas Inválidas", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            
            if (validarFechas(fechaDesde, fechaHasta)==false) {
                JOptionPane.showMessageDialog(this, "Seleccione fechas válidas para el viaje", 
                                              "Fechas Inválidas", JOptionPane.ERROR_MESSAGE);
                return;
            }    
            
            incrementoTemporada = calcularTarifa(fechaDesde); //Guardamos el incremento por Temporada para usarlo al final
            String conformacion = "Total de Viajeros :" + (contarMayores + contarMenores)+ " -  Días : " + ChronoUnit.DAYS.between(fechaDesde, fechaHasta) ;
            lConformacion.setText(conformacion); 
            
            cargarCombosFiltro();
            bloquearPanel(panelGrupoTuristas);
            bloquearPanel(panelDestino);
            habilitarPanel(panelOpciones);
            btVerOpciones.setText("Seleccionar viajeros y destinos");
            
            
            panelGrupoTuristas.repaint();
            panelDestino.repaint();
            panelOpciones.repaint();
            


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
//                String transMen = Double.toString(transporteMenores);
//                String transMay = Double.toString(transporteMayores);
//                String transTot = Double.toString(transporteTotal);
                lTransMen.setText(String.format("$%.2f", transporteMenores));
                lTransMay.setText(String.format("$%.2f", transporteMayores));
                lTransTotal.setText(String.format("$%.2f", transporteTotal));
            
            }    
        }    
        
    }//GEN-LAST:event_cbTransportesActionPerformed

    private void cbAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlojamientosActionPerformed
      
        if (cargandoComboBoxA==false){
            
            Alojamiento alojamientoSeleccionado = (Alojamiento) cbAlojamientos.getSelectedItem();

            if (alojamientoSeleccionado != null) {
                
                precioEstadia = aloData.precioTotalEstadia(alojamientoSeleccionado.getIdAlojamiento(), fechaDesde, fechaHasta);
//                String totalEstadia = Double.toString(precioEstadia);
                lAlojamientoTotal.setText(String.format("$%.2f", precioEstadia));
                if (cbRegimen.getSelectedItem() !=null){
                    calcularRegimen();
                }

            }    
        }    
        
        
    }//GEN-LAST:event_cbAlojamientosActionPerformed
    private void cargarComboRegimen(){
        //Cargamos el combo de Regimen
        cargandoComboBoxR = true;
        cbRegimen.removeAll();
        listadoR = (ArrayList) rData.listarRegimenes();
        for (Regimen regimen : listadoR) {
            cbRegimen.addItem(regimen);
        }
        cbRegimen.repaint();
        cbRegimen.updateUI();
        cbRegimen.setSelectedItem(null);
        cargandoComboBoxR = false;
    }
    private void cbRegimenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRegimenActionPerformed

        if (cargandoComboBoxR == false){    
            calcularRegimen();
        }
    }//GEN-LAST:event_cbRegimenActionPerformed

    private void jcDesdePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcDesdePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDesdePropertyChange

    private void calcularRegimen(){

        if (cbAlojamientos.getSelectedItem()!=null){
            Regimen regimenSeleccionado = (Regimen) cbRegimen.getSelectedItem();
            double cargo = regimenSeleccionado.getCargoExtra();
            
            //precioEstadia =Double.parseDouble(lAlojamientoTotal.getText());
            
            incrementoRegimen = (cargo * precioEstadia)/100;
//            String adicional = Double.toString(incrementoRegimen);
            lRegimen.setText(String.format("$%.2f", incrementoRegimen));
            
        }

    }
    
    private void CalcularTotales(){

        if (panelPresupuesto1.isEnabled()) {    
          // Subtotal: Transporte + Estadia + Regimen
          double subtotal = transporteTotal + precioEstadia + incrementoRegimen;
          lSubtotal.setText(String.format("$%.2f", subtotal));

          //Sacamos el incremento por temporada
          double temporada = (subtotal * incrementoTemporada)- subtotal;
          lTemporada.setText(String.format("$%.2f", temporada));

          //SUB TOTAL PAQUETE: Subtotal + Incremento por temporada
          double total  = subtotal + temporada;
          lSubtotalPaquete.setText(String.format("$%.2f", total));


          if (rbTraslados.isSelected()) {
              incrementoTraslados = (total * 1) /100;
              lTraslados.setText(String.format("$%.2f", incrementoTraslados));
          }    

          //TOTAL: Subtotal Paquete + traslados
          totalFinal  = total + incrementoTraslados;
          lTotal.setText(String.format("$%.2f", totalFinal));


          bloquearPanel(panelPresupuesto1);
          btCalcular1.setText("Definir nuevamente");
          panelPresupuesto1.repaint();
      }else{ 
          habilitarPanel(panelPresupuesto1);
          btCalcular1.setText("Calcular precio final del paquete");
          panelPresupuesto1.repaint(); 

      }    
       
    }
    
    private void btCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcular1ActionPerformed

        CalcularTotales();

    }//GEN-LAST:event_btCalcular1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    
            if (cbTransportes.getSelectedItem()!=null || cbAlojamientos.getSelectedItem() !=null || cbRegimen.getSelectedItem()!=null  ) {  

                CalcularTotales();
                paquete = new Paquete((Ciudad) cbOrigen.getSelectedItem(),(Ciudad) cbDestino.getSelectedItem(), fechaDesde, fechaHasta, (Transporte) cbTransportes.getSelectedItem(),(Alojamiento) cbAlojamientos.getSelectedItem(), (Regimen) cbRegimen.getSelectedItem(), incrementoTraslados , totalFinal, isSelected);
                pData.agregarPaquete(paquete);
        
            }
        
    }//GEN-LAST:event_guardarActionPerformed
    

    
    
    private void cargarCombosFiltro(){
     
       
        cargarComboTransporte();
        cargarComboAlojamientos();
        cargarComboRegimen();
        
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
        cargandoComboBoxA = true;
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
        cargandoComboBoxA = false;

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
    
    public boolean validarFechas(LocalDate jcDesde, LocalDate jcHasta) {
        return jcDesde.isBefore(jcHasta);
    }

    public double calcularTarifa(LocalDate jcDesde) {
        
        int dia = jcDesde.getDayOfMonth();
        int mes = jcDesde.getMonthValue();

        // Verificación de los rangos de fecha
        if ((mes == 12 && dia >= 15) || (mes == 1) || (mes == 2 && dia <= 28) || 
            (mes == 7)) {
            return 1.30; // TEMPORADA ALTA (del 15/12 al 28/02 y todo julio)
        } else if ((mes == 9 && dia >= 21) || (mes == 10) || (mes == 11) ||  
                   (mes == 12 && dia <= 20) || (mes == 4 && dia >= 13 && dia <= 19)) {
            return 1.15; // TEMPORADA MEDIA (primavera y semana santa (2025))
        } else {
            return 1.00; // TEMPORADA BAJA
        }
    }
//    private void calcularPrecio() {
//        Date fechaSeleccionada = jcDesde.getDate();
//        if (fechaSeleccionada != null) {
//            LocalDate fechaSalida = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            double precioFinal = precioTemporada(fechaSalida);
//            JOptionPane.showMessageDialog(this, "El precio se actualizo segun la temporada");
//            } else {
//                JOptionPane.showMessageDialog(this, "Por favor selecciona una fecha");
//            }
//    }

//    private double precioTemporada(LocalDate fechaSalida) {
//        Month mes = fechaSalida.getMonth();
//        double precioFinal = precioTemporada;
//
//        if (temporadaAlta(mes)) {
//            precioFinal += precioTemporada * 0.30; // 30% mas de aumento en temp alta
//        } else if (temporadaMedia(mes)) {
//            precioFinal += precioTemporada * 0.15; // 15% mas de aumento en temp media
//        } 
//            return precioFinal;
//        }
//
//    private boolean temporadaAlta(Month mes) {
//            return mes == Month.JANUARY || mes == Month.FEBRUARY || mes == Month.MARCH;
//        }
//
//    private boolean temporadaMedia(Month mes) {
//            return mes == Month.JUNE || mes == Month.JULY;
//        }
//        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarTuristas1;
    private javax.swing.JButton btCalcular1;
    private javax.swing.JButton btVerOpciones;
    private javax.swing.JComboBox<Alojamiento> cbAlojamientos;
    private javax.swing.JComboBox<Ciudad> cbDestino;
    private javax.swing.JComboBox<Ciudad> cbOrigen;
    private javax.swing.JComboBox<Regimen> cbRegimen;
    private javax.swing.JComboBox<Transporte> cbTransportes;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jcDesde;
    private com.toedter.calendar.JDateChooser jcHasta;
    private javax.swing.JLabel lAlojamientoTotal;
    private javax.swing.JLabel lConformacion;
    private javax.swing.JLabel lMay;
    private javax.swing.JLabel lMen;
    private javax.swing.JLabel lRegimen;
    private javax.swing.JLabel lSubtotal;
    private javax.swing.JLabel lSubtotalPaquete;
    private javax.swing.JLabel lTemporada;
    private javax.swing.JLabel lTotal;
    private javax.swing.JLabel lTransMay;
    private javax.swing.JLabel lTransMen;
    private javax.swing.JLabel lTransTotal;
    private javax.swing.JLabel lTraslados;
    private javax.swing.JLabel lbTransportes;
    private javax.swing.JLabel lbTransportes1;
    private javax.swing.JLabel lbTransportesRecorridos;
    private javax.swing.JPanel panelDestino;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelGrupoTuristas;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPresupuesto1;
    private javax.swing.JPanel panelResultados1;
    private javax.swing.JRadioButton rbTraslados;
    private javax.swing.JTable tTuristas;
    private javax.swing.JButton tbEliminar;
    // End of variables declaration//GEN-END:variables
}
