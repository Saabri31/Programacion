/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author todbolsa
 */
public class Temporal extends Empleado {

    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private final double sueldo;

    public Temporal(LocalDate fechaAlta, LocalDate fechaBaja, double sueldo, String dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSalarioMensual() {
        return sueldo;
    }
}
