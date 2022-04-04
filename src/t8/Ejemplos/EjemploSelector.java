/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author todbolsa
 */
public class EjemploSelector {
    public static void main(String[] args) {
        
        JFileChooser jfc = new JFileChooser();
        int resp = jfc.showOpenDialog(jfc);
        
        if(resp==JFileChooser.APPROVE_OPTION){
            File file = jfc.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }
        
    }
}
