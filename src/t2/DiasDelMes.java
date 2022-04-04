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
public class DiasDelMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes = teclado.nextInt();
        String dias = (mes == 2) ? "28 días" :
                      (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) ? "31 días" :
                      (mes==4 || mes==6 || mes==9 || mes==11) ? "30 días" :
                      "Esto no es un mes.";
        System.out.println(dias);
    }
}
