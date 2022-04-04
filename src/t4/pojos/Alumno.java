/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4.pojos;

/**
 *
 * @author todbolsa
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private String matricula;
    private int edad;
    /**
     * Constructor de la clase
     */
    public Alumno() {
    }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * 
     * @param apellidos Apellidos del alumno
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return matricula
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * 
     * @param matricula Matricula del alumno
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad Edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", matricula=" + matricula + ", edad=" + edad + '}';
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        Alumno al = new Alumno(); //Creamos un objeto
        al.setNombre("Sabrina");
        al.setApellidos("Toderean");
        al.setMatricula("7027");
        al.setEdad(18);    
        System.out.println("Alumno:" + al.toString());
    } 
}
