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
public class Diagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado = 0;
        char forma = ' ';

        do {
            System.out.println("Introduce las dimensiones del marco ");
            lado = sc.nextInt();

            if (lado <= 0) {
                System.out.println("El dato introducido no es válido. ");
            }
        } while (lado <= 0);
        
        System.out.println("Introduce el caracter con el que quieres darle forma a tu rectangulo ");
        sc.nextLine();
        forma = sc.nextLine().charAt(0);
        
        char diagonal = ' ';
        
        do{
            System.out.println("Elige el tipo de diagonal que quieres realizar: \\ o / ");
        diagonal = sc.nextLine().charAt(0);
        
        if(diagonal != '\\' && diagonal != '/' ){
            System.out.println("El tipo de diagonal no es válido.");
        }
        
        }while(diagonal != '\\' && diagonal != '/' );
        
        if(diagonal=='\\'){
            for(int i=0; i<lado; i++){
                for(int j=0; j<lado; j++){
                    System.out.print(forma);
                }
                break;
            }
        }
        else{
            
        }
        
        
    }
}
