/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class Prueba {
    public static void main(String[] args) {
        String nombre;
        int num=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        for(int i=0;i<num;i++){
            System.out.print( nombre.charAt(i));
        }
        System.out.println();
        
        teclado.close();
    }
            
}