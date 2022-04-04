/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author todbolsa
 */
public class EjemploSelector2 {
    public static void main(String[] args) {
        
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("A");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int resp = jfc.showOpenDialog(null);
        if(resp==JFileChooser.APPROVE_OPTION){
            System.out.println("Has elegido el directorio " + jfc.getSelectedFile());
        }
        
    }
}
