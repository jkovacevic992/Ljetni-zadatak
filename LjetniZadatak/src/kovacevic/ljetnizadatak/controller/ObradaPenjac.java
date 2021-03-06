/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.controller;

import java.util.List;
import kovacevic.ljetnizadatak.model.Penjac;
import kovacevic.ljetnizadatak.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaPenjac extends Obrada implements ObradaInterface<Penjac>{


    
    public List<Penjac> getEntiteti() {
        return session.createQuery(" from Penjac").list();
    }

   
    public Penjac dodaj(Penjac p) throws MojException {
        
        spremi(p);
        
        return p;
    }


    public Penjac promjena(Penjac p) throws MojException {
        spremi(p);
        
        return p;
    }
    
    private void kontrola(Penjac p) throws MojException{
        if(!p.getIme().chars().allMatch(Character::isLetter) || !p.getPrezime().chars().allMatch(Character::isLetter)){
            throw new MojException("Ime i prezime penjača mogu sadržavati samo slova.");
           
        }
    }
}
