package model;

public class Tester extends Empleado {
    private String tipoPruebas;

    public Tester(){

    }

    public Tester(String nombre, int edad, double salario, String tipoPruebas) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }


    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public void trabajar() {
        System.out.println("Tester chambeando en pruebas");
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println("Tester usando la herramienta " + herramienta + " en el proyecto " + proyecto);
    }
}

