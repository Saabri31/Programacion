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
public final class Terminal {

    public static Scanner sc = new Scanner(System.in);

    private final Maquina maquina;

    /*
    Constructor de la clase Terminal que inicializa la maquina y tambien
    la interfaz, para que funcione el programa
     */
    public Terminal(Maquina maquina) {
        this.maquina = maquina;
        interfaz();
    }

    //Menu donde vienen las posibles opciones a elegir
    public static void menu() {
        System.out.println();
        System.out.println("PARKING BLUE-ZONE");
        System.out.println("1. Estacionar vehiculo");
        System.out.println("2. Sacar vehiculo");
        System.out.print("Pulse boton: ");
    }

    //Interfaz de eleccion
    public void interfaz() {
        String opcion = "";
        do {
            menu();
            opcion = sc.nextLine();
            if (!verificarOpcion(opcion)) {
                System.err.println("Opcion no contemplada");
            }
        } while (!verificarOpcion(opcion));
        switch (opcion) {
            case "1":
                estacionarVehiculo();
                break;
            case "2":
                sacarVehiculo();
        }
    }

    //Verifica que la opcion sea valida
    public static boolean verificarOpcion(String opcion) {
        return "1".equals(opcion) || "2".equals(opcion);
    }

    //Metodo que permite estacionar un vehiculo
    public void estacionarVehiculo() {
        if (Ubicacion.parkingLleno()) {
            System.err.println("Parking lleno");
        } else {
            maquina.getPlano().getPlano();
            String matricula = "";
            do {
                System.out.println("Introduce la matricula con el formato(0000-XXX)");
                System.out.println();
                matricula = sc.nextLine();
                if (!Maquina.validarMatricula(matricula)) {
                    System.err.println("Formato incorrecto");
                }
                if (Maquina.existeMatricula(matricula)) {
                    System.err.println("Esa matricula ya esta registrada");
                }
            } while (!Maquina.validarMatricula(matricula) || Maquina.existeMatricula(matricula));
            Ticket nuevoTicket = new Ticket(matricula, maquina.getPlano());
            Ubicacion.colocarCoche(nuevoTicket);
            maquina.nuevoTicket(nuevoTicket);
            System.out.println(nuevoTicket.toString());
            maquina.getPlano().getPlano();
        }
        interfaz();
    }

    //Metodo que permite sacar un vehiculo
    public void sacarVehiculo() {
        if (Ubicacion.parkingVacio()) {
            System.err.println("No hay ningun vehiculo en el parking");
        } else {
            String id = "";
            int idvalido = 0;
            do {
                System.out.println("Introduzca ticket (id)");
                id = sc.nextLine();
                System.out.println();
                if (!Funciones.sonDigitos(id)) {
                    System.err.println("Valor de ticket invalido");
                } else {
                    idvalido = Integer.parseInt(id);
                    if (!Ubicacion.ticketExiste(idvalido)) {
                        System.err.println("Ticket ilegible");
                    }
                }
            } while (!Funciones.sonDigitos(id) || !Ubicacion.ticketExiste(idvalido));
            double pagar = Maquina.aPagar(maquina.getTicket(idvalido));
            maquina.borrarTicket(maquina.getTicket(idvalido));
            maquina.getPlano().getPlano();
            System.out.println("Total a pagar: " + pagar);
            System.out.println("Introduzca dinero (0.05, 0.1, 0,2, 0,5, 1, 2, 5, 10, 20):");
            System.out.println("Vuelta: ");
            System.out.println("Buen viaje!!");
        }
        interfaz();
    }
}
