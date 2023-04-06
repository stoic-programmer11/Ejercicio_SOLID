package clases;

public class Empleado {
    String nombre;
    int edad;
    double salario;
    String cargo;

    public Empleado(String nombre, int edad, double salario, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }


    public double calcular(Empleado empleado) {
        return empleado.getSalario() * 0.13;
    }
}
