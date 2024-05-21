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
public class Donacion implements Serializable{
    private String alimento;
    private int cantidad;
    private String fechaCaducidad;
    private Donante Donante;

    public Donacion(String alimento, int cantidad, Donante Donante) {
        this.alimento = alimento;
        this.cantidad = cantidad;
        this.Donante = Donante;
    }

    public Donacion(String alimento, int cantidad, String fechaCaducidad, Donante Donante) {
        this.alimento = alimento;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
        this.Donante = Donante;
    }
    
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Donante getDonante() {
        return Donante;
    }

    public void setDonante(Donante Donante) {
        this.Donante = Donante;
    }

}
