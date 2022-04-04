/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Ejercicio4;

/**
 *
 * @author todbolsa
 */
public class Oferta1 implements Operaciones {

    public static final double PRESIO = 0.3;

    private long sec = 0;

    @Override
    public void conexion(int s) {
        sec += s - 180;
        if (sec < 0)
            sec = 0;
    }

    @Override
    public double importe() {
        return sec * PRESIO;
    }

    @Override
    public void reset() {
        sec = 0;
    }

}
