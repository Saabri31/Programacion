/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Figuras;

/**
 *
 * @author todbolsa
 *
 * Define el comportamiento minimo comun de todas las figuras
 *
 */
public abstract class Figura {

    protected Punto centro;

    public abstract void dibujarFigura();

    public abstract double calcularArea();

}
