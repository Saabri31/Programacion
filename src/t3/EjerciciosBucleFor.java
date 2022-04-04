/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 * Programa que simule el lanzamiento de 2 dados (un nº positivo de veces)
 * y cuente el nº de veces que sale 12.
 * 
 * Programa que genere 10 apuestas de quiniela
 */
public class EjerciciosBucleFor { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Introduce un numero de veces para tirar los dados");
            num = sc.nextInt();
            if(num<0){
                System.out.println("Error, el número debe ser positivo.");
            }
        } while (num<0);
        Random rnd = new Random();
        int contador = 0;
        for(int i=0; i<num; i++){
            if (rnd.nextInt(13) == 12){
                contador++;
            }
        }
        System.out.println("El numero de veces que sale 12 es " + contador);
    }
}
