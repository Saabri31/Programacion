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
public class EjemploIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Introduce el numero 1 "); 
        double num1 = teclado.nextDouble();
        
        System.out.println("Introduce el numero 2 "); 
        double num2 = teclado.nextDouble();
        
        System.out.println("Introduce el numero 3 "); 
        double num3 = teclado.nextDouble();
        
        int positivos=0;
        int negativos=0;
        int nulos=0;
        
        if (num1 == 0){
            nulos++;
        }
        else if (num1 > 0){
            positivos++;
        }
        else if (num1 < 0){
            negativos++;
        }
        
        if (num2 == 0){
            nulos++;
        }
        else if (num2 > 0){
            positivos++;
        }
        else if (num2 < 0){
            negativos++;
        }
        
        if (num3 == 0){
            nulos++;
        }
        else if (num3 > 0){
            positivos++;
        }
        else if (num3 < 0){
            negativos++;
        }
        
        System.out.println("Hay " + nulos + " numeros nulos");
        System.out.println("Hay " + positivos + " numeros positivos");
        System.out.println("Hay " + negativos + " numeros negativos");
    }
}
