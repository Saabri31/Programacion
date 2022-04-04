/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaYColas.Ejemplos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author todbolsa
 */
public class EjemplosPilasyColas {

    public static void main(String[] args) {
        /*Creamos la Cola Indicando el tipo de dato*/
        LinkedList<Integer> cola = new LinkedList<>();
        /*Insertamos datos*/
        cola.offer(3);
        cola.add(14);
        cola.offer(12);
        cola.add(7);
        cola.offer(10);
        /*Impresion de la Cola llena con los datos*/
        System.out.println("Cola llena: " + cola);
        /*Estructura repetitiva para desencolar*/
        System.out.println(cola.peek());
        while (cola.poll() != null) {//Desencolamos y el valor se compara con null
            System.out.println(cola.peek());//Muestra el nuevo Frente
        }
        /*Muestra null debido a que la cola ya esta vacia*/
        System.out.println(cola.peek());
    }
}
