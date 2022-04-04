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
public class Invertir {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String invertida = " ";
        
        System.out.println("Introduce un texto para ivertir");
        String cadena = sc.nextLine();
        
        for(int i=0; i<cadena.length(); i++){
            char c = cadena.charAt(i);
            if(Character.isUpperCase(c)){
                invertida = invertida + Character.toLowerCase(c);
            }else invertida = invertida + Character.toUpperCase(c);
        }
        
         System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    } 
}
