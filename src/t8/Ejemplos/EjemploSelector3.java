/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.File;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author todbolsa
 */
public class EjemploSelector3 {

    public static void main(String[] args) {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Elige");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.setMultiSelectionEnabled(true);

        int resp = jfc.showOpenDialog(null);

        if (resp == JFileChooser.APPROVE_OPTION) {
            File[] objSeleccionados = jfc.getSelectedFiles();

            int contadorFile = 0;
            int contadorDir = 0;
            float bytes = 0f;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            for (File f : objSeleccionados) {
                if (f.isDirectory()) {
                    System.out.println(sdf.format(f.lastModified()) + "          <DIR>       " + f.getName());
                    contadorDir++;
                } else if (f.isFile()) {

                    System.out.println(sdf.format(f.lastModified()) + "          "
                            + f.length() + "        " + f.getName());
                    contadorFile++;
                    bytes += f.length();
                }
            }

            System.out.println("Directorios totales: " + contadorDir);
            System.out.println("Ficheros totales " + contadorFile);
            System.out.println("Bytes totales " + bytes);
        }
    }
}
