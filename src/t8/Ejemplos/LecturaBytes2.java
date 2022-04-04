/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author todbolsa
 */
public class LecturaBytes2 {
    public static void main(String[] args) throws IOException {
        
        File file = new File(" ");
        
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
            
//            bis.rea
            
        }catch(FileNotFoundException ex){
            
        }
        
    }
}
