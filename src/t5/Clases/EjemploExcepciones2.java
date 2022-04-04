/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.Clases;

/**
 *
 * @author todbolsa
 */
public class EjemploExcepciones2 {

    public static void main(String[] args) {

        EjemploExcepciones2 app = new EjemploExcepciones2();
        app.Metodo1();
    }

    public void Metodo1() {
        Metodo11();
    }

    public void Metodo11() {
        try {
            Metodo111();
        } catch (java.lang.ArithmeticException ex) {
            System.out.println("No sabias que no se puede dividir entre cero? - Desde metodo 11");
        } catch (java.lang.IndexOutOfBoundsException ex) {
            System.out.println("La y se sale del array");
        }
        System.out.println("Despues de llamar al metodo 11");
    }

    public void Metodo111() {
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 10);

        int z[] = new int[5]; //Creacion de un array de enteros de lenght 5

        System.out.println("La x es " + x);
        System.out.println("La y es " + y);

        System.out.println("x/y=" + x / y);
        System.out.println("Contenido del array en posicion " + y + "z" + z[y]);

    }

}
