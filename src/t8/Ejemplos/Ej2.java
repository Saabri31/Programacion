/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author todbolsa
 */
public class Ej2 {
    public static void main(String[] args) throws IOException {
        
        File[]unidades=File.listRoots();
        for(File unidad:unidades){
            System.out.println(unidad.toString());
        }
        
        File temporal = File.createTempFile("prueba", "temp");
        temporal.deleteOnExit();
        
        if(temporal.exists()){
            System.out.println(temporal.getAbsolutePath());
        }
        
    }
}
