package PPT;

public interface Juego {

    String[] opciones = {"piedra", "papel", "tijera"};
    int humano = 0;
    int maquina = 0;

    public default void PiedraPapelTijera() {
        System.out.println("Hola jugaremos piedra pepel o tigera ");
    }

    public default int gethumano() {
        return humano;
    }

    public default int getmaquina() {
        return maquina;
    }

    
}
