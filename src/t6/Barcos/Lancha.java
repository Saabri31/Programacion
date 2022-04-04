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
public class Lancha extends Barco{

    public Lancha(String matricula, double eslora, LocalDate fabricacion, double potencia) {
        super(matricula, eslora, fabricacion, potencia);
    }    
    
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public double modulo(){
        return moduloFuncion() + this.potencia;
    }
    
}
