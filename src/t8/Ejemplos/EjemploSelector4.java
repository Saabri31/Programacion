/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author todbolsa
 */
public class EjemploSelector4 {

    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Ejemplo de filtro de imagen");
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Ficheros de imagen", "png", "gif", "jpg");
        jfc.addChoosableFileFilter(filtro);
        jfc.setAcceptAllFileFilterUsed(true);

        int resp = jfc.showDialog(null, "Selecciona imagen");

        if (resp == JFileChooser.APPROVE_OPTION) {
            System.out.println("Has elegido la imagen " + jfc.getSelectedFile().getAbsolutePath());

        }   
    }
}
