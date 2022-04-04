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
public class Ejercicio2 {
    public static void main(String[] args) {
        //Generar nums naturales entre 2 nums introducidos por teclado empezando por el mas pequeño
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int n1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2 = teclado.nextInt();
        if (n1<n2){
            for(int i=n1; i<=n2; i++){
                System.out.println(i + " ");
            }
        }
        else {
            for(int i=n2; i<=n1; i++){
                System.out.println(i + " ");
        }
        }
        
    }
}
