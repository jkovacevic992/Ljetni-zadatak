/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.controller;

import java.util.List;
import kovacevic.pomocno.MojException;

/**
 *
 * @author Josip
 */
public interface ObradaInterface<T> {
        public List<T> getEntiteti();
    public T dodaj(T e) throws MojException;
    public T promjena(T e) throws MojException;
}
