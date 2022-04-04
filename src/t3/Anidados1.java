/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 * mostrar por pantalla la serie de numeros de 1 al 10, un numero n de veces
 */
public class Anidados1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero de veces para mostrar la serie de numeros del 1 al 10");
        int n = sc.nextInt();
        
        for(int y=1; y<=n; y++){
            for(int z=0; z<=10; z++){
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
}
