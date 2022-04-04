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
public class mayorde10nums {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int mayor = 0;
        while(i<10){
            System.out.println("Introduce un numero ");
            n = teclado.nextInt();
            
            if (n > mayor){
                mayor = n;
            }
            i++;
        }
        System.out.println("El numero mayor es " + mayor);
//        System.out.println("Introduce el numero 1: ");
//        num1 = teclado.nextInt();
//        System.out.println("Introduce el numero 2: ");
//        num2 = teclado.nextInt();
//        if (num1>num2){
//            mayor=num1;
//        }
//        else mayor=num2;
//        System.out.println("Introduce el numero 3: ");
//        num3 = teclado.nextInt();
//        if (num3>mayor){
//            mayor=num3;
//        }
//        System.out.println("Introduce el numero 4: ");
//        num4 = teclado.nextInt();
//        if (num4>mayor){
//            mayor=num4;
//        }
//        System.out.println("Introduce el numero 5: ");
//        num5 = teclado.nextInt();
//        if (num5>mayor){
//            mayor=num5;
//        }
//        System.out.println("Introduce el numero 6: ");
//        num6 = teclado.nextInt();
//        if (num6>mayor){
//            mayor=num6;
//        }
//        System.out.println("Introduce el numero 7: ");
//        num7 = teclado.nextInt();
//        if (num7>mayor){
//            mayor=num7;
//        }
//        System.out.println("Introduce el numero 8: ");
//        num8 = teclado.nextInt();
//        if (num8>mayor){
//            mayor=num8;
//        }
//        System.out.println("Introduce el numero 9: ");
//        num9 = teclado.nextInt();
//        if (num9>mayor){
//            mayor=num9;
//        }
//        System.out.println("Introduce el numero 10: ");
//        num10 = teclado.nextInt();
//        if (num10>mayor){
//            mayor=num10;
//        }
//        System.out.println("El numero mayor es " + mayor);
    }
}
