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

    //Identificador del ticket
    private int id = 0;
    //matricula del coche
    private String matricula;
    //fecha de llegada del vehiculo
    private LocalDateTime fechaHora;
    //lugar de aparcamiento
    private Ubicacion ubicacion;
    //variable utilizada para la progresion de los identificadores
    public static int count;

    /*
    Constructor de la clase Ticket utilizando los parametros matricula y ubicacion
    El id va en aumento con cada ticket creado
    La fechaHora es el momento en el que se crea el ticket
     */
    public Ticket(String matricula, Ubicacion ubicacion) {
        this.id = ++count;
        this.matricula = matricula;
        this.fechaHora = LocalDateTime.now();
        this.ubicacion = ubicacion;
    }

    //Obtiene la id del ticket
    public int getId() {
        return id;
    }

    //Obtiene la matricula del vehiculo
    public String getMatricula() {
        return matricula;
    }

    //Obtiene la fechaHora a la que se aparco el vehiculo
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    //Obtiene la ubicacion del vehiculo
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    //
    @Override
    public String toString() {
        return "Ticket{" + "id = " + id + ", Matricula = " + matricula
                + ", fechaHora = " + Funciones.formatearFechaHora(fechaHora)
                + ", ubicacion: sitio " + (ubicacion.getPiso(id) + 1) + ", plaza " + (ubicacion.getPlaza(id) + 1) + '}';
    }
}
