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
public class Not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String binario = "";
        String complemento = "";
        
        System.out.print("Introduce un numero binario de 8 bits ");
        binario = sc.nextLine();
        
        if(binario.length() != 8){
            System.out.println("Error de entrada de datos.");
        } else {
            int i = 0;
            boolean bit = true;
            while (i < binario.length() && bit) {
                char c = binario.charAt(i);
                if (c != '1' && c != '0'){
                    bit = false;
                }
                i++;
            }
            if (bit){
                System.out.println("NOT(" + binario + ") = ");
                i = 0;
                int dec = 0;
                while (i < binario.length()) {
            if (binario.charAt(i) == '1') {
                complemento = complemento + '0';
            } else {
                complemento = complemento + '1';
                dec = dec + (int) Math.pow(2, i);
                }
                i++;
            }
            System.out.println(complemento);
            }
        }
    }
}
