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
public class Minutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int seg = 0;
        int segfin = 0;
        int num = 0;
        seg = teclado.nextInt();
        num = seg/60;
        segfin = seg%60;
        System.out.println(num + "m " + segfin + "s.");
    }
}
