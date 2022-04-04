/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.EjerciciosFile;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import static t8.EjerciciosFile.ArchivoDIR.dir;

/**
 *
 * @author todbolsa
 *
 * Escribe un programa que muestre recursivamente el contenido de un directorio.
 * La visualización por consola deberá ser similar al que aparece al ejecutar el
 * comando tree
 *
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Elige un directorio");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.setMultiSelectionEnabled(true);

        int resp = jfc.showOpenDialog(null);

        File carpeta = null;
        if (resp == JFileChooser.APPROVE_OPTION) {
            if (jfc.getSelectedFile().isDirectory()) {
                carpeta = jfc.getSelectedFile();
                tree(carpeta);
            }
        }

    }

    public static void tree(File f) {
        File[] archivos = f.listFiles();

        String arbol = "|-";
        
        for (File file : archivos) {
            if (file.isFile()) {
                System.out.println(arbol + file.getName());
            } else if (file.isDirectory()) {
                arbol += arbol;
                System.out.println(file.getName() + arbol);
                tree(file);
                
            }
        }

    }

}
