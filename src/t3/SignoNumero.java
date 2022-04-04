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
public class SignoNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num = teclado.nextDouble();
        if (num == 0){
            System.out.println("El numero es cero");
        }
        else if (num > 0){
            System.out.println("El numero es positivo");
        }
        else System.out.println("El numero es negativo");
    }
}
