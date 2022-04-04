/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.Clases;

/**
 *
 * @author todbolsa
 */
public class EjemploExcepciones {
    public static void main(String[] args) {
        
        int x = (int)(Math.random()*5);
        int y = (int)(Math.random()*10);
        
        int z[] = new int[5]; //Creacion de un array de enteros de lenght 5
        
        System.out.println("La x es " + x);
        System.out.println("La y es " + y);
        
        try{
        System.out.println("x/y=" + x/y);
        System.out.println("Contenido del array en posicion " + y + "z" + z[y]);
        }catch(java.lang.ArithmeticException ex){
            System.out.println("No sabias que no se puede dividir entre cero?");
        }catch(java.lang.IndexOutOfBoundsException ex){
            System.out.println("La y se sale del array");
        }finally{
            System.out.println("Bloque finally");
        }
        
        System.out.println("Continuamos la ejecucion");
    }
}
