/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7.hoteles;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macarena
 */
public class AppHoteles {

    public static Set<Hotel> hoteles = new HashSet<>();

    public static void crearHoteles() {
        try {
            hoteles.add(new Hotel("PLAYA", 100));
            hoteles.add(new Hotel("MONTAÑA", 120));
            hoteles.add(new Hotel("RURAL", 100));
            hoteles.add(new Hotel("PLAYA", 90));
            hoteles.add(new Hotel("PLAYA", 135));
            hoteles.add(new Hotel("PLAYA", 150));
            hoteles.add(new Hotel("PLAYA", 75));
            hoteles.add(new Hotel("RURAL", 85));
            hoteles.add(new Hotel("RURAL", 110));
            hoteles.add(new Hotel("RURAL", 50));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Set<Hotel> buscarHoteles(String zona){
        Set<Hotel> hotelesPorPrecio=new TreeSet<>();
        
        Iterator<Hotel> it=hoteles.iterator();
        while(it.hasNext()){
            Hotel  hotel=it.next();
            if(hotel.getZona()==Zonas.valueOf(zona)){
                hotelesPorPrecio.add(hotel);
            }
        }
        
        return hotelesPorPrecio;
    }
    
    public static void mostrarHoteles_1(){
        System.out.println(hoteles);
    }
    
    public static void mostrarHoteles_2(){
        for(Hotel hotel:hoteles){
            System.out.println(hotel);
        }
    }
    
    //!!!!
    public static void mostrarHoteles_3(){
        for (int i = 0; i < hoteles.size(); i++) {
            System.out.println(hoteles.toArray()[i]);            
        }
    }
    
     public static void mostrarHoteles_4(){
        Iterator<Hotel> it=hoteles.iterator();
        while(it.hasNext()){
            System.out.println(it.next());            
        }
    }
    
    public static void main(String[] args) {

        crearHoteles();
        Set<Hotel> busqueda=buscarHoteles("PLAYA");
        System.out.println(busqueda);

    }

}
