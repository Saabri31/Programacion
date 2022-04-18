package t7.PilaYColas.Ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class Parentesis2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de parentesis: ");
        String s = sc.nextLine();

        try {
            System.out.println(cerrada(s));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static boolean cerrada(String s) throws Exception {
        LinkedList<Character> pila = new LinkedList();

        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(':
                    pila.push(c);
                    break;
                case ')':
                    if (pila.isEmpty())
                        return false;
                    else
                        pila.pop();
                    break;
                default:
                    throw new Exception("Cadena ilegal");
            }
        }
        return pila.isEmpty();
    }
}
