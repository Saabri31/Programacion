/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.EjerciciosFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import t8.Ejemplos.Ej1;

/**
 *
 * @author todbolsa
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        JFileChooser jfc = new JFileChooser();
        
        String ruta = "";
        
        System.out.println("Introduce una ruta ");
        ruta = sc.nextLine();
        
        File file = new File(ruta);
        
        if (file.isDirectory()) {
            System.out.println("Es un directorio con el siguiente contenido");
            try {
                Files.walk(file.toPath(), FileVisitOption.FOLLOW_LINKS).forEach(System.out::println);
            } catch (IOException ex) {
                Logger.getLogger(Ej1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (file.exists()) {
            System.out.println("Es un fichero de tamaño " + file.length()
                    + " bytes");
        } else {
            file.getParentFile().mkdirs();
            if (file.getName().contains("."))
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Ej1.class.getName()).log(Level.SEVERE, null, ex);
            } else
                file.mkdir();
        }
        
        
        
        
    }
}
