/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.pomocno;

import kovacevic.ljetnizadatak.model.Operater;
import org.hibernate.Session;

/**
 *
 * @author Josip
 */
public class PocetniInsert {
    public static void izvedi(){
          Session session = HibernateUtil.getSession();
        
        session.beginTransaction();
        Operater o = new Operater();
        o.setIme("Josip");
        o.setPrezime("Kovačević");
        o.setEmail("jkovacevic@gmail.com");
        o.setLozinka(Autorizacija.getHash("j"));
        session.save(o);
        
        session.getTransaction().commit();
    }
}
