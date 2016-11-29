/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalia Vera
 */
public class FrameElegir extends javax.swing.JFrame {

    String generosRec;

    /**
     * Creates new form FrameElegir
     */
    public FrameElegir(String generosRec) {
        this.generosRec = generosRec;

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

        jLabel1 = new javax.swing.JLabel();
        btnArtista = new javax.swing.JButton();
        btnCancion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("¿Qué quieres adivinar?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 190, 400, 60);

        btnArtista.setBackground(new java.awt.Color(51, 51, 255));
        btnArtista.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btnArtista.setText("Nombres de Artistas");
        btnArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnArtista);
        btnArtista.setBounds(10, 300, 287, 130);

        btnCancion.setBackground(new java.awt.Color(255, 0, 153));
        btnCancion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btnCancion.setText("Nombres de Canciones");
        btnCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancion);
        btnCancion.setBounds(160, 480, 300, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 300, 133, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/music.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 450, 150, 160);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 470, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtistaActionPerformed
        // TODO add your handling code here:
        dispose();
        JugarPartida partida = new JugarPartida();
        partida.setVisible(true);
        nombreArtistaBd = new ArrayList<String>();

        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/triviamusicapp?&useSSL=false";
            //Vamos a crear una lista para poder seleccionar la BD

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT nombreArtista FROM " + generosRec + " ORDER BY RAND()");
            for (int x = 0; x <= 3; x++) {
                rs.next();
                String lastName = rs.getString("nombreArtista");
                nombreArtistaBd.add(lastName);
            }
            System.out.println(nombreArtistaBd);
            conn.close();

        } catch (Exception e) {
            System.err.println("Hubo un error aqui");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnArtistaActionPerformed

    private void btnCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionActionPerformed
        // TODO add your handling code here:
        dispose();
        JugarPartida partida = new JugarPartida();
        partida.setVisible(true);
        nombreCancionBd = new ArrayList<String>();
        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/triviamusicapp?&useSSL=false";
            //Vamos a crear una lista para poder seleccionar la BD

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT nombreCancion FROM " + generosRec + " ORDER BY RAND()");
            for (int x = 0; x <= 3; x++) {
                rs.next();
                String lastName = rs.getString("nombreCancion");
                nombreCancionBd.add(lastName);
            }
            System.out.println(nombreCancionBd);

            conn.close();

        } catch (Exception e) {
            System.err.println("Hubo un error aqui");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCancionActionPerformed

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
            java.util.logging.Logger.getLogger(FrameElegir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameElegir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameElegir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameElegir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a = "a";
                new FrameElegir(a).setVisible(true);
            }
        });
    }

    String nombreArtista;
    String nombreCancion;
    ArrayList<String> nombreCancionBd;
    ArrayList<String> nombreArtistaBd;
    ArrayList<URL> uriBd;
    URL urlName;
    String query;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtista;
    private javax.swing.JButton btnCancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
