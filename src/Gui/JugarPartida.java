/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Dalia Vera
 */
public class JugarPartida extends javax.swing.JFrame {

    /**
     * Creates new form JugarPartida
     */
    public JugarPartida() {
        initComponents();
        setSize(470, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Trivia Music App");
        this.getContentPane().setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpcion1 = new javax.swing.JButton();
        btnOpcion2 = new javax.swing.JButton();
        btnOpcion3 = new javax.swing.JButton();
        btnOpcion4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnOpcion1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOpcion1.setText("Opción 1");
        btnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcion1);
        btnOpcion1.setBounds(10, 360, 440, 60);

        btnOpcion2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOpcion2.setText("Opción 2");
        btnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcion2);
        btnOpcion2.setBounds(10, 430, 440, 60);

        btnOpcion3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOpcion3.setText("Opción 3");
        btnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcion3);
        btnOpcion3.setBounds(10, 500, 440, 60);

        btnOpcion4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnOpcion4.setText("Opción 4");
        btnOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcion4);
        btnOpcion4.setBounds(10, 570, 440, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 0, 220, 150);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 640, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/15218639_1475439615817024_243245446_n.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 140, 120, 200);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo5.jpg.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, 0, 490, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion1ActionPerformed
        // TODO add your handling code here:
        btnOpcion1.setBackground(Color.green);
        dispose();
        FrameGanaste ganaste = new FrameGanaste();
        ganaste.setVisible(true);
    }//GEN-LAST:event_btnOpcion1ActionPerformed

    private void btnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion2ActionPerformed
        // TODO add your handling code here:
        btnOpcion2.setBackground(Color.red);
        FramePerdiste perdiste = new FramePerdiste();
        perdiste.setVisible(true);
    }//GEN-LAST:event_btnOpcion2ActionPerformed

    private void btnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion3ActionPerformed
        // TODO add your handling code here:
        btnOpcion3.setBackground(Color.red);
        FramePerdiste perdiste = new FramePerdiste();
        perdiste.setVisible(true);
    }//GEN-LAST:event_btnOpcion3ActionPerformed

    private void btnOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion4ActionPerformed
        // TODO add your handling code here:
        btnOpcion4.setBackground(Color.red);
        FramePerdiste perdiste = new FramePerdiste();
        perdiste.setVisible(true);
    }//GEN-LAST:event_btnOpcion4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        JugarPartida partida = new JugarPartida();
        partida.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JugarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugarPartida().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JButton btnOpcion4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
