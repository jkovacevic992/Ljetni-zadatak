/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.view;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import kovacevic.ljetnizadatak.controller.ObradaPenjaliste;
import kovacevic.ljetnizadatak.model.Penjaliste;
import kovacevic.ljetnizadatak.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class Penjalista extends javax.swing.JFrame {

    final private ObradaPenjaliste obrada;
    private Penjaliste penjaliste;
    final private DecimalFormat df;

    public Penjalista() {
        initComponents();
        promjenaIzgleda();
       
        obrada = new ObradaPenjaliste();
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
        setTitle("Penjališta");

        lblNaziv.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblNaziv.setForeground(new java.awt.Color(255, 255, 255));
        lblNaziv.setText("Naziv");

        lblLon.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblLon.setForeground(new java.awt.Color(255, 255, 255));
        lblLon.setText("Geografska dužina");

        lblLat.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblLat.setForeground(new java.awt.Color(255, 255, 255));
        lblLat.setText("Geograska širina");

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

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNaziv)
                    .addComponent(lblLon)
                    .addComponent(lblLat)
                    .addComponent(txtLon)
                    .addComponent(txtLat)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNaziv))
                .addContainerGap(54, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        penjaliste = new Penjaliste();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            obrada.dodaj(penjaliste);
            ucitajIzBaze();
        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        penjaliste = lstPenjalista.getSelectedValue();
        if (penjaliste == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjalište.");
            return;
        }

        if (!popuniSvojstva()) {
            return;
        }

        try {
            obrada.promjena(penjaliste);
            ucitajIzBaze();

        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        penjaliste = lstPenjalista.getSelectedValue();
        if (penjaliste == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjalište.");
            return;
        }

        obrada.obrisi(penjaliste);
        ucitajIzBaze();


    }//GEN-LAST:event_btnObrisiActionPerformed

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
        DefaultListModel<Penjaliste> m = new DefaultListModel<>();
        obrada.getEntiteti().forEach((s) -> {
            m.addElement(s);
        });
        lstPenjalista.setModel(m);

    }

    private boolean popuniSvojstva() {
        try {
            penjaliste.setNaziv(txtNaziv.getText().substring(0, 1).toUpperCase() + txtNaziv.getText().substring(1).toLowerCase());
            penjaliste.setLat(Double.parseDouble(txtLat.getText()));
            penjaliste.setLon(Double.parseDouble(txtLon.getText()));
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nisu upisani svi potrebni podaci");
            return false;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(getRootPane(), "Geografska širina ili dužina nije unesena.");
        }

        return true;
    }
        private void changeIcon() {
               try {
    setIconImage(ImageIO.read(new File("Slike/climbingIcon.png")));
}
catch (IOException exc) {
    exc.printStackTrace();
}
    }

    private void promjenaIzgleda() {
        getContentPane().setBackground(Color.decode("#082F4E"));
        pnlPodaci.setBackground(Color.decode("#082F4E"));
        changeIcon();

    }

}
