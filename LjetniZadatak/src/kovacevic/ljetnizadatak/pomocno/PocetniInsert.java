/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak.pomocno;

import kovacevic.ljetnizadatak.model.Penjac;
import org.hibernate.Session;

/**
 *
 * @author Josip
 */
public class PocetniInsert {
    public static void izvedi(){
          Session session = HibernateUtil.getSession();
        
        session.beginTransaction();
        Penjac p = new Penjac();
        p.setIme("Josip");
        p.setPrezime("Kovačević");
        p.setRezultat("xx");
        session.save(p);
        
        session.getTransaction().commit();
    }
}
