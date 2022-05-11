/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.AutomovilesEntornos;

/**
 *
 * @author todbolsa
 */
public class Automovil {

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private double deposito;
    private boolean arrancado;
    private int velocidad;
    private int velocidadMax;
    private double capacidadDepo;
    private int capacidadPers;
    private int personas;

    public Automovil(String matricula, int capacidadPers, int velocidadMax, double capacidadDepo) {

        this.matricula = matricula;
        this.capacidadPers = capacidadPers;
        this.velocidadMax = velocidadMax;
        this.capacidadDepo = capacidadDepo;

    }
}
