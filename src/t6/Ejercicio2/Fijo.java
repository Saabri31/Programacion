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
public class Fijo extends Empleado {

    private LocalDate fechaInicial;
    private double salarioBase;
    private double complemento;

    public Fijo(LocalDate fechaInicial, String dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.fechaInicial = fechaInicial;
    }

    @Override
    public double calcularSalarioMensual() {

        int actualYear = LocalDate.now().getYear();
        double sueldo = salarioBase + (complemento + (actualYear - this.fechaInicial.getYear()));
        return sueldo;

    }

}
