/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author jaime
 */
public class Beneficiario extends Usuario implements Serializable{

    public Beneficiario(long identificacion, String contrasena, String ubicacion, String contacto) {
        super(identificacion, contrasena, ubicacion, contacto);
    }
     
}
