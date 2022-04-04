/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.EjemploHerencia;

/**
 *
 * @author todbolsa
 */
public class Programador extends Empleado {

    private double horas;
    private double precioHora;

    public Programador() {
        super();
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return super.calcularSalarioMensual() + (this.horas * this.precioHora);
    }

    public void asignarCategoria(String categoria) {
        if(categoria.equalsIgnoreCase("junior")) this.categoria=3;
        else if(categoria.equalsIgnoreCase("semi-senior")) this.categoria=2;
        else if(categoria.equalsIgnoreCase("senior")) this.categoria=1;
    }

}
