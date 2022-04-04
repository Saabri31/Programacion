/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.EjercicioPunto;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class AppPunto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Punto p = new Punto(1023, 508);
        Punto a = new Punto(14, 4);

        p.despPunto(a);

    }
}
