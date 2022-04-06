/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author todbolsa
 */
public class EscrituraTexto {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("./ficheros/frases.txt"))){
            
            String frase = "No me haces ni caso";
            do{
                System.out.println("");
//                frase = teclado.readLine();
                
            }while(!frase.isEmpty());
            bw.write(frase);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
