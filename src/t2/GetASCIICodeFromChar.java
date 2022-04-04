/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class GetASCIICodeFromChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        char letra;
        System.out.print("Introduce un caracter ");
        letra = teclado.nextLine().charAt(0);
        System.out.println("El caracter en ascii seria " + (int)letra);

    }
    
}
