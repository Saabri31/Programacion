/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class Pascua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año = teclado.nextInt();
        int A = año%19;
        int B = año%4;
        int C = año%7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E;
        String fecha = (N <= 31) ? (N + " de Marzo") :
                       ( (N-31) + " de Abril");
        System.out.println(fecha); 
    }
}
