package t6.Ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 * @author todbolsa
 */
abstract public class Empleado {

    private String dni;
    private String nombre;
    private int edad;

    public Empleado(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre
                + ", DNI: " + this.dni
                + ", Edad: " + this.edad;
    }

    abstract public double calcularSalarioMensual();

}
