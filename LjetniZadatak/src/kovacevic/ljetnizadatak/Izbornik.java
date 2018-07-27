/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josip
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        getContentPane().setBackground(Color.decode("#082F4E"));
        pnlIzbornik.setBackground(Color.decode("#082F4E"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzbornik = new javax.swing.JPanel();
        btnPenjaliste = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        btnPenjac = new javax.swing.JButton();
        btnGit = new javax.swing.JButton();
        btnEra = new javax.swing.JButton();
        lblSlika = new javax.swing.JLabel();
        btnZatvori = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        btnPenjaliste.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPenjaliste.setText("Penjališta");
        btnPenjaliste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjalisteActionPerformed(evt);
            }
        });

        btnAutor.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnAutor.setText("Autori");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        btnPenjac.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPenjac.setText("Penjači");
        btnPenjac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjacActionPerformed(evt);
            }
        });

        btnGit.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnGit.setText("GitHub");
        btnGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitActionPerformed(evt);
            }
        });

        btnEra.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnEra.setText("ERA dijagram");
        btnEra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraActionPerformed(evt);
            }
        });

        lblSlika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kovacevic/ljetnizadatak/climber1.png"))); // NOI18N

        btnZatvori.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnZatvori.setText("Zatvori");
        btnZatvori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZatvoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIzbornikLayout = new javax.swing.GroupLayout(pnlIzbornik);
        pnlIzbornik.setLayout(pnlIzbornikLayout);
        pnlIzbornikLayout.setHorizontalGroup(
            pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPenjac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPenjaliste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnZatvori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlIzbornikLayout.setVerticalGroup(
            pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnPenjaliste)
                .addGap(18, 18, 18)
                .addComponent(btnAutor)
                .addGap(18, 18, 18)
                .addComponent(btnPenjac)
                .addGap(18, 18, 18)
                .addComponent(btnGit)
                .addGap(18, 18, 18)
                .addComponent(btnEra)
                .addGap(18, 18, 18)
                .addComponent(btnZatvori)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addComponent(lblSlika)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIzbornik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlIzbornik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraActionPerformed
        Slika slika = new Slika();
        slika.setVisible(true);
    }//GEN-LAST:event_btnEraActionPerformed

    private void btnGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitActionPerformed

        try {
            Desktop.getDesktop().browse(new URL("https://github.com/jkovacevic992/Ljetni-zadatak/tree/master/LjetniZadatak/src/kovacevic/ljetnizadatak").toURI());
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnGitActionPerformed

    private void btnPenjalisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjalisteActionPerformed
        Penjalista penjaliste = new Penjalista();
        penjaliste.setVisible(true);
    }//GEN-LAST:event_btnPenjalisteActionPerformed

    private void btnPenjacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjacActionPerformed
        Penjaci osoba = new Penjaci();
        osoba.setVisible(true);
    }//GEN-LAST:event_btnPenjacActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        Autori autor = new Autori();
        autor.setVisible(true);
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnZatvoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZatvoriActionPerformed
        dispose();
    }//GEN-LAST:event_btnZatvoriActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnEra;
    private javax.swing.JButton btnGit;
    private javax.swing.JButton btnPenjac;
    private javax.swing.JButton btnPenjaliste;
    private javax.swing.JButton btnZatvori;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JPanel pnlIzbornik;
    // End of variables declaration//GEN-END:variables
}
