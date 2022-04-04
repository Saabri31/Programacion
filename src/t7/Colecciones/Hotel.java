/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author todbolsa
 */
public class Hotel {

    private int idHotel = 0;
    private Zonas zona;
    private int precio;
    public static int count;

    public Hotel(int idHotel, String zona, int precio) {
        this.idHotel = ++count;
        setZona(zona);
        this.precio = precio;
    }

    public Zonas getZona() {
        return zona;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setZona(String zona) {
        try {
            this.zona = Zonas.valueOf(zona);
        } catch (java.lang.IllegalArgumentException ex) {
            System.out.println("Error. Zona no permitida");
        }
    }

    public boolean comprobarPrecio(int precio) {
        if (this.precio > 40 && this.precio < 150) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", zona=" + zona + ", precio=" + precio + '}';
    }

}
