 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class MasLarga {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String frase = " ";
        String maslarga = " ";
        
        do{
            System.out.println("Introduce una frase: ");
            frase = sc.nextLine();
            maslarga = frase;
            
            if(frase.length()==0){
                System.out.println("Esa frase no es valida al inicio del programa.");
            }
            
        }while(frase.length()==0);
            
        do{
            System.out.println("Introduce otra frase para continuar el programa, si quieres terminarlo, no introduzcas nada.");
            frase = sc.nextLine();
            
            if(frase.length() > maslarga.length()){
                maslarga=frase;
            }
            
        }while(frase.length()!=0);
        
        System.out.println("La frase mas larga es \"" + maslarga + "\".");
    }
}
