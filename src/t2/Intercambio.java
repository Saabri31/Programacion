/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

/**
 *
 * @author todbolsa
 */
public class Intercambio {
    public static void main(String[] args) {
        int num = 2;
        int num2 = 4;
        int temp;
        System.out.println("Antes: " + num + " " + num2);
        temp = num;
        num = num2;
        num2 = temp;
        System.out.println("Después: " + num + " " + num2);
        }
}
