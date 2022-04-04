/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.pojos;

/**
 *
 * @author todbolsa
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    /*
    Constructor de la clase
    */
    public Persona() {   
    }
    /*
    Metodo que devuelve el nombre
    @param
    */
    public String getNombre() {
        return nombre;
    }
    /*
    Metodo
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
    @param
    */
    public String getApellidos() {
        return apellidos;
    }
    /*
    @param
    */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /*
    @param
    */
    public int getEdad() {
        return edad;
    }
    /*
    @param
    */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*
    @param
    */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    /*
    Main metodo principal
    @param args
    */
    public static void main(String[] args){
        Persona p = new Persona();
        p.setNombre("Sabrina");
        p.setApellidos("Toderean");
        p.setEdad(18);    
        System.out.println("Persona:" + p.toString());
    } 
}
