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
public class SistemaEcuaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de a ");
        double a = teclado.nextInt();
        System.out.println("Introduce el valor de b ");
        double b = teclado.nextInt();
        System.out.println("Introduce el valor de c ");
        double c = teclado.nextInt();
        System.out.println("Introduce el valor de d ");
        double d = teclado.nextInt();
        System.out.println("Introduce el valor de e ");
        double e = teclado.nextInt();
        System.out.println("Introduce el valor de f ");
        double f = teclado.nextInt();
        
        System.out.println(a + "x + " + b + "y = " + c);
        System.out.println(d + "x + " + e + "y = " + f);
       
        double x = (c*e - b*f) / (a*e - b*d);
        double y = (a*f-c*d) / (a*e-b*d);
        
        final String message = (Double.isFinite(x)) ?
                (Double.isFinite(y)) ? "X = " + x + "\n" + "Y = " + y :
                "Sin solucion\n" : "Sin solucion\n";
        System.out.println(message);
    }
}
