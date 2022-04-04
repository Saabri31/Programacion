/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.Edificio;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import t5.Personas.PersonaException;

/**
 *
 * @author todbolsa
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fecha;
    private int edad;
    private double altura;
    private double peso;
    private boolean casado;

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public char getSexo() {
        return this.sexo;
    }

    public LocalDate getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return LocalDate.parse(this.fecha.format(dtf), dtf);
    }

    public int getEdad() {
        return this.edad;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean getCasado() {
        return this.casado;
    }

    public void setDni(String dni) throws Exception {
        if(dni.length() < 9) throw new java.lang.Exception("Error de DNI");
        this.dni = dni;
    }
    
    public void setNombre(String nombre) throws PersonaException {
        if(nombre == null || nombre.isEmpty()) throw new PersonaException("Error. Nombre obligatorio");
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) throws PersonaException{
        if(apellidos == null || apellidos.isEmpty()) throw new PersonaException("Error. Apellido obligatorio");
        this.apellidos = apellidos;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDate(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int calcularEdad() {

        LocalDate hoy = LocalDate.now();
        return Period.between(fecha, hoy).getYears();
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String letraDNI(String dni) {

        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numDNI = Integer.valueOf(dni);
        int resto = numDNI % 23;

        char letra = letrasDNI.charAt(resto);

        return dni + letra;
    }

    public int pesoIdeal(double peso, double altura) {
        double pesoIdeal = (0.75 * altura - 150 + 50);
        if (pesoIdeal > peso)
            return -1;
        else if (pesoIdeal == peso)
            return 0;
        else
            return 1;
    }

    public boolean mayorEdad(int edad) {
        if (edad < 18)
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        return "Persona2{" + "dni=" + dni + ", nombre=" + nombre
                + ", apellidos=" + apellidos + ", sexo=" + sexo
                + ", fecha=" + fecha + ", edad=" + edad + ", altura="
                + altura + ", peso=" + peso + ", casado=" + casado + '}';
    }

    @Override
    public boolean equals(Object otro) {
        if (otro instanceof Persona)
            return this.dni.equals(((Persona) otro).dni);
        else
            return false;

    }

}
