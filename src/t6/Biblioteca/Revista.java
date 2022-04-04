/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6.Biblioteca;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author todbolsa
 */
public class Revista extends Libro {

    protected int volumen;
    protected int numero;
    protected Month mes;

    public Revista(int volumen, int numero, LocalDate mes, String titulo, String autor, String editorial, LocalDate publicacion) {
        super(titulo, autor, editorial, publicacion);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes.getMonth();
    }

    public Revista(int volumen, int numero, Month mes, String titulo, String autor, String editorial, LocalDate publicacion) {
        super(titulo, autor, editorial, publicacion);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    
    

}
