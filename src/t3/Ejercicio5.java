/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sabri
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        char texto = ' ';
        boolean terminar = false;
        do {
            System.out.println("Introduce un numero");
            num = teclado.nextInt();
            teclado.nextLine();
            if (num % 2 == 0) {
                System.out.println("El numero introducido es par");
            } else {
                System.out.println("El numero introducido es impar");
            }

            System.out.println("Otro numero? Responde con (S/N) ");
            texto = teclado.nextLine().charAt(0);

            if (texto == 'S') {

                terminar = false;
            } else if (texto == 'N') {
                terminar = true;
            } else {
                System.out.println("Respuesta incorrecta.");
                terminar = false;
                
            }
        } while (!terminar);
    }
}
