/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6.EjemploHerencia;

/**
 *
 * @author todbolsa
 */
public class Empleado {

    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected double retencion; //% de retencion sobre el salario base

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    protected int categoria;

    public double calcularSalarioMensual() {
        return this.salarioBase * (1 - this.retencion);
    }

    //Considerando el salario base
    public void asignarCategoria() {
        if (this.salarioBase >= 1000 && this.salarioBase <= 1800) {
            this.categoria = 3;
        } else if (this.salarioBase > 1800 && this.salarioBase <= 2500) {
            this.categoria = 2;
        } else
            this.categoria = 1;
    }

    //Considerando grupo: A, B, C
    public void asignarCategoria(char categoria) {
        switch (categoria) {
            case 'A':
                this.categoria = 1;
                break;
            case 'B':
                this.categoria = 2;
                break;
            case 'C':
                this.categoria = 1;
                break;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", retencion=" + retencion + ", categoria=" + categoria + '}';
    }

}
