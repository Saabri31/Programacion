/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.practica1.password;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class General {

    //Metodo principal donde se va a ejecutar todo el programa
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = ""; //Variable en la que se almacena el nombre 
        String ap1 = ""; //Variable en la que se almacena el primer apellido
        String ap2 = ""; //Variable en la que se almacena el segundo apellido

        /**
         * Bucle de validacion para la entrada del nombre Si la cadena de texto
         * es menor de 3, vuelve a pedir el nombre hasta que la longitud sea
         * mayor o igual a 3 Se restringe al usuario meter simbolos en la cadena
         * con la funcion "contieneSimbolos"
         */
        do {

            System.out.println("Introduce tu nombre: ");
            nombre = sc.nextLine().replaceAll(" ", "").replaceAll("\t", "");

            if (nombre.length() < 3) {
                System.out.println("El nombre necesita tener al menos 3 caracteres.");
            } else if (Funciones.contieneSimbolos(nombre) || Funciones.contieneDigitos(nombre)) {
                System.out.println("Esos caracteres no estan permitidos.");
            }

        } while (nombre.length() < 3 || Funciones.contieneSimbolos(nombre) || Funciones.contieneDigitos(nombre));

        /**
         * Bucle de validacion para la entrada del primer apellido Si la cadena
         * de texto es menor de 2, vuelve a pedir el apellido hasta que la
         * longitud sea mayor o igual a 2 Se restringe al usuario meter simbolos
         * en la cadena con la funcion "contieneSimbolos"
         */
        do {

            System.out.println("Introduce tu primer apellido");
            ap1 = sc.nextLine().replaceAll(" ", "").replaceAll("\t", "");

            if (ap1.length() < 2) {
                System.out.println("El apellido necesita tener al menos 2 caracteres.");
            } else if (Funciones.contieneSimbolos(ap1) || Funciones.contieneDigitos(ap1)) {
                System.out.println("Esos caracteres no estan permitidos.");
            }

        } while (ap1.length() < 2 || Funciones.contieneSimbolos(ap1) || Funciones.contieneDigitos(ap1));

        /**
         * Bucle de validacion para la entrada del segundo apellido Si la cadena
         * de texto es menor de 2, vuelve a pedir el apellido hasta que la
         * longitud sea mayor o igual a 2 Se restringe al usuario meter simbolos
         * en la cadena con la funcion "contieneSimbolos"
         */
        do {

            System.out.println("Introduce tu segundo apellido");
            ap2 = sc.nextLine().replaceAll(" ", "").replaceAll("\t", "");

            if (ap2.length() < 2) {
                System.out.println("El apellido necesita tener al menos 2 caracteres.");
            } else if (Funciones.contieneSimbolos(ap2) || Funciones.contieneDigitos(ap2)) {
                System.out.println("Esos caracteres no estan permitidos.");
            }

        } while (ap2.length() < 2 || Funciones.contieneSimbolos(ap2) || Funciones.contieneDigitos(ap2));

        //Se recorta el nombre a los 3 primeros caracteres para poder formar el nombre de usuario
        String usn = nombre.substring(0, 3);
        //Se recorta el primer apellido a los 2 primeros caracteres para poder formar el nombre de usuario
        String usap1 = ap1.substring(0, 2);
        //Se recorta el primer apellido a los 2 primeros caracteres para poder formar el nombre de usuario
        String usap2 = ap2.substring(0, 2);

        //Se unen los "String" anteriores en una misma cadena, que forma el nombre de usuario
        String nombreus = usap2 + usap1 + usn;

        //Se pasan todos los caracteres del nombre de usuario a minuscula
        nombreus = nombreus.toLowerCase();

        String dni = ""; //Variable en la que se almacena el DNI

        /**
         * Bucle de validacion para la entrada del dni Si el dni tiene una
         * longitud distinta de 8 caracteres, se vuelve a pedir el dni hasta que
         * se cumpla la condicion Si el dni contiene caracteres no numericos, se
         * vuelve a pedir el dni hasta que se cumpla la condicion Si el dni esta
         * compuesto unicamente por 0, se vuelve a pedir el dni hasta que se
         * cumpla la condicion
         */
        do {

            System.out.println("Introduce tu DNI: ");
            dni = sc.nextLine();

            if (dni.length() != 8) {
                System.out.println("El DNI debe estar formado por 8 caracteres.");
            } else if (!Funciones.sonDigitos(dni)) {
                System.out.println("EL DNI debe estar formado unicamente por numeros.");
            } else if (dni.equals("00000000")) {
                System.out.println("El dni no puede estar compuesto unicamente por ceros.");
            }

        } while (dni.length() != 8 || !Funciones.sonDigitos(dni) || dni.equals("00000000"));

        boolean valido = false; //Variable de tipo booleana en la que se almacena la validacion de la pedida de la fecha

        //Variable en la que se almacena la fecha de nacimiento
        Date nacimiento = null;
        //Declaracion de la clase "SimpleDateFormat" y la forma correcta al escribir la fecha
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        //Damos valor negativo al lenient para que nuestra fecha no pueda almacenar un valor fuera de rango
        df.setLenient(false);

        /**
         * Bucle de validacion para la entrada de la fechad de nacimiento Si la
         * fecha es posterior a la fecha actual o anterior a 1900, se vuelve a
         * pedir la fecha hasta que se cumpla esa condicion Si la fecha se sale
         * de rango, devuelve un error que es contenido por el try-catch, y
         * vuelve a pedir la fecha hasta que se cumpla la condicion
         */
        do {

            try {
                System.out.println("Introduce tu fecha de nacimiento(dd/mm/yyyy): ");
                String fecha = sc.nextLine();

                nacimiento = df.parse(fecha);
                GregorianCalendar minimo = new GregorianCalendar(1900, 0, 1);
                if (nacimiento.compareTo(Calendar.getInstance().getTime()) < 0
                        && nacimiento.compareTo(minimo.getTime()) > 0) {
                    valido = true;
                } else
                    System.out.println("La fecha no es valida");

            } catch (Exception e) {
                System.out.println("La fecha no es valida");
            }

        } while (!valido);

        /**
         * Zona de salida de datos
         */
        //Se imprime el nombre de usuario
        System.out.println("El nombre de usuario es " + nombreus);
        //Se imprime el DNI
        System.out.println("El DNI es " + Funciones.letraDNI(dni));
        //Se crea la contraseña del metodo mecanico al aplicar la funcion mecanica
        String mecanica = Funciones.metodoMecanico();
        //Se imprime la clave por metodo mecanico y su nivel de seguridad
        System.out.println("La clave por metodo mecanico es " + mecanica + " " + Funciones.nivelSeguridad(mecanica));
        //Se crea la contraseña del metodo de algoritmos al aplicar la funcion de algoritmos
        String algoritmo = Funciones.metodoAlgoritmos();
        //Se imprime la clave por algoritmos y su nivel de seguridad
        System.out.println("La clave por algoritmos es " + algoritmo + " " + Funciones.nivelSeguridad(algoritmo));
        //Se crea la contraseña del metodo propio al aplicar la funcion del metodo propio
        String miIdea = Funciones.metodoPropio(nombre, ap1, dni, nacimiento);
        //Se imprime la clave por el metodo propio y su nivel de seguridad
        System.out.println("La clave por mi idea es " + miIdea + " " + Funciones.nivelSeguridad(miIdea));

    }
}
