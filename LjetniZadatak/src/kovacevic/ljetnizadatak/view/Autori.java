/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.view;

import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import kovacevic.ljetnizadatak.controller.ObradaAutor;
import kovacevic.ljetnizadatak.model.Autor;

/**
 *
 * @author Josip
 */
public class Autori extends javax.swing.JFrame {

    final private ObradaAutor obrada;
    private Autor autor;
    final private DecimalFormat df;

    public Autori() {
        initComponents();
        getContentPane().setBackground(Color.decode("#082F4E"));
        pnlPodaci.setBackground(Color.decode("#082F4E"));

        obrada = new ObradaAutor();
        ucitajIzBaze();

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hr", "HR"));
        df = (DecimalFormat) nf;
        df.applyPattern("###,##0.00");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPodaci = new javax.swing.JPanel();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAutori = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDodaj.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDodajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDodajMouseExited(evt);
            }
        });
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPromjena.setText("Promjena");
        btnPromjena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPromjenaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPromjenaMouseExited(evt);
            }
        });
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnObrisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnObrisiMouseExited(evt);
            }
        });
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ime");

        jLabel2.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prezime");

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIme))
                        .addContainerGap())))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjena)
                    .addComponent(btnObrisi))
                .addGap(19, 19, 19))
        );

        lstAutori.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAutori.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAutoriValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAutori);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        autor = new Autor();

        if (!popuniSvojstva()) {
            return;
        }
        if (obrada.dodajNovi(autor)) {
            ucitajIzBaze();
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        autor = lstAutori.getSelectedValue();
        if (autor == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi autora.");
            return;
        }
        if (!popuniSvojstva()) {
            return;
        }

        if (obrada.promjeniPostojeci(autor)) {
            ucitajIzBaze();
        }


    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        autor = lstAutori.getSelectedValue();
        if (autor == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi autora.");
            return;
        }

        try {
            if (obrada.obrisiPostojeci(autor)) {
                ucitajIzBaze();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Autora nije moguće obrisati " + e.getMessage());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstAutoriValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAutoriValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Autor a = lstAutori.getSelectedValue();
        if (a == null) {
            return;
        }
        ocistiPolja();

        txtIme.setText(a.getIme());
        txtPrezime.setText(a.getPrezime());
    }//GEN-LAST:event_lstAutoriValueChanged

    private void btnDodajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseEntered
        btnDodaj.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDodajMouseEntered

    private void btnDodajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseExited
        btnDodaj.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnDodajMouseExited

    private void btnPromjenaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseEntered
        btnPromjena.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPromjenaMouseEntered

    private void btnPromjenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseExited
        btnPromjena.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnPromjenaMouseExited

    private void btnObrisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseEntered
        btnObrisi.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnObrisiMouseEntered

    private void btnObrisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseExited
        btnObrisi.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnObrisiMouseExited

    /**
     * @param args the command line arguments
     */
    private void ocistiPolja() {

        for (Component c : pnlPodaci.getComponents()) {

            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Autor> lstAutori;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables
 private void ucitajIzBaze() {
        DefaultListModel<Autor> m = new DefaultListModel<>();
        obrada.getAutori().forEach((s) -> {
            m.addElement(s);
        });
        lstAutori.setModel(m);

    }

    private boolean popuniSvojstva() {
        try {
            autor.setIme(txtIme.getText().substring(0, 1).toUpperCase() + txtIme.getText().substring(1).toLowerCase());
        autor.setPrezime(txtPrezime.getText().substring(0, 1).toUpperCase() + txtPrezime.getText().substring(1).toLowerCase());

        if(!txtIme.getText().chars().allMatch(Character::isLetter) || !txtPrezime.getText().chars().allMatch(Character::isLetter)){
            JOptionPane.showMessageDialog(getRootPane(), "Ime i prezime mogu sadržavati samo slova.");
            return false;
        }
            

        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nisu upisani svi potrebni podaci");
            return false;
        }

       

        return true;
    }

}