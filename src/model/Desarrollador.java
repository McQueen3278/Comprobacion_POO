package model;

public class Desarrollador extends Empleado {
    private String lProgramador;

    public Desarrollador() {

    }

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lProgramador = lenguajeProgramacion;
    }

    // Getters y Setters
    public String getLenguajeProgramacion() {
        return lProgramador;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lProgramador = lenguajeProgramacion;
    }

    @Override
    public void trabajar() {
        System.out.println("Desarrollador trabajando en el proyecto.");
    }

    // Sobrecarga del método trabajar
    public void trabajar(String proyecto) {
        System.out.println("Desarrollador trabajando en el proyecto: " + proyecto);
    }
}
