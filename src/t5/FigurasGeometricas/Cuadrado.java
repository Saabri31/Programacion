/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.FigurasGeometricas;

import java.awt.Toolkit;
import t5.EjercicioPunto.Punto;

/**
 *
 * @author todbolsa
 */
public class Cuadrado {

    private double lado;
    private Punto centro;

    public Cuadrado(double lado, Punto centro) {
        this.lado = lado;
        this.centro = centro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setCentro(double x, double y) {
        if (centro.getX() + lado / 2 > Toolkit.getDefaultToolkit().getScreenSize().width || x < 0)
            throw new RuntimeException("Fuera del plano x-y");
        if (centro.getY() + lado / 2 > Toolkit.getDefaultToolkit().getScreenSize().height || y < 0)
            throw new RuntimeException("Fuera del plano x-y");
        this.centro.setX(x);
        this.centro.setY(y);
    }

    public void mover(Punto newPunto) {
        this.centro.despPunto(newPunto.getX(), newPunto.getY());
    }

    public void mover(int newX, int newY) {
        this.centro.despPunto(newX, newY);
    }

    public void desplazar(int dX, int dY) {
        this.centro.despPunto(dX, dY);
    }

    public double area() {
        return Math.pow(lado, 2);
    }

    public double perimetro() {
        return 4 * lado;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + ", centro=" + centro + '}';
    }
}
