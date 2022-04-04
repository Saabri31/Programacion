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
public class tablamultiplicar {
    public static void main(String[] args) {
        //2 numeros con sus respectivas tablas de multiplicar Nº rango 0-10
        Scanner teclado = new Scanner(System.in);
        int num1=-1;
        int num2=-1;
        while (num1 < 0 || num1 > 10){
            System.out.println("Introduce un numero: ");
            num1 = teclado.nextInt();
        }
        while (num2 < 0 || num2 > 10){
            System.out.println("Introduce otro numero: ");
        num2 = teclado.nextInt();
        }
        for(int i=0; i<=10; i++){
            System.out.println(num1 + "*" + i + " = " + num1*i);
            System.out.println(num2 + "*" + i + " = " + num2*i);
        }
    }
}
