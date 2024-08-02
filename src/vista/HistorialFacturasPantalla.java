package vista;

import controlador.ControladorHistorialFacturas;
import controlador.ControladorHistorialOrdenes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.Timer;
import modelo.base_de_datos.HistorialFacturasDAO;
import modelo.base_de_datos.HistorialOrdenesDAO;
import modelo.entidades.HistorialOrdenes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Badal
 */
public class HistorialFacturasPantalla extends javax.swing.JPanel {

  /**
   * Creates new form Reservas
   */
  
  Timer timer;
  ControladorHistorialFacturas chf;
  HistorialFacturasDAO hfDAO = new HistorialFacturasDAO();
 
 
  
  
  public HistorialFacturasPantalla() {
    initComponents();
    
    chf = new ControladorHistorialFacturas(this, hfDAO);
    chf.actualizarTabla();
    chf.setTotal();

    //Fecha y hora actuales
    ActionListener actionListener = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        Date date = new Date();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String time = timeFormat.format(date);
        lHoraReal.setText(time);
        
        Date date2 = new Date();
        DateFormat timeFormat2 = new SimpleDateFormat("yyyy/MM/dd");
        String time2 = timeFormat2.format(date2);
        lFechaReal.setText(time2);
        
        
      }  
    };
    timer = new Timer(1000, actionListener);
    timer.setInitialDelay(0);
    timer.start();
  }

  public HistorialFacturasPantalla(String nombre, int personas, String comentarios, Date fecha, Date hora, int numeroMesa) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  public HistorialFacturasPantalla(int i, String string, int i0, String string0, Date date, Date date0, int i1) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    timePicker = new com.raven.swing.TimePicker();
    date = new com.raven.datechooser.DateChooser();
    pFondo = new javax.swing.JPanel();
    lFacturas = new javax.swing.JLabel();
    bEliminar = new javax.swing.JButton();
    spHistorialFacturas = new javax.swing.JScrollPane();
    tHistorialFacturas = new javax.swing.JTable();
    pFechaYHoraActual = new javax.swing.JPanel();
    lFechaActual = new javax.swing.JLabel();
    lHoraActual = new javax.swing.JLabel();
    lFechaReal = new javax.swing.JLabel();
    lHoraReal = new javax.swing.JLabel();
    lTotal = new javax.swing.JLabel();
    lTotalValor = new javax.swing.JLabel();

    timePicker.setForeground(new java.awt.Color(204, 93, 93));
    timePicker.set24hourMode(true);

    date.setDateFormat("yyyy-MM-dd");

    pFondo.setBackground(new java.awt.Color(225, 218, 206));
    pFondo.setPreferredSize(new java.awt.Dimension(1210, 530));

    lFacturas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lFacturas.setForeground(new java.awt.Color(0, 0, 0));
    lFacturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lFacturas.setText("Historial Facturas");

    bEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    bEliminar.setForeground(new java.awt.Color(255, 102, 102));
    bEliminar.setText("ELIMINAR");
    bEliminar.setOpaque(true);
    bEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bEliminarActionPerformed(evt);
      }
    });

    tHistorialFacturas.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Id", "Fecha", "Total"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Object.class, java.lang.String.class, java.lang.Float.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    spHistorialFacturas.setViewportView(tHistorialFacturas);
    if (tHistorialFacturas.getColumnModel().getColumnCount() > 0) {
      tHistorialFacturas.getColumnModel().getColumn(0).setMaxWidth(40);
    }

    pFechaYHoraActual.setBackground(new java.awt.Color(250, 239, 216));
    pFechaYHoraActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    lFechaActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lFechaActual.setForeground(new java.awt.Color(0, 0, 0));
    lFechaActual.setText("Fecha actual:");

    lHoraActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lHoraActual.setForeground(new java.awt.Color(0, 0, 0));
    lHoraActual.setText("Hora actual:");

    lFechaReal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lFechaReal.setText("jLabel3");

    lHoraReal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lHoraReal.setText("jLabel3");

    javax.swing.GroupLayout pFechaYHoraActualLayout = new javax.swing.GroupLayout(pFechaYHoraActual);
    pFechaYHoraActual.setLayout(pFechaYHoraActualLayout);
    pFechaYHoraActualLayout.setHorizontalGroup(
      pFechaYHoraActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pFechaYHoraActualLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(pFechaYHoraActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lFechaActual)
          .addComponent(lHoraActual))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(pFechaYHoraActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lFechaReal)
          .addComponent(lHoraReal))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    pFechaYHoraActualLayout.setVerticalGroup(
      pFechaYHoraActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pFechaYHoraActualLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(pFechaYHoraActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lFechaReal)
          .addComponent(lFechaActual))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(pFechaYHoraActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lHoraActual)
          .addComponent(lHoraReal))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    lTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lTotal.setForeground(new java.awt.Color(0, 0, 0));
    lTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    lTotal.setText("TOTAL: ");

    lTotalValor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    lTotalValor.setForeground(new java.awt.Color(0, 102, 0));
    lTotalValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    lTotalValor.setText("32 $");

    javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
    pFondo.setLayout(pFondoLayout);
    pFondoLayout.setHorizontalGroup(
      pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pFondoLayout.createSequentialGroup()
        .addGap(99, 99, 99)
        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(pFondoLayout.createSequentialGroup()
            .addComponent(lTotal)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(pFondoLayout.createSequentialGroup()
            .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(pFondoLayout.createSequentialGroup()
                .addComponent(lFacturas)
                .addGap(375, 375, 375)
                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(spHistorialFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
            .addComponent(pFechaYHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(77, 77, 77))))
    );
    pFondoLayout.setVerticalGroup(
      pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pFondoLayout.createSequentialGroup()
        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(pFondoLayout.createSequentialGroup()
            .addContainerGap(39, Short.MAX_VALUE)
            .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lFacturas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(bEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(spHistorialFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(pFondoLayout.createSequentialGroup()
            .addGap(57, 57, 57)
            .addComponent(pFechaYHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addGap(18, 18, 18)
        .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lTotal)
          .addComponent(lTotalValor))
        .addGap(23, 23, 23))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
  
    chf.eliminar();
    
  }//GEN-LAST:event_bEliminarActionPerformed

  
  public JTable getTabla(){
    return tHistorialFacturas;
  }
  
  public JLabel getTotalValor(){
    return  lTotalValor;
  }
  
 
  
  public int[] getOrdenesAEliminar(){
    return tHistorialFacturas.getSelectedRows();
  }
 

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bEliminar;
  private com.raven.datechooser.DateChooser date;
  private javax.swing.JLabel lFacturas;
  private javax.swing.JLabel lFechaActual;
  private javax.swing.JLabel lFechaReal;
  private javax.swing.JLabel lHoraActual;
  private javax.swing.JLabel lHoraReal;
  private javax.swing.JLabel lTotal;
  private javax.swing.JLabel lTotalValor;
  private javax.swing.JPanel pFechaYHoraActual;
  private javax.swing.JPanel pFondo;
  private javax.swing.JScrollPane spHistorialFacturas;
  private javax.swing.JTable tHistorialFacturas;
  private com.raven.swing.TimePicker timePicker;
  // End of variables declaration//GEN-END:variables
}
