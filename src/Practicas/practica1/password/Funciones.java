/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.practica1.password;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Sabri
 */
public class Funciones {

    /**
     *
     * La funcion se utiliza para saber si la cadena contiene algun simbolo o no
     *
     * @param password La clave
     * @return Si el String contiene algun simbolo, es decir, no contiene
     * unicamente letras y/o numeros, se devuelve true Si el String no contiene
     * simbolos, se devuelve false
     *
     */
    public static boolean contieneSimbolos(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * La funcion se utiliza para saber si la cadena contiene algun digito o no
     *
     * @param password La clave
     * @return Si el String contiene algun digito, se devuelve true Si el String
     * no contiene digitos, se devuelve false
     *
     */
    public static boolean contieneDigitos(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * La funcion se utiliza para saber si la cadena contiene algun caracter en
     * mayuscula o no
     *
     * @param password La clave
     * @return Si el String contiene alguna mayuscula, devuelve true Si el
     * String no contiene ninguna mayuscula, devuelve false
     *
     */
    public static boolean contieneMayus(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;

    }

    /**
     *
     * La funcion se utiliza para saber si la cadena contiene algun caracter en
     * minuscula o no
     *
     * @param password La clave
     * @return Si el String contiene alguna minuscula, devuelve true Si el
     * String no contiene ninguna minuscula, devuelve false
     *
     */
    public static boolean contieneMinus(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;

    }

    /**
     *
     * La funcion se utiliza para saber si la cadena es completamente numerica o
     * no
     *
     * @param dni Numeros del DNI
     * @return Si la cadena String no son todo digitos, devuelve false Si la
     * cadena String son todo digitos, devuelve true
     *
     */
    public static boolean sonDigitos(String dni) {

        for (int i = 0; i < dni.length(); i++) {
            char c = dni.charAt(i);

            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;

    }

    /**
     *
     * Esta funcion se utiliza para generar la letra del DNI
     *
     * @param dni Numeros del DNI
     * @return La funcion devuelve el DNI numerico mas la letra que corresponde
     * a ese numero
     *
     */
    public static String letraDNI(String dni) {

        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numDNI = Integer.valueOf(dni);
        int resto = numDNI % 23;

        char letra = letrasDNI.charAt(resto);

        return dni + letra;
    }

    /**
     *
     * Esta funcion se utiliza para conseguir la aleatoriedad de las mayusculas,
     * minusculas, numeros y simbolos
     *
     * @param c caracter de la clave
     * @return Si el caracter es una letra, la funcion devuelve ese caracter en
     * mayuscula o minuscula, dependiendo el resultado del booleano Si el
     * caracter es un numero, la funcion devuelve ese caracter en formato
     * numerico o simbolo, dependiendo el resultado del booleano
     *
     */
    public static char moneda(char c) {

        Random rnd = new Random();

        String simbolos = "=!@#$%&/()";

        if (Character.isLetter(c)) {
            return (rnd.nextBoolean()) ? Character.toUpperCase(c) : Character.toLowerCase(c);
        } else {
            int num = Integer.parseInt(c + "");
            return (char) ((rnd.nextBoolean()) ? simbolos.charAt(num) : c);
        }
    }

    /**
     *
     * La funcion se utiliza para saber el nivel de seguridad de la clave
     *
     * @param password La clave
     * @return La funcion devuelve un String con el nivel de seguridad de la
     * clave
     *
     */
    public static String nivelSeguridad(String password) {

        if (password.length() <= 6) {
            return "-- Poco segura";
        } else if (contieneSimbolos(password) && contieneDigitos(password) && contieneMayus(password) && contieneMinus(password)) {
            return "-- Muy segura";
        } else
            return "-- Segura";

    }

    /**
     *
     * La funcion genera la clave mediante el metodo mecanico
     *
     * @return
     *
     */
    public static String metodoMecanico() {

        Random rnd = new Random();

        String password = ""; //Variable en la que se almacena la clave

        //Filas de la tabla
        String fila1 = "abcdef";
        String fila2 = "ghijkl";
        String fila3 = "mnopqr";
        String fila4 = "stuvwx";
        String fila5 = "yz0123";
        String fila6 = "456789";

        //Random mediante el que se elige la longitud de la cadena
        int longitud = rnd.nextInt(5) + 4;

        //Bucle que se ejecuta tantas veces como longitud tenga la clave
        for (int i = 0; i < longitud; i++) {

            int fila = rnd.nextInt(6) + 1; //Random mediante el que se elige la fila

            switch (fila) {
                case 1: {
                    //Random mediante el que se elige la columna
                    int columna = rnd.nextInt(6) + 1;
                    //Se guarda el caracter de esa posicion
                    char caracter = fila1.charAt(columna - 1);
                    //Se incorpora el caracter a la clave y se realiza
                    //la funcion moneda
                    password = password + moneda(caracter);
                    break;
                }
                case 2: {
                    int columna = rnd.nextInt(6) + 1;
                    char caracter = fila2.charAt(columna - 1);
                    password = password + moneda(caracter);
                    break;
                }
                case 3: {
                    int columna = rnd.nextInt(6) + 1;
                    char caracter = fila3.charAt(columna - 1);
                    password = password + moneda(caracter);
                    break;
                }
                case 4: {
                    int columna = rnd.nextInt(6) + 1;
                    char caracter = fila4.charAt(columna - 1);
                    password = password + moneda(caracter);
                    break;
                }
                case 5: {
                    int columna = rnd.nextInt(6) + 1;
                    char caracter = fila5.charAt(columna - 1);
                    password = password + moneda(caracter);
                    break;
                }
                case 6: {
                    int columna = rnd.nextInt(6) + 1;
                    char caracter = fila6.charAt(columna - 1);
                    password = password + moneda(caracter);
                    break;
                }
                default:
                    break;
            }
        }

        return password; //Devuelve la clave
    }

    /**
     *
     * La funcion genera la clave mediante algoritmos
     *
     * @return
     *
     */
    public static String metodoAlgoritmos() {

        SecureRandom scr = new SecureRandom();

        //Variable en la que se almacena la clave
        String password = "";
        //Cadena de texto con todos los caracteres permitidos de la clave
        String cadena = "abcdefghijklmnopqrstuvwxyz0123456789";

        //Random mediante el que se elige la longitud de la cadena
        int longitud = scr.nextInt(5) + 4;

        //Bucle que se ejecuta tantas veces como longitud tenga la clave
        for (int i = 0; i < longitud; i++) {

            //Random mediante el que se elige la posicion del caracter de la clave
            int posicion = scr.nextInt(35);
            //Se guarda el caracter de esa posicion
            char c = cadena.charAt(posicion);
            //Se incorpora el caracter a la clave y se realiza
            //la funcion moneda
            password += moneda(c);
        }

        return password; //Devuelve la clave
    }

    /**
     *
     * La funcion genera la clave mediante el metodo propio
     *
     * @param nombre nombre del usuario
     * @param ap1 primer apellido del usuario
     * @param dni DNI del usuario
     * @param nacimiento fecha de nacimiento del usuario
     * @return
     *
     */
    public static String metodoPropio(String nombre, String ap1, String dni, Date nacimiento) {

        Random rnd = new Random();

        //Cadena de simbolos permitidos
        String simbolos = "=!@#$%&/()";
        //Random para elegir posicion del simbolo
        int numSimbolo = rnd.nextInt(10);
        //Variable en la que se almacena la clave
        String password = "";

        //Primera letra del nombre en mayuscula
        password += Character.toUpperCase(nombre.charAt(0));
        //Ultima letra del primer apellido en minuscula
        password += Character.toLowerCase(ap1.charAt(ap1.length() - 1));
        //Dos ultimas cifras del DNI
        password += dni.substring(dni.length() - 2);
        //Letra del DNI en mayusculas
        password += letraDNI(dni).charAt(dni.length());
        //Dos ultimas cifras de la fecha de nacimiento
        password += nacimiento.toString().substring(nacimiento.toString().length() - 2);
        //Simbolo aleatorio
        password += simbolos.charAt(numSimbolo);

        //Random mediante el que se elige la longitud de la cadena 
        int longitud = rnd.nextInt(5) + 4;

        //La clave se corta en la posicion resultante del random anterior
        password = password.substring(0, longitud - 1);

        return password; //Devuelve la clave
    }
}
