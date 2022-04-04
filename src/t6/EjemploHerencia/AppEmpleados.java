/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.EjemploHerencia;

/**
 *
 * @author todbolsa
 */
public class AppEmpleados {
    public static void main(String[] args) {
        
        Programador p1 = new Programador();
        p1.setNombre("Pepe");
        p1.setApellido("Mena");
        p1.setSalarioBase(1000);
        p1.setRetencion(0.04);
        p1.setHoras(8);
        p1.setPrecioHora(8);
        System.out.println(p1.calcularSalarioMensual());
        
    }
}
