/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 * programa que pinte por pantalla un rectangulo de un caracter introducido 
 * por teclado cuyas dimensiones tambien son introducidas por teclado; validar las dimensiones. ejemplo:
 * base: 5
 * altura: 3
 * relleno: %
 * %%%%%
 * %%%%%
 * %%%%%
 */
public class Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int h = 0;
        String forma = "";
        do{
            System.out.println("Introduce la base ");
            a = sc.nextInt();
            
            System.out.println("Introduce la altura ");
            h = sc.nextInt();
            
            if(a <= 0 || h <= 0){
                System.out.println("Alguno de los datos introducidos no es válido. ");
            }
        }while (a <= 0 || h <= 0);
        
            System.out.println("Introduce el caracter con el que quieres darle forma a tu rectangulo ");
            forma = sc.next();
            
            for (int x = 0; x<h; x++){
                System.out.print(forma);
                for(int y = 0; y<a; y++){
                    System.out.print(forma);
                }   
                System.out.println();
            }
    }
}
