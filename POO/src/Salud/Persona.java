package Salud;

import java.util.Scanner;

public class Persona {
    
    //Creamos atrinutos 

    String tipoDoc;
    int documento;
    String Nombre;
    String Apellido;
    int peso;
    int estatura;
    int edad;
    String sexo;

    //Creamos los metodos 

    public Persona(String nombre2, int edad2) {
    }

    public Persona() {
    }

    public void pedirDatos(){

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa tu tipo de documento ");
        tipoDoc=lectura.nextLine();

        System.out.println("Ingresa tu documento ");
        documento=lectura.nextInt();

        System.out.println("Ingresa tu nombre");
        Nombre=lectura.next();

        System.out.println("Ingresa tu apellido");
        Apellido=lectura.next();

        System.out.println("Ingresa tu peso");
        peso=lectura.nextInt();

        System.out.println("Ingresa tu estatura");
        estatura=lectura.nextInt();

        System.out.println("Ingresa tu edad");
        edad=lectura.nextInt();

        
        System.out.println("Ingresa tu sexo");
        sexo=lectura.next();
    
    }

    //Creamos metodo para mostrar

    public void mostrarPersona(){

        System.out.println("Tu tipo de documento es"+tipoDoc);
        System.out.println("Tu documento es"+documento);
        System.out.println("Tu nombre es"+Nombre);
        System.out.println("Tu apellido es"+Apellido);
        System.out.println("Tu peso es"+peso);
        System.out.println("Tu estatura es"+estatura);
        System.out.println("Tu edad es"+edad);
        System.out.println("Tu sexo es"+sexo);
    }

    //Creamos metodo para calcular el IMC

    public void calcularimc(int i, int j){
        int pesoActual = peso/(estatura)*2;

    //Creamos condional para saber tu peso ideal 

    if (pesoActual < 20){
        System.out.println("Tu peso está por debajo de lo ideal");
    }

    else if (pesoActual <=20 && pesoActual <=25){
        System.out.println("Tu peso esta en lo ideal");
    }

    else  {
        System.out.println("Estas en sobreso ");

    }

    }

     //Creamos Encapsulamiento r3

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void imprimirDatos() {
    }


   
   /*  //Creamos un metodo para calcular edad

    public void mayorEdad(){

        if (edad<18) {
            System.out.println("Eres menor de edad ");
        }
        else{
            System.out.println("Eres mayor de edad ");
        }
    }*/

    //Reto2
    /*public int calcularimc(int peso, int estatura){

        pesoActual=(peso/estatura)*2;
        
        if (pesoActual <20) {
            System.out.println("PESO BAJO");
            
         }    
            else if (pesoActual <=20 && pesoActual <=25) {
            System.out.println("PESO IDEAL ");
         }
             
            else {
                System.out.println(" SOBREPESO");
         }  

         // Creamos retorno 

         return calcularimc(peso, estatura);

    
    }  */


}
