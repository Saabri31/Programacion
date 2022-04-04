/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class fecha3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nº de segundos: ");
        long segundos = sc.nextLong();

        Date dateHoy = new Date();

        long miliseg = dateHoy.getTime() + (segundos * 1000);

        Date nuevaFecha = new Date(miliseg);
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

        System.out.println(df.format(nuevaFecha));

    }
}
