package Interfaz;


import Clases.Comparador;
import Clases.Donacion;
import Lógica.Ejecutable;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author david
 */
public class buscador extends javax.swing.JFrame {
        int xMouse, yMouse;

    /**
     * Creates new form buscador
     */
    public buscador() {
        initComponents();
        mostrarDonaciones();
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backpanel = new javax.swing.JPanel();
        ordenar = new javax.swing.JLabel();
        backpanel1 = new javax.swing.JPanel();
        Regreso = new javax.swing.JLabel();
        helperfood = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitpanel = new javax.swing.JPanel();
        exitlabel = new javax.swing.JLabel();
        iniciosesion = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setToolTipText("");
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(0, 170, 225));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 450, 300));

        backpanel.setBackground(new java.awt.Color(0, 134, 190));

        ordenar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ordenar.setForeground(new java.awt.Color(255, 255, 255));
        ordenar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordenar.setText("ORDENAR");
        ordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordenarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ordenarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordenarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backpanelLayout = new javax.swing.GroupLayout(backpanel);
        backpanel.setLayout(backpanelLayout);
        backpanelLayout.setHorizontalGroup(
            backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        backpanelLayout.setVerticalGroup(
            backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backpanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(backpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 90, 40));

        backpanel1.setBackground(new java.awt.Color(0, 134, 190));

        Regreso.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Regreso.setForeground(new java.awt.Color(255, 255, 255));
        Regreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regreso.setText("REGRESAR");
        Regreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backpanel1Layout = new javax.swing.GroupLayout(backpanel1);
        backpanel1.setLayout(backpanel1Layout);
        backpanel1Layout.setHorizontalGroup(
            backpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(backpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backpanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        backpanel1Layout.setVerticalGroup(
            backpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(backpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backpanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(backpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 90, 40));

        helperfood.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        helperfood.setForeground(new java.awt.Color(255, 255, 255));
        helperfood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helperfood.setText("Helper Food");
        bg.add(helperfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 260, 40));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/logo.png"))); // NOI18N
        bg.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 280, 150));

        fondo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/city.png"))); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitpanel.setBackground(new java.awt.Color(255, 255, 255));
        exitpanel.setPreferredSize(new java.awt.Dimension(40, 40));

        exitlabel.setBackground(new java.awt.Color(255, 255, 255));
        exitlabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        exitlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitlabel.setText("X");
        exitlabel.setToolTipText("");
        exitlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitpanelLayout = new javax.swing.GroupLayout(exitpanel);
        exitpanel.setLayout(exitpanelLayout);
        exitpanelLayout.setHorizontalGroup(
            exitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitpanelLayout.setVerticalGroup(
            exitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        iniciosesion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        iniciosesion.setText("DONACIONES");
        bg.add(iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 30));

        logo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/favicon.png"))); // NOI18N
        logo.setText("HELPER FOOD");
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 220, 30));

        Buscador.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Buscador.setForeground(new java.awt.Color(204, 204, 204));
        Buscador.setText("Buscar");
        Buscador.setToolTipText("");
        Buscador.setBorder(null);
        Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscadorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BuscadorMouseReleased(evt);
            }
        });
        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });
        Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscadorKeyReleased(evt);
            }
        });
        bg.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 270, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 270, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarMouseClicked
        limpiarTabla();
        Collections.sort(Ejecutable.getListaDonaciones(), new Comparador());
        ArrayList <Donacion> Lista = Ejecutable.getListaDonaciones();
        Object o[] = null;
        for (int i = 0; i < Lista.size(); i++) {
            Donacion c = (Donacion) Lista.get(i);
            M.addRow(o);
            M.setValueAt(c.getAlimento(), i, 0);
            M.setValueAt(c.getCantidad(), i, 1);
            M.setValueAt(c.getDonante().getContacto(), i, 2);
            M.setValueAt(c.getDonante().getUbicacion(), i, 3);
            M.setValueAt(c.getFechaCaducidad(), i, 4);
        }
    }//GEN-LAST:event_ordenarMouseClicked

    private void ordenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarMouseEntered
        backpanel.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_ordenarMouseEntered

    private void ordenarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarMouseExited
        backpanel.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_ordenarMouseExited

    private void RegresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresoMouseClicked
        Ejecutable.setBeneficiarioActivo(null);
        sesion inicioSesion = new sesion();
        inicioSesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresoMouseClicked

    private void RegresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresoMouseEntered
        backpanel1.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_RegresoMouseEntered

    private void RegresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresoMouseExited
        backpanel1.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_RegresoMouseExited

    private void exitlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitlabelMouseClicked

    private void exitlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseEntered
        exitpanel.setBackground(Color.red);
        exitlabel.setForeground(Color.white);
    }//GEN-LAST:event_exitlabelMouseEntered

    private void exitlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseExited
        exitpanel.setBackground(Color.white);
        exitlabel.setForeground(Color.black);
    }//GEN-LAST:event_exitlabelMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void BuscadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMousePressed
        if(Buscador.getText().equals("Buscar")){
            Buscador.setText("");
            Buscador.setForeground(Color.black);
        }
    }//GEN-LAST:event_BuscadorMousePressed

    private void BuscadorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMouseReleased

    }//GEN-LAST:event_BuscadorMouseReleased

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
        
    }//GEN-LAST:event_BuscadorActionPerformed

    private void BuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscadorKeyReleased
        actualizarTabla();
        String respuesta = Buscador.getText();
        for(Donacion c : Ejecutable.getListaDonaciones()){
            if(c.getAlimento().equals(respuesta)){
                int i = (Ejecutable.getListaDonaciones().indexOf(c));
                limpiarTabla();
                Object o[] = null;
                mostrarDonaciones();
                M.addRow(o);
                M.setValueAt(Ejecutable.getListaDonaciones().get(i).getAlimento(), 0, 0);
                M.setValueAt(Ejecutable.getListaDonaciones().get(i).getCantidad(), 0, 1);
                M.setValueAt(Ejecutable.getListaDonaciones().get(i).getFechaCaducidad(), 0, 2);
                break;
            }
        }
    }//GEN-LAST:event_BuscadorKeyReleased

    DefaultTableModel M;
    
    private void actualizarTabla(){
        limpiarTabla();
        ArrayList<Donacion> Lista = Ejecutable.getListaDonaciones();
        Object o[] = null;
        for (int i = 0; i < Lista.size(); i++) {
            Donacion c = (Donacion) Lista.get(i);
            M.addRow(o);
            M.setValueAt(c.getAlimento(), i, 0);
            M.setValueAt(c.getCantidad(), i, 1);
            M.setValueAt(c.getDonante().getContacto(), i, 2);
            M.setValueAt(c.getDonante().getUbicacion(), i, 3);
            M.setValueAt(c.getFechaCaducidad(), i, 4);
        }
    }
    
    private void limpiarTabla(){
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            M.removeRow(i);
            i-=1;
        }
    }
    
    private void mostrarDonaciones() {                                         
        try{
            M = (new DefaultTableModel(null, new String[]{
                "Alimento", "Cantidad", "Contacto", "Ubicación", "Fecha de Caducidad"}));
            jTable1.setModel(M);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
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
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscador;
    private javax.swing.JLabel Regreso;
    private javax.swing.JPanel backpanel;
    private javax.swing.JPanel backpanel1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitlabel;
    private javax.swing.JPanel exitpanel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel helperfood;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel iniciosesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ordenar;
    // End of variables declaration//GEN-END:variables
}
