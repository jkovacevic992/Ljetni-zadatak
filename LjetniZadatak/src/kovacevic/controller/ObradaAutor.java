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
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.RootPaneUI;
import kovacevic.model.Autor;

/**
 *
 * @author Josip
 */
public class ObradaAutor {

    Connection veza;
    PreparedStatement izraz;
    ResultSet rs;

    public ObradaAutor() {
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

    public List<Autor> getAutori() {
        try {
            izraz = veza.prepareStatement("select * from autor");
            ResultSet rs = izraz.executeQuery();
            List<Autor> lista = new ArrayList<>();
            Autor a;
            while (rs.next()) {
                a = new Autor();
                a.setSifra(rs.getInt("sifra"));
                a.setIme(rs.getString("ime"));
                a.setPrezime(rs.getString("prezime"));

                lista.add(a);
            }
            rs.close();
            izraz.close();
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean dodajNovi(Autor a) {
        try {
            izraz = veza.prepareStatement("insert into autor (ime,prezime)" + "value (?,?)");
            postaviParametre(a);
            int brojPromjenaUBazi = izraz.executeUpdate();
            izraz.close();
            return brojPromjenaUBazi == 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private void postaviParametre(Autor a) throws SQLException {
        izraz.setString(1, a.getIme());
        izraz.setString(2, a.getPrezime());

    }

    public boolean promjeniPostojeci(Autor a) {
        try {
          
            izraz = veza.prepareStatement("update autor set ime=?, prezime=? "
                                        + " where sifra=?");
            postaviParametre(a);
              izraz.setInt(3, a.getSifra());
            int brojPromjenaUBazi = izraz.executeUpdate();
            izraz.close();
            return brojPromjenaUBazi == 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean obrisiPostojeci(Autor a) throws SQLException {
        izraz = veza.prepareStatement("delete from autor " + " where sifra=?");
        izraz.setInt(1, a.getSifra());
        int brojPromjenaUBazi = izraz.executeUpdate();
        izraz.close();
        return brojPromjenaUBazi ==1;
    }
}
