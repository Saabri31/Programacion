package t5.FigurasGeometricas;



import java.awt.Toolkit;
import java.text.NumberFormat;
import java.util.Locale;
import t5.EjercicioPunto.Punto;

public class Circulo {

    //Atributos    
    private double radio;
    private Punto centro;
    private NumberFormat nf;

    //Constructor
    public Circulo(double radio, Punto centro) {
        this.radio=radio;
        this.centro=centro;
        nf = NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
    }

    public Circulo(double radio) {
        this.radio=radio;
        this.centro=new Punto(0,0);
        nf = NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
    }
    
    //Metodo get
    public double getRadio() {
        return this.radio;
    }

    public Punto getCentro() {
        return centro;
    }
    
    public void setRadio(double radio) {
        if(radio <=0){
            throw new NullPointerException("El valor del radio no es valido");
        }
        this.radio = radio;
    }

    public void setCentro(Punto centro) {
        if (centro == null)
            throw new NullPointerException("El centro no puede ser nulo");
        this.centro = centro;
    }
    
    public void setCentro(double x, double y){
        if (x + this.radio > Toolkit.getDefaultToolkit().getScreenSize().width || x < 0)
            throw new RuntimeException("Fuera del plano x-y");
         if (y + this.radio > Toolkit.getDefaultToolkit().getScreenSize().height || y < 0)
            throw new RuntimeException("Fuera del plano x-y");
        this.centro.setX(x);
        this.centro.setY(y);
    }
    
    //Metodos de utilidad
    public double area() {
        return Double.parseDouble(nf.format(Math.PI * Math.pow(this.radio, 2)));
    }

    public double perimetro() {
        return Double.parseDouble(nf.format(2 * Math.PI * this.radio));
    }

    public void mover(Punto newPunto){
        this.centro.despPunto(newPunto.getX(), newPunto.getY());
    }
    
    public void mover(int newX, int newY){
        this.centro.despPunto(newX, newY);
    }
    
    public void desplazar(int dX, int dY){
        this.centro.despPunto(dX, dY);
    }
        
    
    @Override
    public String toString() {
        return "Circulo: " + "radio=" + radio + " centro=" + this.centro.toString();
    }

}
