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
public class Vocales {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase");
        String texto = sc.nextLine();
        
        int contador = 0;
        
        for(int i=0; i<texto.length(); i++){
            char character = texto.charAt(i);
            if(character == 'a' || character == 'e'  || character == 'i'  || character == 'o'  || character == 'u'  ){
                contador++;
            }
        }
        System.out.println("Hay " + contador + " vocales");
    }
}
