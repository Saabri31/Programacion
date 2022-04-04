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
public class Primo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        
        boolean primo=true;
        int i=2;
        while(i < num && primo){
            if (num % i == 0){
                primo = false;
            }
            i++;
        }
        if (primo){
            System.out.println("El numero " + num + " es primo");
        } else System.out.println("El numero " + num + " no es primo");
    }
}
