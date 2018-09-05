/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.ljetnizadatak;

import kovacevic.controller.ObradaPenjac;
import kovacevic.model.Penjac;
import kovacevic.pomocno.HibernateUtil;
import kovacevic.pomocno.MojException;
import kovacevic.view.Izbornik;

/**
 *
 * @author Josip
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSession();
        
        Izbornik izbornik = new Izbornik();
        izbornik.setVisible(true);
    }
    
}
