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
public class MiNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce la segunda nota ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce la tercera nota ");
        int num3 = teclado.nextInt();
        System.out.println("Introduce la cuarta nota ");
        int num4 = teclado.nextInt();
        
        double media = (num1+num2+num3+num4)/4;
        
        if (media >= 0 && media < 60){
            System.out.println("Media: E");
        }
        else if (media > 59 && media < 70){
            System.out.println("Media: D");
        }
        else if (media > 69 && media < 80){
            System.out.println("Media: C");
        }
        else if (media > 79 && media < 90){
            System.out.println("Media: B");
        }
        else if(media > 89 && media <= 100){
            System.out.println("Media: A");
        }
        else System.out.println("La media no es valida");
    }
}
