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
 */
public class EjercicioSabrinaToderean {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        
        String usuario = " ";
        
        System.out.println("Nombre de usuario: ");
        usuario = sc.nextLine();
        
        int meta = 0;
        for(int i=0; i<=usuario.length()-1; i++){
            meta = meta + usuario.charAt(i);
        }
        System.out.println("Meta en: " + meta);
        
        Random rnd = new Random();

        int caballo=0;
        
        do{
            Thread.sleep(100);
                for(int x=0; x<meta; x++){
                    System.out.print("1");
                }
                System.out.println();
            
                for(int y=0; y<meta; y++){
                    System.out.print("2");
                }
                System.out.println("\n");
            
                caballo++;
        }while(caballo<=meta);
                System.out.println();
    }
}
