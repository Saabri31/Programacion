/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author todbolsa
 */
public class fechas {
    public static void main(String[] args) {
        
       
//        GregorianCalendar fecha1 = new GregorianCalendar(2021, 5, 15);
//        System.out.println(fecha1.get(Calendar.YEAR));
//        System.out.println(fecha1.get(Calendar.DAY_OF_MONTH));
//        System.out.println(fecha1.get(Calendar.DAY_OF_YEAR));
//        
//        fecha1.set(Calendar.MONTH, Calendar.AUGUST);
//        System.out.println(fecha1.get(Calendar.MONTH));
//        
//        Date d = fecha1.getTime();
//        System.out.println(d);
//        
//        Date hoy = new Date();
//        fecha1.setTime(hoy);
//        System.out.println(fecha1.get(Calendar.MONTH));
//        
//        Date fecha3 = new Date(Long.MAX_VALUE);
//        System.out.println(fecha3);
//        
        DateFormat df1 = DateFormat.getTimeInstance();
        System.out.println(df1.format(new Date()));
        
        GregorianCalendar cal = new GregorianCalendar(2003,7,31);
        
        SimpleDateFormat sdf = new SimpleDateFormat("'Nací el' EEEE dd:MMM:yyyy hh:mm");
        
        //dia semana, dia mes, mes(abreviado), año(4 digitos) hora:minutos
        System.out.println(sdf.format(cal.getTime()));
        
    }
}
