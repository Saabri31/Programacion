/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.FigurasGeometricas;

import t5.EjercicioPunto.Punto;

/**
 *
 * @author todbolsa
 */
public class Rectangulo {
    
    private double ancho;
    private double alto;
    private Punto centro;

    public Rectangulo(double ancho, double alto, Punto centro) {
        this.ancho = ancho;
        this.alto = alto;
        this.centro = centro;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    
   public void mover(Punto newPunto){
        this.centro.despPunto(newPunto.getX(), newPunto.getY());
    }
    
    public void mover(int newX, int newY){
        this.centro.despPunto(newX, newY);
    }
    
    public void desplazar(int dX, int dY){
        this.centro.despPunto(dX, dY);
    }
    
    public double area() {
        return ancho * alto;
    }
    
    public double perimetro() {
        return (2 * ancho) + (2 * alto);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(alto, 2) + Math.pow(ancho, 2));
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", alto=" + alto + ", centro=" + centro + '}';
    }
    
}