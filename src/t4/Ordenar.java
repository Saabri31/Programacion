/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class Ordenar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce un par de palabras en la misma línea y separadas por espacios");
        String[] cadena = sc.nextLine().split(" ");
        
        for(int i=cadena.length-1; i>=0; i--){
            System.out.print(cadena[i]);
            System.out.print(" ");
        }
    }
}
