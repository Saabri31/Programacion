/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7.PilaYColas.Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author todbolsa
 */
public class EjemploPila {

    public static void main(String[] args) {

        String[] semana = {"L", "M", "X", "J", "V", "S", "D"};

        LinkedList<String> pila = new LinkedList<>();

        //apilamos el contenido del array
        for (String dia : semana) {
            pila.push(dia);
        }

        //mostrar estado de la pila
        System.out.println(pila);

        //vaciamos el contenido de la pila
        //y lo vamos cargando en el array de dias
        int i = 0;
        while (!pila.isEmpty()) {
            semana[i] = pila.pop();
            i++;
            System.out.println(pila);
        }

        //mostrar estado de la pila
        System.out.println(pila);
        //mostrar array
        System.out.println(Arrays.toString(semana));

    }

}
