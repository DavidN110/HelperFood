package Interfaz;


import Lógica.Ejecutable;
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**


 */
public class principal extends javax.swing.JFrame {
    int xMouse, yMouse;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        Ejecutable.setDonanteActivo(null);
        Ejecutable.setBeneficiarioActivo(null);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        helperfood = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitpanel = new javax.swing.JPanel();
        exitlabel = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        crearCuenta = new javax.swing.JLabel();
        loginpanel1 = new javax.swing.JPanel();
        recibirDonar = new javax.swing.JLabel();
        iniciosesion = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName("bg"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>Para más información escribe a los correos dnagles@unal.edu.co y scruz@unal.edu.co");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 410, 60));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("<html>\nBienvenid@ a Helper Food, una propuesta para que puedas donar ó consumir productos en buen estado, puedes ingresar con tu identificación y contraseña para poder acceder a la lista de alimentos que los donadores han publicado o puedes agregar más alimentos para donar con su respectiva información, si aun no tienes una cuenta crea una presionando el botón de abajo, agradecemos tu respeto y buen uso de esta aplicación.");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 390, 160));

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

        exitlabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        exitlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitlabel.setText("X");
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
                .addGap(0, 790, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        loginpanel.setBackground(new java.awt.Color(0, 134, 190));

        crearCuenta.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        crearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        crearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearCuenta.setText("CREAR CUENTA");
        crearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearCuentaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addComponent(crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addComponent(crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(loginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 150, 50));

        loginpanel1.setBackground(new java.awt.Color(0, 134, 190));

        recibirDonar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        recibirDonar.setForeground(new java.awt.Color(255, 255, 255));
        recibirDonar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recibirDonar.setText("RECIBIR O DONAR");
        recibirDonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recibirDonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recibirDonarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recibirDonarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recibirDonarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginpanel1Layout = new javax.swing.GroupLayout(loginpanel1);
        loginpanel1.setLayout(loginpanel1Layout);
        loginpanel1Layout.setHorizontalGroup(
            loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recibirDonar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        loginpanel1Layout.setVerticalGroup(
            loginpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recibirDonar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(loginpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 50));

        iniciosesion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        iniciosesion.setText("PÁGINA PRINCIPAL");
        bg.add(iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 30));

        logo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/favicon.png"))); // NOI18N
        logo.setText("HELPER FOOD");
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void recibirDonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recibirDonarMouseClicked
        sesion inicioSesion = new sesion();
        inicioSesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_recibirDonarMouseClicked

    private void recibirDonarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recibirDonarMouseEntered
        loginpanel1.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_recibirDonarMouseEntered

    private void recibirDonarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recibirDonarMouseExited
        loginpanel1.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_recibirDonarMouseExited

    private void crearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseExited
        loginpanel.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_crearCuentaMouseExited

    private void crearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseEntered
        loginpanel.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_crearCuentaMouseEntered

    private void crearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaMouseClicked
        cuenta crearCuenta = new cuenta();
        crearCuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_crearCuentaMouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel crearCuenta;
    private javax.swing.JLabel exitlabel;
    private javax.swing.JPanel exitpanel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel helperfood;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel iniciosesion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPanel loginpanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel recibirDonar;
    // End of variables declaration//GEN-END:variables
}