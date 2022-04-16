package Practicas.Proyecto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Cambio {

    public static Scanner sc = new Scanner(System.in);

    public static List<Ticket> ticket = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        Ubicacion ubicacion = new Ubicacion();
        Ticket ticket1 = new Ticket("aaa", ubicacion);

        int opcion = 0;

        do {
            Thread.sleep(100);
            interfaz();
            opcion = sc.nextInt();

        } while (opcion != 1 && opcion != 2);
        switch (opcion) {
            case 1:
                System.out.println("Estacionar");
                estacionarVehiculo(ubicacion);

                break;
            case 2:
                System.out.println("Sacar");
//                sacarVehiculo();
                break;
            default:
                System.err.println("Opcion desconocida");
        }

    }

    public static void interfaz() {
        System.out.println("PARKING BLUE-ZONE");
        System.out.println("1. Estacionar vehiculo");
        System.out.println("2. Sacar vehiculo");
        System.out.print("Pulse boton: ");
    }

    public static void estacionarVehiculo(Ubicacion ubicacion) {

        Ticket ticket1 = new Ticket("aaa", ubicacion);

        String matricula = "";

        ubicacion.getPlano();

        System.out.println("Verificando matricula...");
        System.out.println();
        matricula = sc.nextLine();
        do {
            System.out.println("Verificando matricula...");
            matricula = sc.nextLine();
            if (!Funciones.validarMatricula(matricula) || !Funciones.mismaMatricula(ticket, matricula)) {
                System.out.println("Matricula invalida");
            }
        } while (!Funciones.validarMatricula(matricula) && !Funciones.mismaMatricula(ticket, matricula));

    }

    public static void sacarVehiculo() {

    }

}
