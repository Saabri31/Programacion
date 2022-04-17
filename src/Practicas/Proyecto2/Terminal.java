package Practicas.Proyecto2;

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

    public static Scanner sc = new Scanner(System.in);

    private Maquina maquina;

    public Terminal(Maquina maquina) {
        this.maquina = maquina;
        interfaz();
    }

    public static void interfaz() {
        int opcion = 0;
        System.out.println("PARKING BLUE-ZONE");
        System.out.println("1. Estacionar vehiculo");
        System.out.println("2. Sacar vehiculo");
        System.out.print("Pulse boton: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                estacionarVehiculo();
                break;
            case 2:
                Ubicacion.sacarCoche(opcion);
        }
    }

    public static void estacionarVehiculo() {

        String matricula = "";
        System.out.println("Verificando matricula...");
        System.out.println();
        matricula = sc.nextLine();
//        do {
//            System.out.println("Verificando matricula...");
//            matricula = sc.nextLine();
//            if (!Funciones.validarMatricula(matricula) || !Funciones.mismaMatricula(ticket, matricula)) {
//                System.out.println("Matricula invalida");
//            }
//        } while (!Funciones.validarMatricula(matricula) && !Funciones.mismaMatricula(ticket, matricula));
    }

    public static void main(String[] args) {

        String matricula = "";
        int idParking = 0;
        String dinero = "";
        int opcion = 0;
        Ubicacion ubi = new Ubicacion();
        Ticket ticket = new Ticket("1234-ABC", ubi);

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
                    ubi.getPlano();
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
                    ticket.toString();
                    ubi.getPlano();

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
