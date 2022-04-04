/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.util.Scanner;

/**
 *
 * Programa que solicite un par de cadenas y muestre por pantalla
 * el numero de ocurrencias de la segunda cadena en la primera
 * y sus posiciones
 * 
 * mostrar por pantalla: Fabricante://Almacen://Seccion://Color:
 * 
 * @author todbolsa
 */
public class ClaseString {
    public static void main(String[] args) {
        
//        String s1="Hola";
//        String s2=new String("Adios");
//        
//        System.out.println(s2.compareTo(s1));
//        System.out.println("Adios".equals(s2)); 
//        System.out.println(s1.equals(s2)); 
//        System.out.println("macarena".indexOf("a"));
//        System.out.println("macarena".lastIndexOf("a"));
//        System.out.println("macarena".indexOf("a", 2));
//        
//        String original = "oso";
//        System.out.println(original);
//        String modificada=original.replaceAll("o", "a");
//        System.out.println(modificada);
//        System.out.println(s1.substring(0, 3)); 

        String codigoArticulo = "FAB-123-56789-00-43-12-21-34-69";
        String[] partes = codigoArticulo.split("-");
//        System.out.println("Fabricante: " + partes[0]);
//        System.out.println("Almacen: " + partes[1]);
//        System.out.println("Seccion: " + partes[2]);
//        System.out.println("Color: " + partes[3]);
            for(int i=0; i<partes.length; i++){
                System.out.println(partes[i]);
            }
        
    }
}
