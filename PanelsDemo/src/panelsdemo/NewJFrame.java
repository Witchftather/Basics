/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelsdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */


public class NewJFrame extends javax.swing.JFrame {
Connection conn;
    /**
     * Creates new form NewJFrame
     */String username;
       String password;
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uname1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        uname2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        uname = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        p.setLayout(new java.awt.CardLayout());

        p1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Login Page");
        p1.add(jLabel1);
        jLabel1.setBounds(10, 10, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Name: ");
        p1.add(jLabel2);
        jLabel2.setBounds(20, 70, 90, 30);

        uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname1ActionPerformed(evt);
            }
        });
        p1.add(uname1);
        uname1.setBounds(170, 70, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password: ");
        p1.add(jLabel3);
        jLabel3.setBounds(20, 140, 80, 30);
        p1.add(pass1);
        pass1.setBounds(170, 140, 150, 30);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p1.add(jButton1);
        jButton1.setBounds(140, 210, 63, 25);

        p.add(p1, "card2");

        p2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Sign Up page");
        p2.add(jLabel4);
        jLabel4.setBounds(10, 10, 140, 30);

        jLabel5.setText("First Name");
        p2.add(jLabel5);
        jLabel5.setBounds(20, 60, 80, 30);

        jLabel6.setText("Last Name");
        p2.add(jLabel6);
        jLabel6.setBounds(220, 60, 60, 30);
        p2.add(fname);
        fname.setBounds(90, 60, 90, 30);
        p2.add(lname);
        lname.setBounds(300, 60, 90, 30);

        jLabel7.setText("Username / e-mail ID");
        p2.add(jLabel7);
        jLabel7.setBounds(20, 110, 130, 30);
        p2.add(uname2);
        uname2.setBounds(180, 110, 180, 30);

        jLabel8.setText("Password");
        p2.add(jLabel8);
        jLabel8.setBounds(20, 180, 90, 30);
        p2.add(pass2);
        pass2.setBounds(140, 180, 170, 30);

        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p2.add(jButton2);
        jButton2.setBounds(160, 230, 77, 25);

        p.add(p2, "card3");

        p3.setLayout(null);
        p3.add(uname);
        uname.setBounds(60, 40, 180, 40);
        p3.add(pass);
        pass.setBounds(70, 130, 180, 80);

        p.add(p3, "card4");

        getContentPane().add(p);
        p.setBounds(0, 0, 400, 270);

        jMenu1.setText("File");

        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sign Up");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          p.removeAll();
          p.repaint();
          p.add(p1);
          p.revalidate();
          
          
          
          
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         p.removeAll();
          p.repaint();
          p.add(p2);
          p.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void uname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uname1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
          username=uname1.getText();
          password=new String(pass1.getPassword());
    try {
        conn=ConnectionDB.connect();
        PreparedStatement pst = conn.prepareStatement("insert into login values(?,?);");
        pst.setString(0, username);
        pst.setString(1, password);
        
// TODO add your handling code here:
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          username=uname2.getText();
          password=new String(pass2.getPassword());
          p.removeAll();
          p.repaint();
          p.add(p3);
          p.revalidate();
          uname.setText(username);
          pass.setText(password);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel p;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel uname;
    private javax.swing.JTextField uname1;
    private javax.swing.JTextField uname2;
    // End of variables declaration//GEN-END:variables
}
