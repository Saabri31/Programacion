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
public class Ejercicio3 {
    public static void main(String[] args) {
        //Generar pares entre 1 y un numero por teclado, contarlos y sumarlos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        int contador = 0; 
        int suma = 0;
        for (int i=1; i<=num; i++){
            if(i%2==0){
                contador++;
                System.out.println(i + "");
                suma = suma + i;
            }
        }
        System.out.println("Hay " + contador + " numeros pares.");
        System.out.println("La suma es " + suma + ".");
    }
}
