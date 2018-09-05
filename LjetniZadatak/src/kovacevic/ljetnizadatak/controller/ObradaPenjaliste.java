/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import kovacevic.ljetnizadatak.model.Penjaliste;

/**
 *
 * @author Josip
 */
public class ObradaPenjaliste {

    Connection veza;
    PreparedStatement izraz;
    ResultSet rs;
    JFrame f = new JFrame();

    public ObradaPenjaliste() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            veza = DriverManager.getConnection("jdbc:mysql://localhost/penjalista?"
                    + "user=edunova&password=edunova&serverTimezone=CET&useUnicode=true&characterEncoding=utf-8");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Penjaliste> getPenjalista() {
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
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean dodajNovi(Penjaliste p) {

        try {
            izraz = veza.prepareStatement("insert into penjaliste (naziv,lat,lon)" + "value (?,?,?)");
            postaviParametre(p);
            int brojPromjenaUBazi = izraz.executeUpdate();
            izraz.close();
            return brojPromjenaUBazi == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(f, "Pogrešno upisana geografska širina ili dužina.");
        }
        return false;
    }

    private void postaviParametre(Penjaliste p) throws SQLException {
        izraz.setString(1, p.getNaziv());
        izraz.setString(2, String.valueOf(p.getLat()));
        izraz.setString(3, String.valueOf(p.getLon()));
    }

    public boolean promjeniPostojeci(Penjaliste p) {
        try {

            izraz = veza.prepareStatement("update penjaliste set naziv=?, "
                    + " lat=?, lon=? "
                    + " where sifra=?");
            postaviParametre(p);
            izraz.setInt(4, p.getSifra());
            int brojPromjenaUBazi = izraz.executeUpdate();
            izraz.close();
            return brojPromjenaUBazi == 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(f, "Pogrešno upisana geografska širina ili dužina.");
        }
        return false;
    }

    public boolean obrisiPostojeci(Penjaliste p) throws SQLException {
        izraz = veza.prepareStatement("delete from penjaliste where sifra=?");
        izraz.setInt(1, p.getSifra());
        int brojPromjenaUBazi = izraz.executeUpdate();
        izraz.close();
        return brojPromjenaUBazi == 1;
    }
}
