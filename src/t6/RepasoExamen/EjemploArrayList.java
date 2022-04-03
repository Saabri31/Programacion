/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.RepasoExamen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sabri
 *
 * programa ListaAleatoria que cree e imprima por pantalla un array de 10
 * elementos con números aleatorios comprendidos entre 1 y 10, de tal forma que
 * no se repita ninguno
 */
public class EjemploArrayList {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumero(array);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static int generarNumero(int[] array) {

        Random rnd = new Random();

        int num = rnd.nextInt(array.length + 1);
        if (contieneNumero(array, num)) {
            return generarNumero(array);
        }
        return num;
    }

    public static boolean contieneNumero(int[] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
