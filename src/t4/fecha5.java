/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author todbolsa
 */
public class fecha5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la fecha de factura(dd/mm/aaaa): ");
        String fechaFactura = sc.next();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        
        System.out.println("Término de pago: ");
        String pago = sc.next();
        
        if(pago.equalsIgnoreCase("7D")){
        System.out.println("Tu metodo de pago es 7D");
        }else if (pago.equalsIgnoreCase("14D")){
        System.out.println("Tu metodo de pago es 14D");
        }else if(pago.equalsIgnoreCase("21D")){
        System.out.println("Tu metodo de pago es 21D");
        }else if(pago.equalsIgnoreCase("2x45")){
        System.out.println("Tu metodo de pago es 2x45");
        }else if(pago.equalsIgnoreCase("3x30")){
        System.out.println("Tu metodo de pago es 3x30");
        }else System.out.println("No existe ese metodo de pago");
        
        System.out.println("Importe factura: ");
        int importe = sc.nextInt();
        
        
        
    }
}
