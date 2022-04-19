/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas.Proyecto2;

/**
 *
 * @author Sabri
 */
public class AppParking {

    public static Maquina maquina;
    public static Terminal terminal;

    public static void main(String[] args) {
        maquina = new Maquina();
        terminal = new Terminal(maquina);
    }
}
