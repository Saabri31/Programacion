/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author todbolsa
 */
public class ProgramaHolaAdios {
    public static void main(String[] args) {
        //programa que muestre alternativamente los mensajes "Hola" "Adios" usando banderas. 
        
        boolean seguir = true;
        int cont = 0; 
        boolean sw = false;
        while(seguir){
            sw = !sw;
            if (sw) {
                System.out.println("Hola");
            } else
                System.out.println("Adios");
            
            cont++;
            if(cont==100){
                seguir=false;
            }
        }
    }
}
