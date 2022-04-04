/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author todbolsa
 */
public class AppHoteles {

    Set<Hotel> hoteles = new HashSet<>();

    public void crearHoteles() {
//        Set<Hotel> hoteles = new TreeSet<>();
//        try{
//            hoteles.add(e);
//        }catch(Exception e){
//            
//        }
    }

    public void mostrarHoteles1() {
        System.out.println(hoteles);
    }

    public void mostrarHoteles2() {
        for (Hotel hotel : hoteles) {
            System.out.println(hoteles);
        }
    }

    public static void mostrarHoteles3() {
        Iterator<Hotel> it;
        
    }

    public static void main(String[] args) {

    }
}
