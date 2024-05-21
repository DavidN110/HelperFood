package Interfaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Lógica.*;
import Clases.*;
import java.awt.Color;
import javax.swing.JOptionPane;
public class sesion extends javax.swing.JFrame {

    int xMouse, yMouse;
    long ID;
    String contrasena;

    public sesion() {
        initComponents();
        Ejecutable.setBeneficiarioActivo(null);
        Ejecutable.setDonanteActivo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        helperfood = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        iniciosesion = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitpanel = new javax.swing.JPanel();
        exitlabel = new javax.swing.JLabel();
        identidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        id = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        loginpanel = new javax.swing.JPanel();
        loginlabel = new javax.swing.JLabel();
        backpanel = new javax.swing.JPanel();
        backlabel = new javax.swing.JLabel();
        backpanel1 = new javax.swing.JPanel();
        olvido = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName("bg"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(834, 540));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/logo.png"))); // NOI18N
        bg.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 280, 150));

        helperfood.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        helperfood.setForeground(new java.awt.Color(255, 255, 255));
        helperfood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helperfood.setText("Helper Food");
        bg.add(helperfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 260, 40));

        fondo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/city.png"))); // NOI18N
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, 500));

        iniciosesion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        iniciosesion.setText("INICIAR SESIÓN");
        bg.add(iniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 200, 30));

        passlabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        passlabel.setText("CONTRASEÑA");
        bg.add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, -1));

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

        identidad.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        identidad.setForeground(new java.awt.Color(204, 204, 204));
        identidad.setText("Ingrese el número de identificación sin puntos ni comas");
        identidad.setToolTipText("");
        identidad.setBorder(null);
        identidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                identidadMousePressed(evt);
            }
        });
        identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identidadActionPerformed(evt);
            }
        });
        bg.add(identidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 390, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 390, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 390, 10));

        id.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        id.setText("IDENTIFICACIÓN");
        bg.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 120, -1));

        Contrasena.setForeground(new java.awt.Color(204, 204, 204));
        Contrasena.setText("********");
        Contrasena.setBorder(null);
        Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContrasenaMousePressed(evt);
            }
        });
        bg.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 390, 30));

        loginpanel.setBackground(new java.awt.Color(0, 134, 190));

        loginlabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        loginlabel.setForeground(new java.awt.Color(255, 255, 255));
        loginlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginlabel.setText("INGRESAR");
        loginlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 40));

        backpanel.setBackground(new java.awt.Color(0, 134, 190));

        backlabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        backlabel.setForeground(new java.awt.Color(255, 255, 255));
        backlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backlabel.setText("REGRESAR");
        backlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backpanelLayout = new javax.swing.GroupLayout(backpanel);
        backpanel.setLayout(backpanelLayout);
        backpanelLayout.setHorizontalGroup(
            backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        backpanelLayout.setVerticalGroup(
            backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(backpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 110, 40));

        backpanel1.setBackground(new java.awt.Color(0, 134, 190));

        olvido.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        olvido.setForeground(new java.awt.Color(255, 255, 255));
        olvido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        olvido.setText("OLVIDE MI CONTRASEÑA ");
        olvido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                olvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                olvidoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backpanel1Layout = new javax.swing.GroupLayout(backpanel1);
        backpanel1.setLayout(backpanel1Layout);
        backpanel1Layout.setHorizontalGroup(
            backpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backpanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(olvido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backpanel1Layout.setVerticalGroup(
            backpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backpanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(olvido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(backpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        logo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/image/favicon.png"))); // NOI18N
        logo.setText("HELPER FOOD");
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 220, 30));

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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgMousePressed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_headerMouseDragged

    private void exitlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseEntered
        exitpanel.setBackground(Color.red);
        exitlabel.setForeground(Color.white);
    }//GEN-LAST:event_exitlabelMouseEntered

    private void exitlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitlabelMouseClicked

    private void exitlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitlabelMouseExited
        exitpanel.setBackground(Color.white);
        exitlabel.setForeground(Color.black);
    }//GEN-LAST:event_exitlabelMouseExited

    private void loginlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginlabelMouseEntered
        loginpanel.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_loginlabelMouseEntered

    private void loginlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginlabelMouseExited
        loginpanel.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_loginlabelMouseExited

    private void identidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identidadMousePressed
        if(identidad.getText().equals("Ingrese el número de identificación sin puntos ni comas")){
            identidad.setText("");
            identidad.setForeground(Color.black);
        }
        if(String.valueOf(Contrasena.getPassword()).isEmpty()){
            Contrasena.setText("********");
            Contrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_identidadMousePressed

    private void ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaMousePressed
        if(identidad.getText().isEmpty()){
            identidad.setText("Ingrese el número de identificación sin puntos ni comas");
            identidad.setForeground(Color.gray);
        }
        if(String.valueOf(Contrasena.getPassword()).equals("********")){
            Contrasena.setText("");
            Contrasena.setForeground(Color.black);
        }
    }//GEN-LAST:event_ContrasenaMousePressed

    private void loginlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginlabelMouseClicked
        ID = Long.parseLong(identidad.getText());
        contrasena = String.valueOf(Contrasena.getPassword());
        if(identidad.getText().equals("Ingrese el número de identificación sin puntos ni comas")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario válido");
        }
        if(Ejecutable.getListaBeneficiarios().get(ID) == null && Ejecutable.getListaDonantes().get(ID) == null){
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }else{
            if(Ejecutable.getListaBeneficiarios().get(ID) != null){
                if(Ejecutable.getListaBeneficiarios().get(ID).getContrasena().equals(contrasena)){
                    Ejecutable.setBeneficiarioActivo(ID);
                    buscador paginaBeneficiarios = new buscador();
                    paginaBeneficiarios.setVisible(true);   
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                }
            }
            if(Ejecutable.getListaDonantes().get(ID) != null){
                if(Ejecutable.getListaDonantes().get(ID).getContrasena().equals(contrasena)){
                    Ejecutable.setDonanteActivo(ID);
                    MisDonaciones paginaDonantes = new MisDonaciones();
                    paginaDonantes.setVisible(true);  
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                }
            }
        } 
    }//GEN-LAST:event_loginlabelMouseClicked

    private void backlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabelMouseClicked
        principal paginaPrincipal = new principal();
        paginaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_backlabelMouseClicked

    private void backlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabelMouseEntered
        backpanel.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_backlabelMouseEntered

    private void backlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlabelMouseExited
        backpanel.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_backlabelMouseExited

    private void olvidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseClicked
        ID = Long.parseLong(identidad.getText());
        contrasena = String.valueOf(Contrasena.getPassword());
        if(Ejecutable.getListaBeneficiarios().get(ID) == null && Ejecutable.getListaDonantes().get(ID) == null){
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }else{
            if(Ejecutable.getListaBeneficiarios().get(ID) != null){
                Ejecutable.setBeneficiarioActivo(ID);
            }
            if(Ejecutable.getListaDonantes().get(ID) != null){
                Ejecutable.setDonanteActivo(ID);
            }
            cuenta contraseñaOlvidada = new cuenta();
            contraseñaOlvidada.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_olvidoMouseClicked

    private void olvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseEntered
        backpanel1.setBackground(new Color(0,170,255));
    }//GEN-LAST:event_olvidoMouseEntered

    private void olvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseExited
        backpanel1.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_olvidoMouseExited

    private void identidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identidadActionPerformed
        
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
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JLabel backlabel;
    private javax.swing.JPanel backpanel;
    private javax.swing.JPanel backpanel1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitlabel;
    private javax.swing.JPanel exitpanel;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel helperfood;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel id;
    private javax.swing.JTextField identidad;
    private javax.swing.JLabel iniciosesion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel olvido;
    private javax.swing.JLabel passlabel;
    // End of variables declaration//GEN-END:variables
}
