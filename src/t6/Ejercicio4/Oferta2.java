/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Ejercicio4;

/**
 *
 * @author todbolsa
 */
public class Oferta2 implements Operaciones {

    private final double porcentaje;

    public static final double PRESIO = 0.3;

    private long sec = 0;

    public Oferta2(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void conexion(int s) {
        this.sec = s;
    }

    @Override
    public double importe() {
        return PRESIO * sec;
    }

    public double descuento() {
        return importe() * porcentaje / 100;
    }

    @Override
    public void reset() {
        sec = 0;
    }

}
