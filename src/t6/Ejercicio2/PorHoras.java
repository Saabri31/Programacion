/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Ejercicio2;

/**
 *
 * @author todbolsa
 */
public class PorHoras extends Empleado {

    private final double PRESIO;
    private double horasTrabajadas;

    public PorHoras(double PRESIO, double horasTrabajadas, String dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.PRESIO = PRESIO;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas;
    }

}
