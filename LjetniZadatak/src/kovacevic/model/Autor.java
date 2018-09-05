/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.model;

import java.io.Serializable;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Josip
 */
@Entity
public class Autor extends Entitet implements Serializable{


    private String ime;
    private String prezime;

 
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
    
    @Override
    public String toString(){
        return (getPrezime() + " " + getIme());
    }
}
