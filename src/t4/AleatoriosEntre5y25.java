/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.util.Random;

/**
 *
 * @author todbolsa
 */
public class AleatoriosEntre5y25 {
    public static void main(String[] args) {
        Random rnd = new Random(48);
        
        int contador = 0;
        int repeticiones = 0;
        int numActual = 0;
        int repsActual = 0;
                
        for(int i=0; i<100; i++){
            int num = rnd.nextInt(21)+5;
            System.out.print(" - " + num + "  ");
            
        if(num==numActual){
            repsActual++;
        }else{
            numActual = num;
            repsActual=1;
        }
        if(repsActual >= repeticiones){
            contador = num;
            repeticiones = repsActual;
        }
            System.out.println("Contador = " + repsActual);
        }
        System.out.println("El ultimo numero mas repetido es " + contador + ".");
        
    }
}
