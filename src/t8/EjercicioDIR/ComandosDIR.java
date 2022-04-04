/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.EjercicioDIR;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Sabri
 *
 * Realiza un programa Java que liste el contenido de una carpeta simulando el
 * comando DIR de MS-DOS. Además del funcionamiento por defecto del comando, se
 * permitirá su ejecución con las siguientes opciones:
 *
 * /OG -> muestra primero los directorios /ON -> hace el listado por orden
 * alfabético /OGN -> combinación de los dos anteriores /S -> muestra también
 * los subdirectorios /B -> podemos usar el /B, para que no salgan ni la fecha
 * ni el tamaño La selección de la carpeta se hará a través de un JFileChooser.
 * Y las opciones se podrán introducir a través de un JFrame, a través de un
 * caja de texto o una lista desplegable.
 *
 */
public class ComandosDIR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Elige");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int resp = jfc.showOpenDialog(null);

        File carpeta = null;

        int opcion = 0;

        if (resp == JFileChooser.APPROVE_OPTION) {
            carpeta = jfc.getSelectedFile();
            Opciones.menu();
            opcion = sc.nextInt();
            Opciones.opcion(opcion, carpeta);

        }
    }
}
