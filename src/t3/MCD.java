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
public class MCD {
    public static void main(String[] args) {
//        Escribe un programa llamado  MCD que lea desde el teclado dos números enteros positivos 
//        y que calcule el máximo común divisor de ambos. Para el cálculo del MCD utilizar el “algoritmo de Euclides”, 
//        que consiste en dividir el mayor número por el menor, quedarse con el resto y transformar dicho resto en el 
//        número menor y el menor de antes en el mayor de ahora. Repetir el proceso hasta que el resto sea cero. en 
//        ese momento el menor número será el máximo común divisor.

        Scanner sc = new Scanner(System.in);
        
        int num1=0;
        int num2=0;
        do {
            System.out.println("Introduce un numero entero positivo");
            num1= sc.nextInt();
            
            System.out.println("Introduce otro numero entero positivo");
            num2= sc.nextInt();
            
            if(num1<0 || num2<0){
                System.out.println("Error");
            }
        } while (num1<0 || num2<0);
        
        
        int mayor = 0;
        int menor=0;
        if(num1>num2){
            mayor=num1;
            menor=num2;
        } else {
            mayor=num2;
            menor=num1;
        }
        
        System.out.println("MCD(" + mayor + "," + menor + ")");
        
        int resto=0;
        while(mayor%menor!=0){
            resto = mayor%menor;
            mayor = menor;
            menor = resto;
        }
        System.out.println("El máximo común divisor es " + menor);
    }
}
