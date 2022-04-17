package Practicas.Proyecto2;

import static Practicas.Proyecto2.Funciones.contieneSimbolos;
import static Practicas.Proyecto2.Funciones.sonDigitos;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Maquina {

    //Precio por minuto que cuesta aparcar el vehiculo
    private static final double precioMinuto = 0.5;
    //Inicializacion del plano
    private Ubicacion plano;
    //Creacion de lista de tickets
    private static List<Ticket> tickets;

    /*
    Constructor de la clase Maquina, donde se crea el plano como nueva ubicacion
    y los tickets como una ArrayList
     */
    public Maquina() {
        this.plano = new Ubicacion();
        this.tickets = new ArrayList<>();
    }

    //Devuelve el plano
    public Ubicacion getPlano() {
        return plano;
    }

    //Agrega un ticket a la lista
    public void nuevoTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    //Busca si existe el ticket por id y lo devuelve
    public Ticket getTicket(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    //Borra el ticket de la lista y saca el vehiculo del aparcamiento
    public void borrarTicket(Ticket ticket) {
        this.tickets.remove(ticket);
        this.plano.sacarCoche(ticket.getId());
    }

    //Comprueba que exista la id
    public boolean existeID(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return true;
            }
        }
        return false;
    }

    //Valida la matricula para el formato (0000-XXX)
    public static boolean validarMatricula(String matricula) {

        if (matricula.contains("-")) {
            String[] array = matricula.split("-");

            String numeros = array[0];
            String letras = array[1];

            if (numeros.length() != 4 || !sonDigitos(numeros)) {
                return false;
            }
            if (letras.length() != 3 || sonDigitos(letras) || contieneSimbolos(letras)) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }

    //Comprueba que otro coche no tenga la misma matricula
    public static boolean existeMatricula(String matricula) {
        for (Ticket ticket : tickets) {
            if (ticket.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    //Precio que hay que pagar por haber estacionado el vehiculo
    public static double aPagar(Ticket ticket) {
        double segundos = ChronoUnit.SECONDS.between(ticket.getFechaHora(), LocalDateTime.now());
        double minutos = 0;
        if (segundos > 60) {
            minutos = segundos / 60;
        }
        if (segundos % 60 > 0) {
            minutos += 1;
        }
        return precioMinuto * Funciones.formatearMinutos(minutos);
    }

}
