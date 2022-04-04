/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8.EjerciciosFile;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author todbolsa
 */
public class a {
    
    private static JFrame mostrar;
    private static final Random rnd = new Random();
    public static void main(String[] args) {
        mostrar = new JFrame("Color");
        mostrar.setSize(150, 150);
        mostrar.setLocationRelativeTo(null);
        mostrar.setVisible(true);
        mostrar.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setColor();
            }
            
        });
    }
    
    private static void setColor() {
        final Color c= new Color(rnd.nextInt(254)+1,rnd.nextInt(254)+1,rnd.nextInt(254)+1);
        mostrar.getContentPane().setBackground(c);
        mostrar.setTitle("Color " + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue());
    }
}
