/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Josip
 */
public class Penjalista extends javax.swing.JFrame {

    private Connection veza;
    private PreparedStatement izraz;

    public Penjalista() {
        initComponents();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            veza = DriverManager.getConnection("jdbc:mysql://localhost/penjalista?"
                    + "user=edunova&password=edunova&serverTimezone=CET&useUnicode=true&characterEncoding=utf-8");
            ucitajIzBaze();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

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
        lblNaziv = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        lblLon = new javax.swing.JLabel();
        txtLon = new javax.swing.JTextField();
        lblLat = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPenjalista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNaziv.setText("Naziv");

        lblLon.setText("Geografska dužina");

        lblLat.setText("Geograska širina");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNaziv)
                        .addComponent(lblLon)
                        .addComponent(lblLat)
                        .addComponent(txtLat, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addComponent(txtLon)
                        .addComponent(txtNaziv))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNaziv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjena)
                    .addComponent(btnObrisi))
                .addGap(27, 27, 27))
        );

        lstPenjalista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPenjalista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPenjalistaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPenjalista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPenjalistaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPenjalistaValueChanged
       if (evt.getValueIsAdjusting()) {
            return;
        }

        Penjaliste p = lstPenjalista.getSelectedValue();
        if (p == null) {
            return;
        }
        ocistiPolja();

        txtNaziv.setText(p.getNaziv());
        txtLat.setText(String.valueOf(p.getLat()));
        txtLon.setText(String.valueOf(p.getLon()));
    }//GEN-LAST:event_lstPenjalistaValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
       try {
            izraz = veza.prepareStatement("insert into penjaliste (naziv,lat,lon)" + "value (?,?,?)");
            izraz.setString(1, txtNaziv.getText());
            izraz.setString(2, txtLat.getText());
            izraz.setString(3, txtLon.getText());

            if (izraz.executeUpdate() == 0) {
                JOptionPane.showMessageDialog(getRootPane(), "Nije unesen nijedan red.");
            } else {
                ucitajIzBaze();
                ocistiPolja();
            }
            izraz.close();

        }catch (MysqlDataTruncation e){
            JOptionPane.showMessageDialog(getRootPane(), "Geografska širina i/ili dužina pogrešno unesena.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Penjaliste p = lstPenjalista.getSelectedValue();
        if (p == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjalište.");
            return;
        }
        try {

            NamedParameterStatement izraz = new NamedParameterStatement(veza, "update penjaliste set naziv=:naziv, "
                    + " lat=:lat, lon=:lon "
                    + " where sifra=:sifra");

            izraz.setString("naziv", txtNaziv.getText());
            izraz.setString("lat", txtLat.getText());
            izraz.setString("lon", txtLon.getText());
            izraz.setInt("sifra", p.getSifra());
            if (izraz.izvedi() == 0) {
                JOptionPane.showMessageDialog(getRootPane(), "Nije promijenjeno.");
            } else {

                ocistiPolja();
                ucitajIzBaze();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Penjaliste p = lstPenjalista.getSelectedValue();
        if (p == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjalište.");
            return;
        }

        try {
            izraz = veza.prepareStatement("delete from penjaliste where sifra=?");
            izraz.setInt(1, p.getSifra());

            if (izraz.executeUpdate() == 0) {
                JOptionPane.showMessageDialog(getRootPane(), "Nije obrisan nijedan red. ");
            } else {
                ucitajIzBaze();
                ocistiPolja();
            }
            izraz.close();

        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nemoguće obrisati.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnObrisiActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLat;
    private javax.swing.JLabel lblLon;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JList<Penjaliste> lstPenjalista;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLon;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void ucitajIzBaze() {
        try {
            izraz = veza.prepareStatement("select * from penjaliste");
            ResultSet rs = izraz.executeQuery();

            List<Penjaliste> lista = new ArrayList<>();
            Penjaliste p;
            while (rs.next()) {
                p = new Penjaliste();
                p.setSifra(rs.getInt("sifra"));
                p.setNaziv(rs.getString("naziv"));
                p.setLon(rs.getDouble("lon"));
                p.setLat(rs.getDouble("lat"));

                lista.add(p);
            }
            rs.close();
            izraz.close();

            Collections.sort(lista, new Comparator<Penjaliste>() {
                Collator col = Collator.getInstance(new Locale("hr", "HR"));

                public int compare(Penjaliste p1, Penjaliste p2) {
                    return col.compare(p1.getNaziv(), p2.getNaziv());
                }
            });
            DefaultListModel<Penjaliste> m = new DefaultListModel<>();

            lista.forEach((penjaliste) -> m.addElement(penjaliste));
            lstPenjalista.setModel(m);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
