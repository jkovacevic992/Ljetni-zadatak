/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Josip
 */
@Entity
public class Penjac extends Entitet implements Serializable{

   
    private String ime;
    private String prezime;
    private String rezultat;

 

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public String toString() {
        return (getPrezime() + " " + getIme());

    }

}
