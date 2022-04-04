/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class Binario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer bit ");
        int b2 = teclado.nextInt();
        System.out.println("Introduce el segundo bit ");
        int b1 = teclado.nextInt();
        System.out.println("Introduce el tercer bit ");
        int b0 = teclado.nextInt();
        
        if (b1 != 0 && b1 != 1){
            System.out.println("Error de entrada de datos");
        }
        else if(b2 != 0 && b2 != 1){
            System.out.println("Error de entrada de datos");
        }
        else if(b0 != 0 && b0 != 1)
        {
            System.out.println("Error de entrada de datos");
        }
        else System.out.println( 2*2*b2 + 2*b1 + b0);
    }
}
