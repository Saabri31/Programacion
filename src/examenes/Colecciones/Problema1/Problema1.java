/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenes.Colecciones.Problema1;

/**
 *
 * @author todbolsa
 */
public class Problema1 {

    //Metodo para rellenar el tablero con los caracteres necesarios
    public static void rellenarTablero(Character[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (esPar(i)) {
                    if (esPar(j)) {
                        tablero[i][j] = 'B';
                    } else {
                        tablero[i][j] = 'N';
                    }
                } else {
                    if (esPar(j)) {
                        tablero[i][j] = 'N';
                    } else {
                        tablero[i][j] = 'B';
                    }
                }
            }
        }
    }

    //Metodo para mostrar los valores
    public static void mostrarTablero(Character[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metodo para saber si el numero es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        Character[][] tablero = new Character[8][8];
        rellenarTablero(tablero);
        mostrarTablero(tablero);

    }
}
