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
public class Calculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        
        System.out.println("Introduce el primer numero ");
        num1 = teclado.nextDouble();
        
        System.out.println("Introduce el segundo numero ");
        num2 = teclado.nextDouble();
        
        System.out.println("Introduce operador (+,-,*,/): ");
        char operacion = teclado.next().charAt(0);
        double resultado=(operacion == '+') ? (num1+num2) :
                         (operacion == '-') ? (num1-num2) :
                         (operacion == '*') ? (num1*num2) :
                         (operacion == '/') ? (num1/num2) :
                          Double.NaN;
        String mensaje= (resultado == Double.NaN) ? ("Operación no contemplada") :
                ("Resultado operación = " + resultado);
        
        System.out.println(mensaje);
    } 
}
