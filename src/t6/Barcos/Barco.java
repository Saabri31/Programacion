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
public class Barco {

    protected String matricula;
    protected double eslora;
    protected LocalDate fabricacion;
    protected double potencia;
    protected final int CTE = 2;

    public Barco(String matricula, double eslora, LocalDate fabricacion, double potencia) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
        this.potencia = potencia;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }

    public double moduloFuncion() {
        return this.eslora * 10 * this.CTE;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + '}';
    }

}
