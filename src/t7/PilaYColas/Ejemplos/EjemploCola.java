/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7.PilaYColas.Ejemplos;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class EjemploCola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> cola = new LinkedList<>();

        System.out.println("Introduce lista de archivos a imprimir"
                + "<fin> para terminar");
        String archivo = "";
        do {
            archivo = sc.nextLine();
            if (!archivo.toLowerCase().equalsIgnoreCase("fin")) {
                cola.addLast(archivo);
            }
        } while (!archivo.toLowerCase().equalsIgnoreCase("fin"));

        //estado de la cola de impresion
        System.out.println("Archivos pendientes de imprimir...");
        System.out.println(cola);

        //vamos imprimiendo los archivos
        //atendemos la cola de impresion
        while (!cola.isEmpty()) {
            System.out.println("Imprimiendo..." + cola.removeFirst());
            System.out.println(cola);
        }
        System.out.println("Ningun archivo en la cola");

    }

}
