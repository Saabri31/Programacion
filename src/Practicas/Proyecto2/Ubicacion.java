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

    //Plano del parking
    private static final int[][] plano = new int[3][20];

    /*
    Constructor de la clase Ubicacion, donde se rellenan todas 
    las posiciones con el numero 0
     */
    public Ubicacion() {
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                plano[i][j] = 0;
            }
        }
    }

    //Obtiene la vista del plano
    public void getPlano() {
        for (int i = 0; i < this.plano.length; i++) {
            for (int j = 0; j < this.plano[0].length; j++) {
                System.out.print(plano[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Obtiene la fila del plano
    public static int getPiso(int id) {

        int fila = 0;

        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                if (plano[i][j] == id) {
                    fila = i;
                }
            }
        }
        return fila;
    }

    //Obtiene la columna del plano
    public static int getPlaza(int id) {

        int columna = 0;

        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                if (plano[i][j] == id) {
                    columna = j;
                }
            }
        }
        return columna;
    }

    //Coloca el coche en la primera posicion libre
    public static void colocarCoche(Ticket ticket) {
        parar:
        {
            for (int i = 0; i < plano.length; i++) {
                for (int j = 0; j < plano[0].length; j++) {
                    if (plano[i][j] == 0) {
                        plano[i][j] = ticket.getId();
                        break parar;
                    }
                }
            }
        }
    }

    //Obtiene la disponibilidad del parking
    public static boolean parkingLleno() {
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                if (plano[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Obtiene si no hay coches aparcados
    public static boolean parkingVacio() {
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                if (plano[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Permite sacar el vehiculo del parking
    public static void sacarCoche(int id) {
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                if (plano[i][j] == id) {
                    plano[i][j] = 0;
                }
            }
        }
    }

    //Permite comprobar si el ticket existe en el parking
    public static boolean ticketExiste(int id) {
        for (int i = 0; i < plano.length; i++) {
            for (int j = 0; j < plano[0].length; j++) {
                if (plano[i][j] == id) {
                    return true;
                }
            }
        }
        return false;
    }

}
