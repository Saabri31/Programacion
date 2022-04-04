/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Biblioteca;

import java.time.LocalDate;

/**
 *
 * @author todbolsa
 */
public class Digital extends Libro {

    protected String licencia;

    public Digital(String licencia, String titulo, String autor, String editorial, LocalDate publicacion) {
        super(titulo, autor, editorial, publicacion);
        this.licencia = licencia;
    }
}
