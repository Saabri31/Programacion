/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3;

/**
 *
 * @author Sabri
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generar numeros impares entre 1 y 100 y contarlos.
        int contador = 0;
        for (int i=1; i<=100; i++){
            if (i%2 != 0){
                contador++;
            }
            else contador = contador;
        }
        System.out.println(contador);
    }
    
}
