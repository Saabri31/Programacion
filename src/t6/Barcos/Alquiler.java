/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Barcos;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author todbolsa
 */
public class Alquiler {

    protected String nombre;
    protected String dni;
    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal;
    protected boolean amarre;
    protected Barco barco;

    public Alquiler(String nombre, String dni, LocalDate fechaFinal, boolean amarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicial = LocalDate.now();
        this.fechaFinal = fechaFinal;
        this.amarre = amarre;
        this.barco = barco;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isAmarre() {
        return amarre;
    }

    public void setAmarre(boolean amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double alquiler() {
        double dias = Duration.between(fechaInicial, fechaFinal).toDays();
        return barco.moduloFuncion() * dias;
    }

}
