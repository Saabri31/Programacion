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
public class Cadenas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        //Se piden las cadenas de texto.
        System.out.println("Introduce la frase en la que se van a buscar los caracteres");
        String c1 = sc.nextLine();
        System.out.println("Introduce la cadena que se tiene que buscar en el texto");
        String c2 = sc.nextLine();
        
        int reps = 0; 
        int anterior = 0;
        String posiciones = " "; 
        
        //Bucle para sacar las repeticiones de c2 en c1.
        while (c1.contains(c2)) {
            int index = c1.indexOf(c2);
            anterior = anterior + index + 1;
            reps++;
            posiciones = posiciones + anterior + " ";
            c1 = c1.substring(index + 1);
        }

        //Mediante este if else, se toman distintas decisiones según el resultado de repeticiones. 
        if (reps > 1) {
            System.out.println("Se han encontrado " + reps + " veces en las posiciones: " + posiciones);
        }
        else if(reps == 1){
            System.out.println("Se ha encontrado " + reps + " vez en la posicion: " + posiciones);
        }else
            System.out.println("No se han encontrado repeticiones de la cadena");
    }
}
