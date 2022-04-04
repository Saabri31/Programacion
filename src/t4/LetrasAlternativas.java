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
public class LetrasAlternativas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre = " ";
        
        //Pedimos el nombre o frase
        
        System.out.println("Introduce un nombre o frase para escribir de forma alternativa");
        nombre = sc.nextLine();
        
        //Repeticion es la variable que uso para saber cuántas letras debo repetir en ambos lados.
        //Longitud es la variable que uso para saber la longitud del texto, le añado un "-1" porque 
        // nombre.length() empieza en 0.
        
        int repeticion = nombre.length()/2;
        int longitud = nombre.length()-1;
        
        //A continuacion se usa un for para imprimir por pantalla la palabra intercalada.
        
        for(int i=0; i<repeticion; i++){
            System.out.print(nombre.charAt(i));
            System.out.print(nombre.charAt(longitud-i));
        }
        
        //Este if es necesario por si la palabra imprimida es impar, lo que supondría un problema 
        //porque la letra de en medio nunca sería impresa.
        
        if(nombre.length()%2 != 0){
            System.out.print(nombre.charAt(longitud/2));
        }
        System.out.println();
    }
}
