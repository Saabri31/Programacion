/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5.EjercicioPunto;

import java.awt.Toolkit;

/**
 *
 * @author todbolsa
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        if (x > Toolkit.getDefaultToolkit().getScreenSize().width || x < 0)
            throw new RuntimeException("Fuera del plano x-y");
        this.x = x;
    }

    public void setY(double y) {
        if (y > Toolkit.getDefaultToolkit().getScreenSize().height || y < 0)
            throw new RuntimeException("Fuera del plano x-y");
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "x" + ", " + y + "y" + ')';
    }

    public void despPunto(double despX, double despY) {
        setX(this.x += despX);
        setY(this.y += despY);
    }

    public void despPunto(Punto punto) {
        setX(this.x += punto.x);
        setY(this.y += punto.y);
    }

    public void posPunto(double posX, double posY) {
        setX(this.x += posX);
        setY(this.y += posY);
    }

    public Double distanciaPuntos(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public void centroPunto() {
        this.x = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
        this.y = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
    }

}
