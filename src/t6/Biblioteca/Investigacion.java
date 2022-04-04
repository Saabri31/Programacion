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
public class Investigacion extends Revista{
    
    protected int codigo;
    
    public Investigacion(int codigo, int volumen, int numero, LocalDate mes, String titulo, String autor, String editorial, LocalDate publicacion) {
        super(volumen, numero, mes, titulo, autor, editorial, publicacion);
        this.codigo = codigo;
    }

    public Investigacion(int codigo, int volumen, int numero, Month mes, String titulo, String autor, String editorial, LocalDate publicacion) {
        super(volumen, numero, mes, titulo, autor, editorial, publicacion);
        this.codigo = codigo;
    }
    
}
