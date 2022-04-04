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
public class Yate extends Barco {

    protected int camarotes;

    public Yate(int camarotes, String matricula, double eslora, LocalDate fabricacion, double potencia) {
        super(matricula, eslora, fabricacion, potencia);
        this.camarotes = camarotes;
    }

    public void alarma() {
        System.out.println("SOS desde un yate");
    }

    public void arriar() {
        System.out.println("Arriando desde un yate");
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double modulo() {
        return moduloFuncion() + this.potencia + this.camarotes;
    }

}
