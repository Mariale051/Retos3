package FigurasGeometricas;

 import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opciones = 0;

        
        while (opciones != 4) {
            System.out.println("Elige la figura geometrica la cual deseas cualcular el area  o si deceas terminar la ejecucion \n1. Triangulo \n2.Rectangulo \n3. Circulo  \n4.Terminar");
    
            opciones = lectura.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Digita la base del triangulo");
                    double baseTriangulo = lectura.nextDouble();

                    System.out.println("Digita la altura del triangulo");
                    double alturaTriangulo = lectura.nextDouble();

                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("El area del triangulo es  " + triangulo.calcularArea());
                    break;
                case 2:

                    System.out.println("Digitala base del rectangulo");
                    double baseRectangulo = lectura.nextDouble();

                    System.out.println("Digita la altura de rectangulo");
                    double alturaRectangulo = lectura.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("El área del rectángulo es " + rectangulo.calcularArea());
                    break;

                case 3:

                    System.out.println("Digita el radio del círculo:");
                    double radioCirculo = lectura.nextDouble();

                    Circulo circulo = new Circulo(radioCirculo);
                    System.out.println("El área del círculo es: " + circulo.calcularArea());
                    break;
                }

            }

        }
    
}
