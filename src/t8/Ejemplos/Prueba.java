/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author todbolsa
 */
public class Prueba {
    
    public static void main(String[] args) {
        final File file = new File("D:\\a\\nose.txt");
        if (!file.canWrite())
            return;
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 10000; i++)
                writer.append("Me quiero mimir");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
