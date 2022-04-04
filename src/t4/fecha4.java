/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class fecha4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la fecha (<dia> de <mes> de <año>");
        String fecha = sc.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        sdf.setLenient(false);
        
//        Date fechaDate = sdf.parse(fecha);
        
//        sdf.applyPattern("dd/MM/yyyy");
//        System.out.println("Tu fecha en formato dia/mes/año: " + sdf.format(fechaDate));
        
        }
    }
