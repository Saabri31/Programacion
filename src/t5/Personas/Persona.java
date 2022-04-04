/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.Personas;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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

    Persona(String string, String pepe, String gomez) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getDni(){
        return this.dni;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public char getSexo(){
        return this.sexo;
    }

    public LocalDate getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return LocalDate.parse(this.fecha.format(dtf), dtf);
    }

    public int getEdad(){
        return this.edad;
    }

    public double getAltura(){
        return this.altura; 
    }

    public double getPeso(){
        return this.peso;
    }

    public boolean getCasado(){
        return this.casado;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public void setDate(LocalDate fecha){
        this.fecha = fecha;
    }

    private int calcularEdad(){

        LocalDate hoy = LocalDate.now();
        return Period.between(fecha, hoy).getYears();
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setCasado(boolean casado){
        this.casado = casado;
    }

    public String letraDNI(String dni){

        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numDNI = Integer.valueOf(dni);
        int resto = numDNI % 23;

        char letra = letrasDNI.charAt(resto);

        return dni+letra;
    }

    public int pesoIdeal(double peso, double altura){
        double pesoIdeal = (0.75*altura-150+50);
        if(pesoIdeal>peso) return -1;
        else if(pesoIdeal==peso) return 0;
        else return 1;
    }

    public boolean mayorEdad(int edad){
        if(edad<18) return false;
        else return true;
    }

    @Override
    public String toString() {
        return "Persona2{" + "dni=" + dni + ", nombre=" + nombre + 
                ", apellidos=" + apellidos + ", sexo=" + sexo + 
                ", fecha=" + fecha + ", edad=" + edad + ", altura=" + 
                altura + ", peso=" + peso + ", casado=" + casado + '}';
    }

}
