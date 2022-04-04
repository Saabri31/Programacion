/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.util.Random;

/**
 *
 * @author todbolsa
 */
public class Mayor {
    public static void main(String[] args) {
        
        Random  rnd = new Random();
        
        int num = 0;
        int mayor = 0;
        for(int i=1; i<=20; i++){
            num = (int)(rnd.nextDouble() * 1001);
            System.out.println(i + " - " + num);
        if(num>mayor) mayor = num;
        }
        System.out.println("El numero mayor es " + mayor);
    }
}
