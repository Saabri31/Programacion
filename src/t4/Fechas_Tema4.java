/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author todbolsa
 */
public class Fechas_Tema4 {
    public static void main(String[] args) {
            
        LocalDate navidad = LocalDate.of(2021, Month.DECEMBER, 25);
        LocalDate nocheBuena = LocalDate.of(2021, 12, 24);
        
        Long dias = new Date().getTime()/1000/60/60/24;
        System.out.println(dias);
        LocalDate fecha1 = LocalDate.ofEpochDay(dias);
        System.out.println(fecha1);
        
        LocalDate fecha2 = LocalDate.ofYearDay(2021, 256);
        System.out.println(fecha2);
        
        LocalTime hora1 = LocalTime.of(12, 25);
        
        System.out.println(navidad.plusDays(10));
        System.out.println(navidad);
        
        System.out.println(navidad.minusDays(5));
        
        System.out.println(navidad.isAfter(nocheBuena));
        System.out.println(fecha1.compareTo(navidad));
        
        Set zonas = ZoneId.getAvailableZoneIds();
        for(Object zona: zonas){
            System.out.println(zona.toString());
        }
        ZoneId zonaAsia = ZoneId.of("Asia/Hebron");
        
        ZonedDateTime horaAsia = ZonedDateTime.now(zonaAsia);
        System.out.println(zonaAsia);
    }
}
/**
 * lose. ni entiendo ni veo
 * me causa problemas de vision esta clase
 * tengo frio en  las  manos
 */