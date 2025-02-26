package vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import controlador.ControladorHistorialFacturas;
import controlador.ControladorHistorialOrdenes;
import controlador.ControladorMesasYOrdenes;
import controlador.ControladorVentanaPrincipal;
import controlador.CoordinadorDeVentanas;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.*;
import modelo.base_de_datos.EmpleadoDAO;
import modelo.base_de_datos.HistorialFacturasDAO;
import modelo.base_de_datos.HistorialOrdenesDAO;
import modelo.base_de_datos.LineaTiquetDAO;
import vista.MesasYOrdenes;


/**
 *
 * @author Badal
 */
public class VentanaPrincipal extends javax.swing.JFrame {

  /**
   * Creates new form MainScreen
   */
 
  Menu pMenu = new Menu();
  Orden pOrden = new Orden();
  ReservaPantalla pReservas = new ReservaPantalla();
  HistorialOrdenesPantalla pHistorialOrdenes = new HistorialOrdenesPantalla();
  CoordinadorDeVentanas cdv;
  CardLayout cardLayout;
  ControladorVentanaPrincipal cvp;
  EmpleadoDAO empDAO = new EmpleadoDAO();
  MesasYOrdenes pMesasYOrdenes;
  HistorialFacturasPantalla pFacturas = new HistorialFacturasPantalla();
  ControladorMesasYOrdenes cmyo;
  ControladorHistorialOrdenes cho;
  LineaTiquetDAO ltDAO = new LineaTiquetDAO();
  HistorialOrdenesDAO HoDAO = new HistorialOrdenesDAO();
  HistorialFacturasDAO hfDAO = new HistorialFacturasDAO();
  ControladorHistorialFacturas chf;
  
  
  
  public VentanaPrincipal() {
    initComponents();
     pMesasYOrdenes = new MesasYOrdenes(this, pCardLayout);
     cmyo = new ControladorMesasYOrdenes(pMesasYOrdenes,ltDAO);
     cho = new ControladorHistorialOrdenes(pHistorialOrdenes, HoDAO, hfDAO);
     chf = new ControladorHistorialFacturas(pFacturas, hfDAO);
    //Manejo de CardLayouts
    cardLayout = (CardLayout) pCardLayout.getLayout();
    cdv = new CoordinadorDeVentanas(pCardLayout, cardLayout );
   
    
    pCardLayout.add(pMesasYOrdenes,"mesas");
    pCardLayout.add(pMenu, "menu");
    pCardLayout.add(pReservas, "reservas");
    pCardLayout.add(pHistorialOrdenes,"ordenes");
    pCardLayout.add(pFacturas,"facturas");
    
    
 
    
    
    
    cdv.mostrarVentana("mesas");
    
    //Controlador
    cvp = new ControladorVentanaPrincipal(this, empDAO);
    cvp.insertarEmpleados();
    
    //Atras
  
    
    
    
    
    
                
    

    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jFrame1 = new javax.swing.JFrame();
    pNavegacion = new javax.swing.JPanel();
    bMesas = new javax.swing.JButton();
    bReservas = new javax.swing.JButton();
    bMenu = new javax.swing.JButton();
    bOrdenes = new javax.swing.JButton();
    bFacturas = new javax.swing.JButton();
    bSalir = new javax.swing.JButton();
    pCamarer = new javax.swing.JPanel();
    lCamarer = new javax.swing.JLabel();
    cbCamarer = new javax.swing.JComboBox<>();
    pCardLayout = new javax.swing.JPanel();
    mMenuBar = new javax.swing.JMenuBar();
    mMenu = new javax.swing.JMenu();
    mConfiguracion = new javax.swing.JMenu();

    javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
    jFrame1.getContentPane().setLayout(jFrame1Layout);
    jFrame1Layout.setHorizontalGroup(
      jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    jFrame1Layout.setVerticalGroup(
      jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setMaximumSize(new java.awt.Dimension(1200, 600));
    setResizable(false);
    setSize(new java.awt.Dimension(0, 0));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pNavegacion.setBackground(new java.awt.Color(178, 171, 160));
    pNavegacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 1, 1)));

    bMesas.setBackground(new java.awt.Color(255, 255, 204));
    bMesas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesas.setText("Mesas");
    bMesas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesasActionPerformed(evt);
      }
    });

    bReservas.setBackground(new java.awt.Color(255, 255, 204));
    bReservas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bReservas.setText("Reservas");
    bReservas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bReservasActionPerformed(evt);
      }
    });

    bMenu.setBackground(new java.awt.Color(255, 255, 204));
    bMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMenu.setText("Menú");
    bMenu.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMenuActionPerformed(evt);
      }
    });

    bOrdenes.setBackground(new java.awt.Color(255, 255, 204));
    bOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bOrdenes.setText("Historial de Órdenes");
    bOrdenes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bOrdenesActionPerformed(evt);
      }
    });

    bFacturas.setBackground(new java.awt.Color(255, 255, 204));
    bFacturas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bFacturas.setText("Historial de facturas");
    bFacturas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bFacturasActionPerformed(evt);
      }
    });

    bSalir.setBackground(new java.awt.Color(255, 51, 51));
    bSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bSalir.setForeground(new java.awt.Color(255, 255, 255));
    bSalir.setText("SALIR");
    bSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bSalirActionPerformed(evt);
      }
    });

    pCamarer.setBackground(new java.awt.Color(255, 255, 204));
    pCamarer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    pCamarer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lCamarer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lCamarer.setText("Camarer@:");
    pCamarer.add(lCamarer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

    cbCamarer.setBackground(new java.awt.Color(253, 220, 173));
    cbCamarer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    cbCamarer.setForeground(new java.awt.Color(0, 0, 0));
    cbCamarer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pepe", "Juanito", "Alejandro", "Manuel", " " }));
    pCamarer.add(cbCamarer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

    javax.swing.GroupLayout pNavegacionLayout = new javax.swing.GroupLayout(pNavegacion);
    pNavegacion.setLayout(pNavegacionLayout);
    pNavegacionLayout.setHorizontalGroup(
      pNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pNavegacionLayout.createSequentialGroup()
        .addGap(54, 54, 54)
        .addComponent(bMesas)
        .addGap(18, 18, 18)
        .addComponent(bReservas)
        .addGap(18, 18, 18)
        .addComponent(bMenu)
        .addGap(18, 18, 18)
        .addComponent(bOrdenes)
        .addGap(18, 18, 18)
        .addComponent(bFacturas)
        .addGap(18, 18, 18)
        .addComponent(pCamarer, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
        .addComponent(bSalir)
        .addGap(18, 18, 18))
    );
    pNavegacionLayout.setVerticalGroup(
      pNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pNavegacionLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(pNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesas)
          .addComponent(bReservas)
          .addComponent(bMenu)
          .addComponent(bOrdenes)
          .addComponent(bFacturas))
        .addContainerGap(18, Short.MAX_VALUE))
      .addGroup(pNavegacionLayout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addComponent(pCamarer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNavegacionLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(16, 16, 16))
    );

    getContentPane().add(pNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

    pCardLayout.setLayout(new java.awt.CardLayout());
    getContentPane().add(pCardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 530));

    mMenu.setText("Menú");
    mMenuBar.add(mMenu);

    mConfiguracion.setText("Configuración");
    mMenuBar.add(mConfiguracion);

    setJMenuBar(mMenuBar);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
    // TODO add your handling code here:
 
  
  }//GEN-LAST:event_bSalirActionPerformed

  private void bMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuActionPerformed
  
   
    // TODO add your handling code here:
    
   cdv.mostrarVentana("menu");
  }//GEN-LAST:event_bMenuActionPerformed

  private void bMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesasActionPerformed
    // TODO add your handling code here:
   cmyo.colorarMesas();
   cdv.mostrarVentana("mesas");
   
    
  }//GEN-LAST:event_bMesasActionPerformed

  private void bReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReservasActionPerformed
    // TODO add your handling code here:
    cdv.mostrarVentana("reservas");
  }//GEN-LAST:event_bReservasActionPerformed

  private void bOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdenesActionPerformed
    // TODO add your handling code here:
    cho.actualizarTabla();
    cho.setTotal();
    cdv.mostrarVentana("ordenes");
  }//GEN-LAST:event_bOrdenesActionPerformed

  private void bFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFacturasActionPerformed
    // TODO add your handling code here:
    chf.actualizarTabla();
    chf.setTotal();
    cdv.mostrarVentana("facturas");
  }//GEN-LAST:event_bFacturasActionPerformed

  
  public JComboBox getCBEmpleados(){
    return cbCamarer;
  }
  
  public JComboBox getCBNombreEmpleado(){
    return cbCamarer;
  }
  
  
  public CardLayout getCL(){
    return cardLayout;
  }
  
  public JPanel getPanel(){
    return pCardLayout;
  }
  
 public VentanaPrincipal getVP(){
   return this;
 }
 
  
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
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentanaPrincipal().setVisible(true);
      }
    });
  }
  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bFacturas;
  private javax.swing.JButton bMenu;
  private javax.swing.JButton bMesas;
  private javax.swing.JButton bOrdenes;
  private javax.swing.JButton bReservas;
  private javax.swing.JButton bSalir;
  private javax.swing.JComboBox<String> cbCamarer;
  private javax.swing.JFrame jFrame1;
  private javax.swing.JLabel lCamarer;
  private javax.swing.JMenu mConfiguracion;
  private javax.swing.JMenu mMenu;
  private javax.swing.JMenuBar mMenuBar;
  private javax.swing.JPanel pCamarer;
  private javax.swing.JPanel pCardLayout;
  private javax.swing.JPanel pNavegacion;
  // End of variables declaration//GEN-END:variables
}
