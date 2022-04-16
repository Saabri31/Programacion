package Practicas.Proyecto2;

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

    private static final double precioMinuto = 0.5;
    private Ubicacion plano;
    List<Ticket> tickets;

    public Maquina() {
        this.plano = new Ubicacion();
        this.tickets = new ArrayList<>();
    }

    public Ubicacion getPlano() {
        return plano;
    }

    public void setPlano(Ubicacion plano) {
        this.plano = plano;
    }

    public void nuevoTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void borrarTicket(Ticket ticket) {
        this.tickets.remove(ticket);
        this.plano.sacarCoche(ticket.getId());
    }

    public boolean existeID(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean existeMatricula(String matricula) {
        for (Ticket ticket : tickets) {
            if (ticket.getMatricula() == matricula) {
                return true;
            }
        }
        return false;
    }

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
