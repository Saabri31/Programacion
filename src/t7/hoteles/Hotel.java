/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7.hoteles;

/**
 *
 * @author macarena
 */
public class Hotel implements Comparable<Hotel>{

    private int idHotel;
    private Zonas zona;
    private double precio;
    public static int cont;

    public Hotel(String zona, double precio) throws Exception {
        this.idHotel = ++cont;
        setZona(zona);
        setPrecio(precio);
    }

    public int getIdHotel() {
        return idHotel;
    }

    public Zonas getZona() {
        return zona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setZona(String zona) {
        try {
            this.zona = Zonas.valueOf(zona);
        } catch (java.lang.IllegalArgumentException ex) {
            System.out.println("Error. Zona hotel no permitida");
        }

    }

    public void setPrecio(double precio) throws Exception {
        if (precio < 40 || precio > 150) {
            throw new Exception("Error. Precio fuera de rango");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", zona=" + zona + ", precio=" + precio + '}';
    }

    @Override
    public int compareTo(Hotel o) {
       return (int) (this.getPrecio()-o.getPrecio());
    }
    
    

}
