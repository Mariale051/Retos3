package PPT;

 import java.util.Scanner;
public class PiedraPapelTijera {

    
    private String[] opciones;
    private int humano;
    private int maquina;

    public void iniciar() {
        System.out.println("Hola iniciemos el juego ");
    }

    public void jugar() {
        Scanner lectura  = new Scanner(System.in);

        System.out.println("Elige una opción \n1. piedra, \n2.papel o \n3.tijera");
        String humano = lectura.next();
       
        String maquina = opciones[(int) (Math.random() * opciones.length)];
        System.out.println("se a elegido " + maquina);

        if (humano.equals(maquina)) {
            System.out.println("Hemos enpatado");

        } else if (humano.equals("piedra") && maquina.equals("tijera")

                || humano.equals("papel") && maquina.equals("piedra")
                || humano.equals("tijera") && maquina.equals("papel")) {
            System.out.println("Que bien has ganado");
            
       

        } else {
            System.out.println("Que mal has perdido");
            maquina();;
            
        }
    }

    private void maquina() {
    }


    public void finalizar() {
        System.out.println("Terminaremos el juego");
      
        if (humano > maquina) {
            System.out.println("Que bien has ganado el juego");
        } else if (humano < maquina) {
            System.out.println("Que mal has perdido el juego");
        } else {
            System.out.println("El juego terminara por empate ");
        }
    }

    public static void main(String[] args) {
        PiedraPapelTijera juego = new PiedraPapelTijera();
        juego.iniciar();
        for (int j = 0; j < 3; j++) {
            juego.jugar();
        }
        juego.finalizar();
    }
    
}

