package Practicas.Proyecto2;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Funciones {

    public static boolean contieneSimbolos(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean sonDigitos(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validarMatricula(String matricula) {

        if (matricula.contains("-")) {
            String[] array = matricula.split("-");

            String numeros = array[0];
            String letras = array[1];

            if (numeros.length() != 4 || !sonDigitos(numeros)) {
                return false;
            }
            if (letras.length() != 3 || sonDigitos(letras) || contieneSimbolos(letras)) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }

    public static String formatearFechaHora(LocalDateTime fechaHora) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

        String formatDateTime = fechaHora.format(formatter);

        return formatDateTime;

    }

    public static double formatearMinutos(double minutos) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);
        nf.setRoundingMode(RoundingMode.FLOOR);
        String min = nf.format(minutos);
        double tiempo = Double.valueOf(min);
        return tiempo;
    }

}
