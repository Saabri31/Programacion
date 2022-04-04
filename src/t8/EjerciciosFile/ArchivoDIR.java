package t8.EjerciciosFile;

import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class ArchivoDIR {

    public static void main(String[] args) {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "/Documents/UD8");
        jfc.setDialogTitle("Elije el directorio");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        File carpeta = null; //referencia al directorio
        int resp = jfc.showOpenDialog(null);
        if (resp == JFileChooser.APPROVE_OPTION) {
            if (jfc.getSelectedFile().isDirectory()) {
                carpeta = jfc.getSelectedFile();
                dir(carpeta);
            }
        }

    }

    public static void dir(File f) {
        // obtenemos la lista de elementos que contiene
        File[] dir = f.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm"); // formateador de fechas
        NumberFormat nf=NumberFormat.getNumberInstance();

        int contDirectorios = 0;
        int contFicheros = 0;
        long tamFichero = 0;
        long tamTotal = 0;
        for (File obj : dir) {
            // Tipo: directorio o archivo
            String tipo = "";
            if (obj.isDirectory()) {
                contDirectorios++;
                tipo = "<DIR>";

            } else if (obj.isFile()) {
                contFicheros++;
                tipo = "     ";
                tamFichero = obj.length(); // Tamaño fichero                    
                tamTotal += tamFichero;
            }
            // Fecha-hora de acceso o ultima modificacion
            String fecha = sdf.format(new Date(obj.lastModified()));
            // Nombre
            String nombre = obj.getName();
            /* Imprimimos las columnas formateadas con printf (se indican los foramtos y luego los valores)
                 * %s: para cadenas
                 * %d: para enteros con la , para separador de miles y el 10 para ancho de 10 así quedan las cantidades alineadas
                 * %n: salto de línea
             */
            String tamanio = (obj.isFile() ? nf.format(tamFichero) : "");
            System.out.printf("%s %s %10s %s %n", fecha, tipo, tamanio, nombre);
        }
        System.out.printf("%d archivos %,d byes %n", contFicheros, tamTotal);
        long libre = f.getFreeSpace();
        System.out.printf("%d dirs %,d bytes libres  %n", contDirectorios, libre);

    }
}
