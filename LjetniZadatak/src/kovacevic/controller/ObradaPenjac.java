/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kovacevic.model.Penjac;

/**
 *
 * @author Josip
 */
public class ObradaPenjac {

    Connection veza;
    PreparedStatement izraz;
    ResultSet rs;

    public ObradaPenjac() {
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

    public List<Penjac> getPenjaci() {
        try {
            izraz = veza.prepareStatement("select * from penjac");
            ResultSet rs = izraz.executeQuery();
            List<Penjac> lista = new ArrayList<>();
            Penjac p;
            while (rs.next()) {
                p = new Penjac();
                p.setSifra(rs.getInt("sifra"));
                p.setIme(rs.getString("ime"));
                p.setPrezime(rs.getString("prezime"));
                p.setRezultat(rs.getString("rezultat"));
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

    public boolean dodajNovi(Penjac p) {
        try {
            izraz = veza.prepareStatement("insert into penjac (ime,prezime,rezultat)" + "value (?,?,?)");
            postaviParametre(p);
            int brojPromjenaUBazi = izraz.executeUpdate();
            izraz.close();
            return brojPromjenaUBazi == 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private void postaviParametre(Penjac p) throws SQLException {
        izraz.setString(1, p.getIme());
        izraz.setString(2, p.getPrezime());
        izraz.setString(3, p.getRezultat());
    }

    public boolean promjeniPostojeci(Penjac p) {
        try {

            izraz = veza.prepareStatement("update penjac set ime=?, "
                    + " prezime=?, rezultat=? "
                    + " where sifra=?");
            postaviParametre(p);
            izraz.setInt(4, p.getSifra());
            int brojPromjenaUBazi = izraz.executeUpdate();
            izraz.close();
            return brojPromjenaUBazi == 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean obrisiPostojeci(Penjac p) throws SQLException {
        izraz = veza.prepareStatement("delete from penjac where sifra=?");
        izraz.setInt(1, p.getSifra());
        int brojPromjenaUBazi = izraz.executeUpdate();
        izraz.close();
        return brojPromjenaUBazi == 1;
    }
}
