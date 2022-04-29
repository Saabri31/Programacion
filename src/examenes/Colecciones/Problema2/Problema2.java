/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes.Colecciones.Problema2;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class Problema2 {

    public static int generarAleatorio() {
        Random rnd = new Random();
        return rnd.nextInt(10) + 1;
    }

    public static void rellenarPila(LinkedList<Integer> pila) {
        while (pila.size() != 10) {
            pila.push(generarAleatorio());
        }
    }

    public static void cambiarNumeroPila(LinkedList<Integer> pila, int numeroAntiguo, int numeroNuevo) {
        for (int i = 1; i <= pila.size(); i++) {
            if (pila.equals(numeroAntiguo)) {
                pila.remove(i);
                pila.push(numeroNuevo);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> pila = new LinkedList<>();
        int valorAntiguo = 0;
        int valorNuevo = 0;
        rellenarPila(pila);
        do {
            System.out.println("Pila inicial: " + pila);
            System.out.println("Valor antiguo: ");
            valorAntiguo = sc.nextInt();
            if (!pila.contains(valorAntiguo)) {
                System.out.println("No se ha podido encontrar");
            }
        } while (!pila.contains(valorAntiguo));
        System.out.println("Valor nuevo: ");
        valorNuevo = sc.nextInt();
        cambiarNumeroPila(pila, valorAntiguo, valorNuevo);
        System.out.println("Pila resultante: " + pila);

    }
}
