/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author todbolsa
 */
public class calcularsuma {
    public static void main(String[] args) {
        int sump = 0;
        int sumi = 0;
        int num = 0;
        boolean seguir = true;
        while (seguir) {
            num++;
            if (num % 2 == 0) {
                sump = sump + num;
            } else {
                sumi = sumi + num;
            }
            if (num > 100) {
                seguir = false;
            }
        }
        System.out.println("Suma pares " + sump);
        System.out.println("Suma impares " + sumi);
    }
}
