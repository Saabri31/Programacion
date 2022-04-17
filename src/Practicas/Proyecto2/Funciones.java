package Practicas.Proyecto2;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Funciones {

    //Comprueba que la cadena no contenga simbolos
    public static boolean contieneSimbolos(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    //Comprueba que la cadena sea numerica
    public static boolean sonDigitos(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    //Formatea la fecha y hora
    public static String formatearFechaHora(LocalDateTime fechaHora) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formatDateTime = fechaHora.format(formatter);
        return formatDateTime;

    }

    //Formatea los minutos para que no salgan con decimales
    public static double formatearMinutos(double minutos) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);
        nf.setRoundingMode(RoundingMode.FLOOR);
        String min = nf.format(minutos);
        double tiempo = Double.valueOf(min);
        return tiempo;
    }

}
