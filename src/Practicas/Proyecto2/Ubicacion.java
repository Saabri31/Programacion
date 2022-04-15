package Practicas.Proyecto2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Ubicacion {

    private final int[][] plano = new int[3][20];

    public Ubicacion() {
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                plano[i][j] = 0;
            }
        }
    }

    public void getPlano() {
        for (int i = 0; i < this.plano.length; i++) {
            for (int j = 0; j < this.plano[0].length; j++) {
                System.out.print(plano[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getPiso(int[][] sitio, int id) {

        int fila = 0;

        for (int i = 0; i < sitio.length; i++) {
            for (int j = 0; j < sitio[0].length; j++) {
                if (sitio[i][j] == id) {
                    fila = i;
                }
            }
        }
        return fila;
    }

    public static int getPlaza(int[][] sitio, int id) {

        int columna = 0;

        for (int i = 0; i < sitio.length; i++) {
            for (int j = 0; j < sitio[0].length; j++) {
                if (sitio[i][j] == id) {
                    columna = j;
                }
            }
        }
        return columna;
    }
}
