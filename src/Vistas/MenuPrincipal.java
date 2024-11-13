
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.text.Normalizer.Form;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class MenuPrincipal extends javax.swing.JFrame {


    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Paquetes Turísticos");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Media/fondoMain.png"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmPrincipal = new javax.swing.JMenu();
        jmTuristas = new javax.swing.JMenuItem();
        jmCiudades = new javax.swing.JMenuItem();
        jmTransportes = new javax.swing.JMenuItem();
        jmAlojamientos = new javax.swing.JMenuItem();
        jmRegimenes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmPresupuestos = new javax.swing.JMenuItem();
        jmModificar = new javax.swing.JMenuItem();
        jmEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmTuristasPaquetes = new javax.swing.JMenuItem();
        jmDestinosElegidos = new javax.swing.JMenuItem();
        jmUltimos2Meses = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        jmPrincipal.setText("Componentes");

        jmTuristas.setText("Turistas");
        jmTuristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTuristasActionPerformed(evt);
            }
        });
        jmPrincipal.add(jmTuristas);

        jmCiudades.setText("Ciudades");
        jmCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCiudadesActionPerformed(evt);
            }
        });
        jmPrincipal.add(jmCiudades);

        jmTransportes.setText("Transportes");
        jmTransportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTransportesActionPerformed(evt);
            }
        });
        jmPrincipal.add(jmTransportes);

        jmAlojamientos.setText("Alojamientos");
        jmAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlojamientosActionPerformed(evt);
            }
        });
        jmPrincipal.add(jmAlojamientos);

        jmRegimenes.setText("Regimenes");
        jmRegimenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegimenesActionPerformed(evt);
            }
        });
        jmPrincipal.add(jmRegimenes);

        jMenuBar1.add(jmPrincipal);

        jMenu1.setText("Paquetes Turisticos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmPresupuestos.setText("Confeccionar Presupuesto");
        jmPresupuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPresupuestosActionPerformed(evt);
            }
        });
        jMenu1.add(jmPresupuestos);

        jmModificar.setText("Modificar Presupuesto");
        jmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmModificar);

        jmEliminar.setText("Eliminar Paquetes Presupuestados");
        jmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Estadisticas");

        jmTuristasPaquetes.setText("Turistas por Paquetes");
        jmTuristasPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTuristasPaquetesActionPerformed(evt);
            }
        });
        jMenu2.add(jmTuristasPaquetes);

        jmDestinosElegidos.setText("Destinos mas elegidos");
        jmDestinosElegidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDestinosElegidosActionPerformed(evt);
            }
        });
        jMenu2.add(jmDestinosElegidos);

        jmUltimos2Meses.setText("Ultimos 2 meses");
        jmUltimos2Meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUltimos2MesesActionPerformed(evt);
            }
        });
        jMenu2.add(jmUltimos2Meses);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCiudadesActionPerformed

//        escritorio.removeAll();
//        escritorio.repaint();

        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormCiudades ciudades= new FormCiudades();
        ciudades.setVisible(true);
        escritorio.add(ciudades);
        escritorio.moveToFront(ciudades);
        int x = (escritorio.getWidth() - ciudades.getWidth()) / 2;
        int y = (escritorio.getHeight() - ciudades.getHeight()) / 2;
        ciudades.setLocation(x, y);
    }//GEN-LAST:event_jmCiudadesActionPerformed

    private void jmTransportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTransportesActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormTransportes transportes= new FormTransportes();
        transportes.setVisible(true);
        escritorio.add(transportes);
        escritorio.moveToFront(transportes);
        int x = (escritorio.getWidth() - transportes.getWidth()) / 2;
        int y = (escritorio.getHeight() - transportes.getHeight()) / 2;
        transportes.setLocation(x, y);
    }//GEN-LAST:event_jmTransportesActionPerformed


    private void jmTuristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTuristasActionPerformed
                
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        
        escritorio.removeAll();
        escritorio.repaint();
        FormTurista turista= new FormTurista();
        turista.setVisible(true);
        escritorio.add(turista);
        escritorio.moveToFront(turista);
        int x = (escritorio.getWidth() - turista.getWidth()) / 2;
        int y = (escritorio.getHeight() - turista.getHeight()) / 2;
        turista.setLocation(x, y);
    }//GEN-LAST:event_jmTuristasActionPerformed


    private void jmAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlojamientosActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();
        
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormAlojamientos alojamientos = new FormAlojamientos();
        alojamientos.setVisible(true);
        escritorio.add(alojamientos);
        escritorio.moveToFront(alojamientos);
        int x = (escritorio.getWidth() - alojamientos.getWidth()) / 2;
        int y = (escritorio.getHeight() - alojamientos.getHeight()) / 2;
        alojamientos.setLocation(x, y);
    }//GEN-LAST:event_jmAlojamientosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmPresupuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPresupuestosActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();

        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormVentaPaquetes paquetes = new FormVentaPaquetes();
        paquetes.setVisible(true);
        escritorio.add(paquetes);
        escritorio.moveToFront(paquetes);
        int x = (escritorio.getWidth() - paquetes.getWidth()) / 2;
        int y = (escritorio.getHeight() - paquetes.getHeight()) / 2;
        paquetes.setLocation(x, y);
    }//GEN-LAST:event_jmPresupuestosActionPerformed

    private void jmRegimenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegimenesActionPerformed
        
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        
//        escritorio.removeAll();
//        escritorio.repaint();
        FormRegimenes regimenes = new FormRegimenes();
        regimenes.setVisible(true);
        escritorio.add(regimenes);
        escritorio.moveToFront(regimenes);
        int x = (escritorio.getWidth() - regimenes.getWidth()) / 2;
        int y = (escritorio.getHeight() - regimenes.getHeight()) / 2;
        regimenes.setLocation(x, y);
    }//GEN-LAST:event_jmRegimenesActionPerformed

    private void jmTuristasPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTuristasPaquetesActionPerformed
        
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        
//        escritorio.removeAll();
//        escritorio.repaint();
        FormTuristaPorPaquete formTuristaPaquete = new FormTuristaPorPaquete();
        formTuristaPaquete.setVisible(true);
        escritorio.add(formTuristaPaquete);
        escritorio.moveToFront(formTuristaPaquete);
        int x = (escritorio.getWidth() - formTuristaPaquete.getWidth()) / 2;
        int y = (escritorio.getHeight() - formTuristaPaquete.getHeight()) / 2;
        formTuristaPaquete.setLocation(x, y);
    }//GEN-LAST:event_jmTuristasPaquetesActionPerformed

    private void jmDestinosElegidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDestinosElegidosActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();

        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormDestinosMasElegidos formDestinosMasElegidos = new FormDestinosMasElegidos();
        formDestinosMasElegidos.setVisible(true);
        escritorio.add(formDestinosMasElegidos);
        escritorio.moveToFront(formDestinosMasElegidos);
        int x = (escritorio.getWidth() - formDestinosMasElegidos.getWidth()) / 2;
        int y = (escritorio.getHeight() - formDestinosMasElegidos.getHeight()) / 2;
        formDestinosMasElegidos.setLocation(x, y);
    }//GEN-LAST:event_jmDestinosElegidosActionPerformed

    private void jmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();

        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormModificarPaquete formModificar = new FormModificarPaquete();
        formModificar.setVisible(true);
        escritorio.add(formModificar);
        escritorio.moveToFront(this);
        int x = (escritorio.getWidth() - formModificar.getWidth()) / 2;
        int y = (escritorio.getHeight() - formModificar.getHeight()) / 2;
        formModificar.setLocation(x, y);
        
    }//GEN-LAST:event_jmModificarActionPerformed


    private void jmUltimos2MesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUltimos2MesesActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormPaquetesUltimosMeses formUltimos = new FormPaquetesUltimosMeses();
        formUltimos.setVisible(true);
        escritorio.add(formUltimos);
        escritorio.moveToFront(this);
        int x = (escritorio.getWidth() - formUltimos.getWidth()) / 2;
        int y = (escritorio.getHeight() - formUltimos.getHeight()) / 2;
        formUltimos.setLocation(x, y);
         
    }//GEN-LAST:event_jmUltimos2MesesActionPerformed



    private void jmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();
        
        for (JInternalFrame frame : escritorio.getAllFrames()) {
        
        if (!frame.isIcon()) {
            frame.dispose();
        }
    }
        FormEliminarPaquete formEliminar = new FormEliminarPaquete();
        formEliminar.setVisible(true);
        escritorio.add(formEliminar);
        escritorio.moveToFront(this);
        int x = (escritorio.getWidth() - formEliminar.getWidth()) / 2;
        int y = (escritorio.getHeight() - formEliminar.getHeight()) / 2;
        formEliminar.setLocation(x, y);
    }//GEN-LAST:event_jmEliminarActionPerformed

    /**
     * @param args the command line arguments
     */


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmAlojamientos;
    private javax.swing.JMenuItem jmCiudades;
    private javax.swing.JMenuItem jmDestinosElegidos;
    private javax.swing.JMenuItem jmEliminar;
    private javax.swing.JMenuItem jmModificar;
    private javax.swing.JMenuItem jmPresupuestos;
    private javax.swing.JMenu jmPrincipal;
    private javax.swing.JMenuItem jmRegimenes;
    private javax.swing.JMenuItem jmTransportes;
    private javax.swing.JMenuItem jmTuristas;
    private javax.swing.JMenuItem jmTuristasPaquetes;
    private javax.swing.JMenuItem jmUltimos2Meses;
    // End of variables declaration//GEN-END:variables


}
