package FigurasGeometricas;

public class Triangulo {

    private double base;
    private double  altura;

    public Triangulo(double baseTriangulo, double alturaTriangulo) {
        this.base = (int) baseTriangulo;
        this.altura = (int) alturaTriangulo;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public int perimetro() {
        return (int) (base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }

    public String calcularArea() {
        return null;
    }
    
}
