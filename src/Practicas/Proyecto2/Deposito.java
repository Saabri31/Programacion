package Practicas.Proyecto2;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Sabri
 */
public class Deposito {

    private final static double cent5 = 0.05;
    private final static double cent10 = 0.1;
    private final static double cent20 = 0.2;
    private final static double cent50 = 0.5;
    private final static double euro1 = 1;
    private final static double euro2 = 2;
    private final static double billete5 = 5;
    private final static double billete10 = 10;
    private final static double billete20 = 20;

    public Deposito() {
        Map<Double, Integer> deposito = new HashMap<Double, Integer>();
        deposito.put(cent5, 100);
        deposito.put(cent10, 100);
        deposito.put(cent20, 100);
        deposito.put(cent50, 100);
        deposito.put(euro1, 100);
        deposito.put(euro2, 100);
        deposito.put(billete5, 100);
        deposito.put(billete10, 100);
        deposito.put(billete20, 100);
    }

    public double dineroIntroducido(String dinero) {
        String arrayDinero[] = dinero.split(" ");
        
        double suma = 0;
        return suma;
    }

}
