/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.controller;



import java.util.List;
import kovacevic.ljetnizadatak.model.Operater;
import kovacevic.ljetnizadatak.pomocno.MojException;

/**
 *
 * @author Profesor
 */
public class ObradaOperater extends Obrada implements ObradaInterface<Operater>{
    
    public List<Operater> getEntiteti(){
        return session.createQuery(" from Operater").list();
    }
    
    public List<Operater> getEntiteti(String uvjet){
        return session.createQuery(" from Operater s where concat(s.ime,' ',s.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%")
                .list();
    }
    
    public Operater dodaj(Operater s) throws MojException{
      
        spremi(s);
        
        return s;
    }
    
    public Operater promjena(Operater s) throws MojException{
       
        spremi(s);
        
        return s;
    }
 

}
