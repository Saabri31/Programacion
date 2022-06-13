/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.Ejemplos;

import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author todbolsa
 */
public class EscrituraBytes {

    public static void main(String[] args) {

        File file = new File("./ficheros/prueba.dat");
        Random rnd = new Random();

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try {
            fos = new FileOutputStream(file, true);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);

            for (int i = 0; i <= 20; i++) {
                dos.writeDouble(10 * rnd.nextDouble());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                dos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
