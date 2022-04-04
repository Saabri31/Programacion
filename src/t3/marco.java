/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * * programa que pinte por pantalla un marco cuadrado de un caracter
 * introducido por teclado cuyas dimensiones tambien son introducidas por
 * teclado; validar las dimensiones. ejemplo: base/altura:3 relleno: % %%% % %
 * %%%
 *
 * @author todbolsa
 */
public class marco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        char forma = ' ';
        do {
            System.out.println("Introduce las dimensiones del marco ");
            a = sc.nextInt();

            if (a <= 0) {
                System.out.println("El dato introducido no es válido. ");
            }
        } while (a <= 0);

        System.out.println("Introduce el caracter con el que quieres darle forma a tu rectangulo ");
        sc.nextLine();
        forma = sc.nextLine().charAt(0);
        
        //linea de arriba
        for (int x = 0; x<a; x++){
                System.out.print(forma);
            }
        
        System.out.println();
        
        //laterales
        for (int y = 1; y<a-1; y++){
            System.out.print(forma);
            for(int z = 1; z<a-1; z++){
                System.out.print(" ");
            }
            System.out.println(forma);
        }
        
        //linea de abajo
        for (int x = 0; x<a; x++){
                System.out.print(forma);
            }
        
        System.out.println();
    }
}
