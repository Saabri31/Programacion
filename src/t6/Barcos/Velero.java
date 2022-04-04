/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Barcos;

import java.time.LocalDate;

/**
 *
 * @author todbolsa
 */
public class Velero extends Barco {

    protected int mastiles;

    public Velero(int mastiles, String matricula, double eslora, LocalDate fabricacion, double potencia) {
        super(matricula, eslora, fabricacion, potencia);
        this.mastiles = mastiles;
    }

    public void alarma() {
        System.out.println("SOS desde un velero");
    }

    public void lanzarCohete() {
        System.out.println("Lanzamiento de bengala desde velero");
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public double modulo() {
        return moduloFuncion() + this.mastiles;
    }

}
