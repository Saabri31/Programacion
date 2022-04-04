/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class fecha2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fecha (dd/mm/aaaa): ");
        String fechaInicial = sc.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        
        GregorianCalendar dateInicial = new GregorianCalendar();
        GregorianCalendar dateHoy = new GregorianCalendar();
        
//        if(dateHoy.before(dateInicial)){
//            System.out.println("La fecha inicial debe ser anterior a la de hoy.");
//        }else{
//            long miliseg = dateHoy.getTime() - dateInicial.getTime();
//            long dias = miliseg / 1000 / 60 / 60 / 24;
//            System.out.println("Dias transcurridos desde el " + sdf.format(dateInicial) + 
//                    " hasta hoy: " + dias);
//        }
    }
}
