/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 * programa que pinte por pantalla un romboide de un caracter introducido 
 * por teclado cuyas dimensiones tambien son introducidas por teclado; validar las dimensiones. ejemplo:
 * base: 5
 * altura: 3
 * relleno: %
 *    %%%%%
 *   %%%%%
 *  %%%%%
 */
public class Romboide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int altura = 0;
        char forma = ' ';
        do{
            System.out.println("Introduce la base ");
            base = sc.nextInt();
            
            System.out.println("Introduce la altura ");
            altura = sc.nextInt();
            
            if(base <= 0 || altura <= 0){
                System.out.println("Alguno de los datos introducidos no es válido. ");
            }
        }while (base <= 0 || altura <= 0);
        
            System.out.println("Introduce el caracter con el que quieres darle forma a tu rectangulo ");
            sc.nextLine();
            forma = sc.nextLine().charAt(0);
            
    
                for(int y = 0; y<altura; y++){
                    for (int x = 0; x < altura - y; x++){
                    System.out.print(" ");
                    }
                    for(int z = 0; z < base; z++){
                    System.out.print(forma + " ");
                }   
                System.out.println();
                }
                
                System.out.println();
                
                for(int y = altura; y>0; y--){
                    for (int x = altura - y; x > 0; x--){
                    System.out.print(" ");
                    }
                    for(int z = base; z > 0; z--){
                    System.out.print(" " + forma);
                }   
                System.out.println();
                }
    }
}
