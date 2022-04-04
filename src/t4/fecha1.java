/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class fecha1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia = 0;
        int mes = 0;
        int year = 0;
        
        do{
            System.out.println("Itroduce tu dia de nacimiento");
            dia = sc.nextInt();
            
            if(dia<1 || dia>31) System.out.println("Ese día no es valido");
            
        }while(dia<1 || dia>31);
        
        do{
            System.out.println("Introduce tu mes de nacimiento ");
            mes = sc.nextInt();
            mes = mes-1;
            
            if(mes<0 || mes>12) System.out.println("Ese mes no es valido");
            
        }while(mes<0 || mes>12);
        
        
        do{
            System.out.println("Introduce tu año de nacimiento ");
            year = sc.nextInt();
            
            if(year<1920 || year>2021) System.out.println("Ese año no es valido");
            
        }while(year<1920 || year>2021);
        
        GregorianCalendar cal = new GregorianCalendar(year,mes,dia);
        
        SimpleDateFormat corto = new SimpleDateFormat("EEEE dd/MM/yy");
        System.out.println("Formato corto: " + corto.format(cal.getTime()));
        
        SimpleDateFormat largo = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        System.out.println("Formato corto: " + largo.format(cal.getTime()));
    }
}
