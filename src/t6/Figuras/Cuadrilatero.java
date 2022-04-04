/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Figuras;

/**
 *
 * @author todbolsa
 */
public class Cuadrilatero extends Figura {

    protected double lado1;
    protected double lado2;

    public Cuadrilatero(double lado1, double lado2, Punto centro) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.centro = centro;
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Se ha dibujado un rectangulo de lados: " + this.lado1 + ", " + this.lado2);
    }

    @Override
    public double calcularArea() {
        return this.lado1 * this.lado2;
    }

}
