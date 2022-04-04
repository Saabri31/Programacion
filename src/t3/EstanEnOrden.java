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
public class EstanEnOrden {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero 1 ");
        double num1 = teclado.nextDouble();
        
        System.out.println("Introduce el numero 2 ");
        double num2 = teclado.nextDouble();
        
        System.out.println("Introduce el numero 3 ");
        double num3 = teclado.nextDouble();
        
        if (num1>num2 && num2>num3){
            System.out.println("Los numeros estan ordenados de mayor a menor");
        }
        else if (num1<num2 && num2<num3){
            System.out.println("Los numeros estan ordenados de menor a mayor");
        }
        else System.out.println("Los numeros estan desordenados");
    }
}
