/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Comparator;

/**
 *
 * @author jaime
 */
public class Comparador implements Comparator<Donacion>{

    @Override
    public int compare(Donacion o1, Donacion o2) {
        return o2.getFechaCaducidad().compareTo(o1.getFechaCaducidad());     
    }
    
}
