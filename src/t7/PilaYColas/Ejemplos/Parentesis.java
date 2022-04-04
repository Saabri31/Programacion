package PilaYColas.Ejemplos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Parentesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de parentesis: ");
        String s = sc.nextLine();

        try {
            System.out.println(cerrada(s));
        } catch (Exception e) {
            System.err.println(e);
        }
        
        Map<String, String> capitalCities = new HashMap<>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
        
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
