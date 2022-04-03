package Proyecto2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Terminal {

    public static void interfaz() {
        System.out.println("PARKING BLUE-ZONE");
        System.out.println("1. Estacionar vehiculo");
        System.out.println("2. Sacar vehiculo");
        System.out.print("Pulse boton: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String matricula = "";
        int idParking = 0;
        String dinero = "";
        int opcion = 0;

        do {
            do {
                interfaz();
                opcion = sc.nextInt();
                if (opcion != 1 && opcion != 2) {
                    System.out.println("Opcion desconocida");
                }
            } while (opcion != 1 && opcion != 2);

            switch (opcion) {
                case 1:
                    System.out.println("Estacionar");
//                ubicacion.getPlano();
                    do {
                        System.out.println("Verificando matricula...");
                        matricula = sc.nextLine();
                        if (!Funciones.validarMatricula(matricula)) {
                            System.out.println("Matricula invalida");
                        } else {
                            System.out.println("Matricula repetida");
                        }
                    } while (!Funciones.validarMatricula(matricula));

                    System.out.println("Generando ticket...");
//                  ticket.toString
//                  ubicacion.getPlano();

                    break;
                case 2:
                    System.out.println("Introduzca ticket (id):");
                    idParking = sc.nextInt();
                    System.out.println("Total a pagar ");//Metodo pagar
                    System.out.println("Introduzca dinero (0.05, 0.1, 0,2, 0,5, 1, 2, 5, 10, 20):");
                    dinero = sc.next();
                    System.out.println("Vuelta: ");//Metodo vuelta
                    System.out.println("Buen viaje!!");
//              ubicacion.getPlano();
                    System.out.println("...");
                    break;
                default:
                    System.err.println("Opcion desconocida");
            }
        } while (opcion == 0);

    }
}
