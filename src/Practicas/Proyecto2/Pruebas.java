/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.Proyecto2;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class Pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ubicacion ubi = new Ubicacion();
        Ticket ticket = new Ticket("1234-ABC", ubi);
        double segundos = 0;
        int a = sc.nextInt();
        if (a == 2) {
            segundos = ChronoUnit.SECONDS.between(ticket.getFechaHora(), LocalDateTime.now());
        }
        System.out.println(segundos);
        System.out.println(Maquina.aPagar(ticket));

    }
}
