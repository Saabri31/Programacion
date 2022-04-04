/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class Divisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num = teclado.nextDouble();
        System.out.println("Introduce otro numero");
        double num2 = teclado.nextDouble();
        if (num % num2 == 0){
            System.out.println("Es divisible");
        }
        else System.out.println("No es divisible");
        
    }
    
}
