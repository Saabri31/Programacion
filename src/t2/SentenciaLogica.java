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
public class SentenciaLogica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        String resultado = (num<0) ? "Negativo" :
                           (num<100) ? "Positivo menor que 100" :
                            "Mayor o igual que 100";
        System.out.println(resultado);
    }
}
