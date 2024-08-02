/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.ControladorMesasYOrdenes;
import controlador.CoordinadorDeVentanas;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.base_de_datos.LineaTiquetDAO;

/**
 *
 * @author Badal
 */
public class MesasYOrdenes extends javax.swing.JPanel {

  /**
   * Creates new form pMesasYOrdenes
   */
  CoordinadorDeVentanas cdv;
  CoordinadorDeVentanas cdv2;
  ControladorMesasYOrdenes cmyo;
  CardLayout cl = new CardLayout();
  JButton[] listaBotones = new JButton[19];
  VentanaPrincipal vp;
  JPanel pCl;
  Orden orden;
  LineaTiquetDAO ltDAO = new LineaTiquetDAO();
  
  
  
  
  public MesasYOrdenes(VentanaPrincipal principal, JPanel panel) {
    initComponents();
   vp = principal;
   cl = vp.getCL();
   pCl = panel;
  
   cl = (CardLayout) pCl.getLayout();
   
   cdv = new CoordinadorDeVentanas(pCl,cl);
   cmyo = new ControladorMesasYOrdenes(this, ltDAO);
   
   
   
   listaBotones[1] = bMesa1;
   listaBotones[2] = bMesa2;
   listaBotones[3] = bMesa3;
   listaBotones[4] = bMesa4;
   listaBotones[5] = bMesa5;
   listaBotones[6] = bMesa6;
   listaBotones[7] = bMesa7;
   listaBotones[8] = bMesa8;
   listaBotones[9] = bMesa9;
   listaBotones[10] = bMesa10;
   listaBotones[11] = bMesa11;
   listaBotones[12] = bMesa12;
   listaBotones[13] = bMesa13;
   listaBotones[14] = bMesa14;
   listaBotones[15] = bMesa15;
   listaBotones[16] = bMesa16;
   listaBotones[17] = bMesa17;
   listaBotones[18] = bMesa18;
   
  cmyo.colorarMesas();
   
   
 
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pMesas = new javax.swing.JPanel();
    lMesas = new javax.swing.JLabel();
    bMesa1 = new javax.swing.JButton();
    bMesa2 = new javax.swing.JButton();
    bMesa3 = new javax.swing.JButton();
    bMesa4 = new javax.swing.JButton();
    bMesa5 = new javax.swing.JButton();
    bMesa6 = new javax.swing.JButton();
    bMesa7 = new javax.swing.JButton();
    bMesa8 = new javax.swing.JButton();
    bMesa9 = new javax.swing.JButton();
    bMesa10 = new javax.swing.JButton();
    bMesa11 = new javax.swing.JButton();
    bMesa12 = new javax.swing.JButton();
    bMesa13 = new javax.swing.JButton();
    bMesa14 = new javax.swing.JButton();
    bMesa15 = new javax.swing.JButton();
    bMesa16 = new javax.swing.JButton();
    bMesa17 = new javax.swing.JButton();
    bMesa18 = new javax.swing.JButton();

    setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pMesas.setBackground(new java.awt.Color(225, 218, 206));
    pMesas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    lMesas.setBackground(new java.awt.Color(225, 218, 206));
    lMesas.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
    lMesas.setForeground(new java.awt.Color(0, 0, 0));
    lMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lMesas.setText("MESAS");
    lMesas.setOpaque(true);

    bMesa1.setBackground(new java.awt.Color(153, 255, 153));
    bMesa1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa1.setForeground(new java.awt.Color(0, 0, 0));
    bMesa1.setText("1");
    bMesa1.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa1ActionPerformed(evt);
      }
    });

    bMesa2.setBackground(new java.awt.Color(153, 255, 153));
    bMesa2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa2.setForeground(new java.awt.Color(0, 0, 0));
    bMesa2.setText("2");
    bMesa2.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa2ActionPerformed(evt);
      }
    });

    bMesa3.setBackground(new java.awt.Color(153, 255, 153));
    bMesa3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa3.setForeground(new java.awt.Color(0, 0, 0));
    bMesa3.setText("3");
    bMesa3.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa3ActionPerformed(evt);
      }
    });

    bMesa4.setBackground(new java.awt.Color(153, 255, 153));
    bMesa4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa4.setForeground(new java.awt.Color(0, 0, 0));
    bMesa4.setText("4");
    bMesa4.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa4ActionPerformed(evt);
      }
    });

    bMesa5.setBackground(new java.awt.Color(153, 255, 153));
    bMesa5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa5.setForeground(new java.awt.Color(0, 0, 0));
    bMesa5.setText("5");
    bMesa5.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa5ActionPerformed(evt);
      }
    });

    bMesa6.setBackground(new java.awt.Color(153, 255, 153));
    bMesa6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa6.setForeground(new java.awt.Color(0, 0, 0));
    bMesa6.setText("6");
    bMesa6.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa6ActionPerformed(evt);
      }
    });

    bMesa7.setBackground(new java.awt.Color(153, 255, 153));
    bMesa7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa7.setForeground(new java.awt.Color(0, 0, 0));
    bMesa7.setText("7");
    bMesa7.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa7ActionPerformed(evt);
      }
    });

    bMesa8.setBackground(new java.awt.Color(153, 255, 153));
    bMesa8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa8.setForeground(new java.awt.Color(0, 0, 0));
    bMesa8.setText("8");
    bMesa8.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa8ActionPerformed(evt);
      }
    });

    bMesa9.setBackground(new java.awt.Color(153, 255, 153));
    bMesa9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa9.setForeground(new java.awt.Color(0, 0, 0));
    bMesa9.setText("9");
    bMesa9.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa9ActionPerformed(evt);
      }
    });

    bMesa10.setBackground(new java.awt.Color(153, 255, 153));
    bMesa10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa10.setForeground(new java.awt.Color(0, 0, 0));
    bMesa10.setText("10");
    bMesa10.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa10.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa10ActionPerformed(evt);
      }
    });

    bMesa11.setBackground(new java.awt.Color(153, 255, 153));
    bMesa11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa11.setForeground(new java.awt.Color(0, 0, 0));
    bMesa11.setText("11");
    bMesa11.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa11.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa11ActionPerformed(evt);
      }
    });

    bMesa12.setBackground(new java.awt.Color(153, 255, 153));
    bMesa12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa12.setForeground(new java.awt.Color(0, 0, 0));
    bMesa12.setText("12");
    bMesa12.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa12.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa12ActionPerformed(evt);
      }
    });

    bMesa13.setBackground(new java.awt.Color(153, 255, 153));
    bMesa13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa13.setForeground(new java.awt.Color(0, 0, 0));
    bMesa13.setText("13");
    bMesa13.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa13ActionPerformed(evt);
      }
    });

    bMesa14.setBackground(new java.awt.Color(153, 255, 153));
    bMesa14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa14.setForeground(new java.awt.Color(0, 0, 0));
    bMesa14.setText("14");
    bMesa14.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa14ActionPerformed(evt);
      }
    });

    bMesa15.setBackground(new java.awt.Color(153, 255, 153));
    bMesa15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa15.setForeground(new java.awt.Color(0, 0, 0));
    bMesa15.setText("15");
    bMesa15.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa15.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa15ActionPerformed(evt);
      }
    });

    bMesa16.setBackground(new java.awt.Color(153, 255, 153));
    bMesa16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa16.setForeground(new java.awt.Color(0, 0, 0));
    bMesa16.setText("16");
    bMesa16.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa16.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa16ActionPerformed(evt);
      }
    });

    bMesa17.setBackground(new java.awt.Color(153, 255, 153));
    bMesa17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa17.setForeground(new java.awt.Color(0, 0, 0));
    bMesa17.setText("17");
    bMesa17.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa17.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa17ActionPerformed(evt);
      }
    });

    bMesa18.setBackground(new java.awt.Color(153, 255, 153));
    bMesa18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    bMesa18.setForeground(new java.awt.Color(0, 0, 0));
    bMesa18.setText("18");
    bMesa18.setBorder(new javax.swing.border.MatteBorder(null));
    bMesa18.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bMesa18ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout pMesasLayout = new javax.swing.GroupLayout(pMesas);
    pMesas.setLayout(pMesasLayout);
    pMesasLayout.setHorizontalGroup(
      pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMesasLayout.createSequentialGroup()
        .addGap(0, 41, Short.MAX_VALUE)
        .addComponent(lMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMesasLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(bMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(50, 50, 50)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(bMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(50, 50, 50)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(bMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(394, 394, 394))
    );
    pMesasLayout.setVerticalGroup(
      pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pMesasLayout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(lMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(45, 45, 45)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(45, 45, 45)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(45, 45, 45)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(45, 45, 45)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesa13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(45, 45, 45)
        .addGroup(pMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bMesa16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bMesa18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 52, Short.MAX_VALUE))
    );

    add(pMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-24, -9, 1230, 540));
  }// </editor-fold>//GEN-END:initComponents

  private void bMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa1ActionPerformed
    // TODO add your handling code here:
   
     orden = new Orden(vp, 1);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa1ActionPerformed

  private void bMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa2ActionPerformed
    // TODO add your handling code here:
   
     orden = new Orden(vp, 2);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
    
  }//GEN-LAST:event_bMesa2ActionPerformed

  private void bMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa3ActionPerformed
    // TODO add your handling code here:
  
     orden = new Orden(vp, 3);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
    
    
  }//GEN-LAST:event_bMesa3ActionPerformed

  private void bMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa4ActionPerformed
    // TODO add your handling code here:
   
     orden = new Orden(vp, 4);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
    
    
  }//GEN-LAST:event_bMesa4ActionPerformed

  private void bMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa5ActionPerformed
    // TODO add your handling code here:
   
     orden = new Orden(vp, 5);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa5ActionPerformed

  private void bMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa6ActionPerformed
    // TODO add your handling code here:
  
     orden = new Orden(vp, 6);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa6ActionPerformed

  private void bMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa7ActionPerformed
    // TODO add your handling code here:
  
     orden = new Orden(vp, 7);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa7ActionPerformed

  private void bMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa8ActionPerformed
    // TODO add your handling code here:
    
     orden = new Orden(vp, 8);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa8ActionPerformed

  private void bMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa9ActionPerformed
    // TODO add your handling code here:
  
     orden = new Orden(vp, 9);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa9ActionPerformed

  private void bMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa10ActionPerformed
    // TODO add your handling code here:

     orden = new Orden(vp, 10);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa10ActionPerformed

  private void bMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa11ActionPerformed
    // TODO add your handling code here:
    
     orden = new Orden(vp, 11);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa11ActionPerformed

  private void bMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa12ActionPerformed
    // TODO add your handling code here:
    
     orden = new Orden(vp, 12);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa12ActionPerformed

  private void bMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa13ActionPerformed
    // TODO add your handling code here:
     
     orden = new Orden(vp, 13);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa13ActionPerformed

  private void bMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa14ActionPerformed
    // TODO add your handling code here:
     
     orden = new Orden(vp, 14);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa14ActionPerformed

  private void bMesa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa15ActionPerformed
    // TODO add your handling code here:
      
     orden = new Orden(vp, 15);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa15ActionPerformed

  private void bMesa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa16ActionPerformed
    // TODO add your handling code here:
   
     orden = new Orden(vp, 16);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa16ActionPerformed

  private void bMesa17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa17ActionPerformed
    // TODO add your handling code here:
     
     orden = new Orden(vp, 17);
    
    
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa17ActionPerformed

  private void bMesa18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMesa18ActionPerformed
    // TODO add your handling code here:
      
     orden = new Orden(vp, 18);
    
   
    pCl.add(orden, "orden");
    cdv.mostrarVentana("orden");
  }//GEN-LAST:event_bMesa18ActionPerformed

  public JButton[] getBotonesMesa(){
    return listaBotones;
  }
  
  public JButton getMesa5(){
    return bMesa5;
  }
  
  
  
  
 

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bMesa1;
  private javax.swing.JButton bMesa10;
  private javax.swing.JButton bMesa11;
  private javax.swing.JButton bMesa12;
  private javax.swing.JButton bMesa13;
  private javax.swing.JButton bMesa14;
  private javax.swing.JButton bMesa15;
  private javax.swing.JButton bMesa16;
  private javax.swing.JButton bMesa17;
  private javax.swing.JButton bMesa18;
  private javax.swing.JButton bMesa2;
  private javax.swing.JButton bMesa3;
  private javax.swing.JButton bMesa4;
  private javax.swing.JButton bMesa5;
  private javax.swing.JButton bMesa6;
  private javax.swing.JButton bMesa7;
  private javax.swing.JButton bMesa8;
  private javax.swing.JButton bMesa9;
  private javax.swing.JLabel lMesas;
  private javax.swing.JPanel pMesas;
  // End of variables declaration//GEN-END:variables

  
  
}
