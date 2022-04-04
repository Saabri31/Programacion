/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos.EjercicioDIR;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author todbolsa
 */
public class Opciones {

    public static void menu() {
        System.out.println("Introduce la opcion");
        System.out.println("1 - dir");
        System.out.println("2 - og");
        System.out.println("3 - on");
        System.out.println("4 - ogn ");
        System.out.println("5 - s");
        System.out.println("6 - b");
        System.out.println();
    }

    public static void opcion(int opcion, File carpeta) {
        switch (opcion) {
            case 1:
                dir(carpeta);
                break;
            case 2:
                og(carpeta);
                break;
            case 3:
                on(carpeta);
                break;
            case 4:
                ogn(carpeta);
                break;
            case 5:
                s(carpeta);
                break;
            case 6:
                b(carpeta);
                break;
            default:
                System.out.println("Opcion no contemplada");
                break;
        }
    }

    //Formatear fecha
    public static String sdf(File f) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(f.lastModified());
    }

    //Simulacion comando DIR
    public static void dir(File carpeta) {
        File[] archivos = carpeta.listFiles();
        int contadorFile = 0;
        int contadorDir = 0;
        float bytes = 0f;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File f : archivos) {
            if (f.isFile()) {
                System.out.println(sdf(f) + "          "
                        + f.length() + "        " + f.getName());
                contadorFile++;
                bytes += f.length();
            } else if (f.isDirectory()) {
                System.out.println(sdf(f) + "          <DIR>       " + f.getName());
                contadorDir++;
            }
        }
        System.out.println("Directorios totales: " + contadorDir);
        System.out.println("Ficheros totales " + contadorFile);
        System.out.println("Bytes totales " + bytes);
    }

    //Mostrar directorios primero
    public static void og(File carpeta) {
        File[] archivos = carpeta.listFiles();
        int contadorFile = 0;
        int contadorDir = 0;
        float bytes = 0f;
        List<File> files = new ArrayList<File>();
        List<File> directorios = new ArrayList<File>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File f : archivos) {
            if (f.isFile()) {
                files.add(f);
                contadorFile++;
                bytes += f.length();
            } else if (f.isDirectory()) {
                directorios.add(f);
                contadorDir++;
            }
        }
        for (File dir : directorios) {
            System.out.println(sdf(dir) + "          <DIR>       " + dir.getName());

        }
        for (File file : files) {
            System.out.println(sdf(file) + "          "
                    + file.length() + "        " + file.getName());

        }
        System.out.println("Directorios totales: " + contadorDir);
        System.out.println("Ficheros totales " + contadorFile);
        System.out.println("Bytes totales " + bytes);
    }

    //Listado por orden alfabetico
    public static void on(File carpeta) {
        File[] archivos = carpeta.listFiles();
        Arrays.sort(archivos);
        int contadorFile = 0;
        int contadorDir = 0;
        float bytes = 0f;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File f : archivos) {
            if (f.isFile()) {
                System.out.println(sdf(f) + "          "
                        + f.length() + "        " + f.getName());
                contadorFile++;
                bytes += f.length();
            } else if (f.isDirectory()) {
                System.out.println(sdf(f) + "          <DIR>       " + f.getName());
                contadorDir++;
            }
        }
        System.out.println("Directorios totales: " + contadorDir);
        System.out.println("Ficheros totales " + contadorFile);
        System.out.println("Bytes totales " + bytes);
    }

    //Mostrar primero directorios y orden alfabetico
    public static void ogn(File carpeta) {
        File[] archivos = carpeta.listFiles();
        Arrays.sort(archivos);
        int contadorFile = 0;
        int contadorDir = 0;
        float bytes = 0f;
        List<File> files = new ArrayList<File>();
        List<File> directorios = new ArrayList<File>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File f : archivos) {
            if (f.isFile()) {
                files.add(f);
                contadorFile++;
                bytes += f.length();
            } else if (f.isDirectory()) {
                directorios.add(f);
                contadorDir++;
            }
        }
        for (File dir : directorios) {
            System.out.println(sdf(dir) + "          <DIR>       " + dir.getName());

        }
        for (File file : files) {
            System.out.println(sdf(file) + "          "
                    + file.length() + "        " + file.getName());

        }
        System.out.println("Directorios totales: " + contadorDir);
        System.out.println("Ficheros totales " + contadorFile);
        System.out.println("Bytes totales " + bytes);

    }

    //Muestra subdirectorios
    public static void s(File carpeta) {
        File[] archivos = carpeta.listFiles();

        String arbol = "|-";

        for (File file : archivos) {
            if (file.isFile()) {
                System.out.println(arbol + file.getName());
            } else if (file.isDirectory()) {
                System.out.println(file.getName() + "|----------");
                s(file);

            }
        }
    }

    //Muestra los archivos sin fecha y size
    public static void b(File carpeta) {
        File[] archivos = carpeta.listFiles();
        int contadorFile = 0;
        int contadorDir = 0;
        float bytes = 0f;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File f : archivos) {
            if (f.isFile()) {
                System.out.println("        " + f.getName());
                contadorFile++;
                bytes += f.length();
            } else if (f.isDirectory()) {
                System.out.println("<DIR>   " + f.getName());
                contadorDir++;
            }
        }
        System.out.println("Directorios totales: " + contadorDir);
        System.out.println("Ficheros totales " + contadorFile);
        System.out.println("Bytes totales " + bytes);
    }
}
