/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class PorcentajeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int sb;
        int nt;
        int a;
        int s;
        int np;
        sb = teclado.nextInt(); 
        nt = teclado.nextInt(); 
        a = teclado.nextInt(); 
        s = teclado.nextInt(); 
        np = teclado.nextInt(); 
        int total;
        total = sb+nt+a+s+np;
        System.out.println("SB = " + sb + "(" + "%)" );
        System.out.println("N = " + nt + "()" );
        System.out.println("A = " + a + "()" );
        System.out.println("S = " + s + "()" );
        System.out.println("NP = " + np + "()" );
        System.out.println("Total = " + total + " (100%)" );
        System.out.println("Total presentados = " + total + " ()" );
        System.out.println("Total aprobados = " + total + " ()" );
        System.out.println("Total suspensos = " + total + " ()" );
        System.out.println("Total no presentados= " + total + " ()" );
    }
}
