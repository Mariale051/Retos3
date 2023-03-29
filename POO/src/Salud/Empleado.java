package Salud;

public class Empleado extends Persona {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    
    // Constructor de la subclase Empleado
    public Empleado(String nombre, int edad, String cargo, double valorHora, int horasTrabajadas, String departamento) {
        super(nombre, edad);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    
    // Getter para el atributo cargo
    public String getCargo() {
        return cargo;
    }
    
    // Setter para el atributo cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    // Getter para el atributo valorHora
    public double getValorHora() {
        return valorHora;
    }
    
    // Setter para el atributo valorHora
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    // Getter para el atributo horasTrabajadas
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    // Setter para el atributo horasTrabajadas
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    // Getter para el atributo departamento
    public String getDepartamento() {
        return departamento;
    }
    
    // Setter para el atributo departamento
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Método para calcular el salario del empleado
    public double calcularSalario() {
        return valorHora * horasTrabajadas;
    }
    
    // Método público para imprimir los datos del empleado
    public void imprimirDatosEmpleado() {
        super.imprimirDatos();
        System.out.println("Cargo: " + cargo);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + calcularSalario());
    }

    public void calcularHonorarios() {
        double valor_total = valorHora * horasTrabajadas;
        double reteica = valor_total * 0.00966; // RETEICA del 0.966%
        double valor_a_pagar = valor_total - reteica;

        

       
    }
}

