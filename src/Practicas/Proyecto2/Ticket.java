package Practicas.Proyecto2;


import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Ticket {

    private int id = 0;
    private String matricula;
    private LocalDateTime fechaHora;
    private Ubicacion sitio;
    public static int count;

    public Ticket(String matricula, Ubicacion sitio) {
        this.id = ++count;
        this.matricula = matricula;
        this.fechaHora = LocalDateTime.now();
        this.sitio = sitio;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String Matricula) {
        this.matricula = Matricula;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Ubicacion getSitio() {
        return sitio;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id = " + id + ", Matricula = " + matricula
                + ", fechaHora = " + Funciones.formatearFechaHora(fechaHora)
                + ", sitio= " + sitio + '}';
    }
}
