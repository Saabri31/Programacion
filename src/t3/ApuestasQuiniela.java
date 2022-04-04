/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

import java.util.Random;

/**
 *
 * @author todbolsa
 */
public class ApuestasQuiniela {
    public static void main(String[] args) {
        Random rnd = new Random(); 
        for(int x=0; x<14; x++){
            System.out.print("Columna " + (x+1));
                for(int y=0; y<10; y++){
                    int val = rnd.nextInt(3);
                    String resultado = "\t";
                    switch (val){
                        case 0:
                            resultado = resultado + " 1 _ _";
                        break;
                        case 1:
                            resultado = resultado + " _ x _";
                        break;
                        case 2:
                            resultado = resultado + " _ _ 2";
                        break;
                    }
                    System.out.print(" " + resultado );
                }
                System.out.println();
        }
    }
}
