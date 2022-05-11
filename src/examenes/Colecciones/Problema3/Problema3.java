/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes.Colecciones.Problema3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author todbolsa
 */
public class Problema3 {

    public static Map<String, List<String>> diccionario = new HashMap<>();
    public static List<String> significados = new ArrayList<String>();

    /**
     *
     * @param palabra
     * @param significado
     *
     * método que almacena la palabra con el significado recibidos como
     * parámetros, si la palabra no existe en el diccionario. En el caso de que
     * la palabra ya esté almacenada en el diccionario entonces añade el nuevo
     * significado a los ya existentes.
     */
    public static void addPalabra(String palabra, String significado) {
        if (diccionario.containsKey(palabra)) {
            diccionario.get(palabra).add(significado);
        } else {
            significados.add(significado);
            diccionario.put(palabra, significados);
        }
    }

    /**
     *
     * @param palabra
     *
     * método que devuelve el PRIMER significado de la palabra recibida como
     * parámetro. En el caso de que la palabra no exista en el diccionario,
     * devolverá -1
     */
    public static String getSignificado(String palabra) {
        if (!diccionario.containsKey(palabra)) {
            return "-1";
        } else {
            return diccionario.get(palabra).get(0);
        }
    }

    /**
     * método que devuelve TODOS los significados de la palabra recibida como
     * parámetro. En el caso de que la palabra no exista en el diccionario,
     * devolverá null.
     */
    public static List<String> getSignificados(String palabra) {
        String[] significados = null;
        if (!diccionario.containsKey(palabra)) {
            return diccionario.get(palabra);
        } else
            return diccionario.get(palabra);
    }

    /**
     * método que devuelve un listado de todas las palabras del diccionario
     * ordenadas alfabéticamente, mostrando para cada palabra el nº de
     * significados de que dispone entre paréntesis
     */
    public static void indice() {
        HashMap<String, List<String>> diccionarioOrdenado = (HashMap<String, List<String>>) diccionario;
        System.out.println(diccionarioOrdenado.keySet());
    }

    public static void main(String[] args) {
    }
}
