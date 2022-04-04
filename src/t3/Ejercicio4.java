/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class Ejercicio4 {

    public static void main(String[] args) {
//        programa que pida repetidamente numeros hasta que num=0; 
//        finaliza mostrando la cuenta de numeros introducidos;
//        tambien dice si los numeros son pares o impares;
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        int contadorp = 0;
        int contadorim = 0;
        do {
            System.out.println("Introduce un numero");
            num = teclado.nextInt();
            contador = contador + 1;
            if (num % 2 == 0) {
                System.out.println("El numero introducido es par");
                contadorp++;
            } else {
                System.out.println("El numero introducido es impar");
                contadorim++;
            }

        } while (num != 0);
        System.out.println("Numeros introducidos: " + contador);
        System.out.println("Numeros pares: " + contadorp);
        System.out.println("Numeros impares: " + contadorim);
                
    }
}
