/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Figuras;

/**
 *
 * @author todbolsa
 */
public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double radio, Punto centro){
        this.radio=radio;
        this.centro=centro;
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Se ha dibujado un circulo de radio. " + this.radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    
    
}
