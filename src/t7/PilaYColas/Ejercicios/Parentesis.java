/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaYColas.Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 *
 * Realiza un programa Parentesis que reciba desde el teclado una cadena con un
 * conjunto de paréntesis, “(“ o “)”, e indique si están bien o mal cerrados.
 *
 */
public class Parentesis {

    public static boolean comprobarParentesis(String s) {
        LinkedList<Character> pila = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char parentesis = s.charAt(i);
            if (parentesis == '(') {
                pila.push(parentesis);
            } else if (parentesis == ')') {
                if (pila.isEmpty())
                    return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena de parentesis");
        String cadena = sc.nextLine();
        comprobarParentesis(cadena);

    }
}
