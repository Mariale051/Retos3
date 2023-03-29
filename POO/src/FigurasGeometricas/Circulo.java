package FigurasGeometricas;

public class Circulo {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public String calcularArea() {
        return null;
    }

}
