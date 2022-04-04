/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Biblioteca;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author todbolsa
 */
public class Consulta {

    protected int numDocumento;
    protected LocalDate fecha;
    protected String dni;

    public Consulta(int numDocumento, LocalDate fecha, String dni) {
        Objects.requireNonNull(fecha, "La fecha no puede ser nula");
        Objects.requireNonNull(dni , "El DNI no puede ser nula");
        this.numDocumento = numDocumento;
        this.fecha = fecha;
        this.dni = dni;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDni() {
        return dni;
    }
       
}
