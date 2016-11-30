/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalia Vera
 */
public class FrameElegir extends javax.swing.JFrame {

    String generosRec;
    String n1;
    String n2;
    String n3;
    String n4;
    URL u1;
    URL u2;
    URL u3;
    URL u4;

    /**
     * Creates new form FrameElegir
     * @param generosRec
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
        nombreArtistaBd = new ArrayList<String>();
        uriBd = new ArrayList<URL>();

        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/triviamusicapp?&useSSL=false";
            //Vamos a crear una lista para poder seleccionar la BD

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT nombreArtista, uri FROM " + generosRec + " ORDER BY RAND()");
            for (int x = 0; x <= 3; x++) {
                rs.next();
                String nombreArtista = rs.getString("nombreArtista");
                URL uri = rs.getURL("uri");
                uriBd.add(uri);
                nombreArtistaBd.add(nombreArtista);
            }
            n1 = nombreArtistaBd.get(0);
            n2 = nombreArtistaBd.get(1);
            n3 = nombreArtistaBd.get(2);
            n4 = nombreArtistaBd.get(3);
            u1 = uriBd.get(0);
            u2 = uriBd.get(1);
            u3 = uriBd.get(2);
            u4 = uriBd.get(3);
            conn.close();

        } catch (Exception e) {
            System.err.println("Hubo un error aqui");
            System.err.println(e.getMessage());
        }
        JugarPartida partida = null;
        try {
            partida = new JugarPartida(n1,n2,n3,n4,u1,u2,u3,u4);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FrameElegir.class.getName()).log(Level.SEVERE, null, ex);
        }
        partida.setVisible(true);
    }//GEN-LAST:event_btnArtistaActionPerformed

    private void btnCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionActionPerformed
        // TODO add your handling code here:
        dispose();
        nombreCancionBd = new ArrayList<String>();
        uriBd = new ArrayList<URL>();
        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/triviamusicapp?&useSSL=false";
            //Vamos a crear una lista para poder seleccionar la BD

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            for (int x = 0; x <= 3; x++) {
                rs = stmt.executeQuery("SELECT nombreCancion, uri FROM " + generosRec + " ORDER BY RAND()");
                rs.next();
                String nombreCancion = rs.getString("nombreCancion");
                URL uri = rs.getURL("uri");
                uriBd.add(uri);
                nombreCancionBd.add(nombreCancion);
            }
            n1 = nombreCancionBd.get(0);
            n2 = nombreCancionBd.get(1);
            n3 = nombreCancionBd.get(2);
            n4 = nombreCancionBd.get(3);
            u1 = uriBd.get(0);
            u2 = uriBd.get(1);
            u3 = uriBd.get(2);
            u4 = uriBd.get(3);
//            System.out.println(nombreCancionBd);
//            System.out.println(uriBd);
            conn.close();

        } catch (Exception e) {
            System.err.println("Hubo un error aqui");
            System.err.println(e.getMessage());
        }
        JugarPartida partida = null;
        try {
            partida = new JugarPartida(n1,n2,n3,n4,u1,u2,u3,u4);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FrameElegir.class.getName()).log(Level.SEVERE, null, ex);
        }
        partida.setVisible(true);
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

    ArrayList<String> nombreCancionBd;
    ArrayList<String> nombreArtistaBd;
    ArrayList<URL> uriBd;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtista;
    private javax.swing.JButton btnCancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
