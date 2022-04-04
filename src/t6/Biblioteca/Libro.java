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
public class Libro {

    protected String titulo;
    protected String autor;
    protected String editorial;
    protected LocalDate publicacion;

    public Libro(String titulo, String autor, String editorial, LocalDate publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.publicacion = publicacion;
    }

}
