/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.Edificio;

/**
 *
 * @author todbolsa
 */
public class Ascensor {

    private int piso;
    private int pisos;
    private boolean puertas;
    private boolean alarma;
    private double capacidad;
    private double ocupacion;

    public Ascensor(int pisos, double capacidad) {
        this.pisos = pisos;
        this.capacidad = capacidad;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public boolean isPuertas() {
        return puertas;
    }

    public void setPuertas(boolean puertas) {
        this.puertas = puertas;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(double ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void subir(int piso) throws InterruptedException {
        this.puertas = false;
        if(this.alarma==true)
            throw new RuntimeException("El ascensor no se puede mover");
        if (piso > this.pisos)
            throw new RuntimeException("No existe ese numero de piso");
        for (int i = getPiso(); i <= piso; i++){
            Thread.sleep(200);
            System.out.println("Piso " + i);
        }
        setPiso(piso);
        this.puertas = true;
    }

    public void bajar(int piso) throws InterruptedException {
        this.puertas = false;
        if(this.alarma==true)
            throw new RuntimeException("El ascensor no se puede mover");
        if (piso < 0)
            throw new RuntimeException("No existe ese numero de piso");
        for (int i = getPiso(); i >= piso; i--){
            Thread.sleep(100);
            System.out.println("Piso " + i);
        }
        setPiso(piso);
        this.puertas = true;
    }

    public void entrar(Persona persona) {
        if (this.ocupacion > this.capacidad){
            this.alarma=true;
            throw new RuntimeException("No se permite la entrada de mas personas");
        }
        this.ocupacion += persona.getPeso();
        if(this.ocupacion > this.capacidad)
            alarma(true);
    }
    
    public void alarma(boolean alarma){
        if(this.ocupacion > this.capacidad){
            throw new RuntimeException("Alarma activada, se ha sobrepasado el peso permitido");
        }
        alarma = false;
    }
    
    public void salir(Persona persona){
        this.ocupacion -= persona.getPeso();
        alarma(true);
    }

    public static void main(String[] args) throws InterruptedException {
        Ascensor asc = new Ascensor(20, 400);
        asc.setAlarma(false);
        asc.setPiso(20);
        asc.setOcupacion(0);
        asc.bajar(10);
    }
}
