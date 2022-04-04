/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author todbolsa
 */
public class TablaAscii {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 128) {
            System.out.println(num + ":" + (char) num);
             num++;
        }
    }
}
