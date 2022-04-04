/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author todbolsa
 */
public class FormateoNumeros {

    public static void main(String[] args) {

        double cantidad = 1234999.4567;

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);

        System.out.println(nf.format(cantidad));

        NumberFormat nfMoneda = NumberFormat.getCurrencyInstance();
        System.out.println(nfMoneda.format(cantidad));

        NumberFormat nfEntero = NumberFormat.getIntegerInstance();
        System.out.println(nfEntero.format(cantidad));

        NumberFormat nfPorcentaje = NumberFormat.getPercentInstance();
        nfPorcentaje.setMaximumFractionDigits(1);
        System.out.println(nfPorcentaje.format(cantidad));

        NumberFormat nfMonedaUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nfMonedaUS.format(cantidad));

        Locale fUS = new Locale("en", "us", "Traditional_NEW");
    }
}
