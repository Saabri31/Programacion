/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author todbolsa
 */
public class LecturaTexto {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showDialog(null, "Aceptar");

        try (BufferedReader reader = new BufferedReader(new FileReader(chooser.getSelectedFile()))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
