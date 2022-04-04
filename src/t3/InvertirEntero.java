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
public class InvertirEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //String n = String.valueOf(num);
        System.out.println("Introduce un numero para invertirlo ");
        String num = sc.nextLine();
        
        System.out.print("El numero invertido es ");
        
        //String n = String.valueOf(num);
        for(int i = num.length()-1; i>=0; i--){
            System.out.print(num.charAt(i));
        }
        System.out.println("");
    }
}
