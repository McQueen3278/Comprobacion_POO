package model;

public class Triangulo extends Forma{
    private double base;
    private double altura;

    public Triangulo(){

    }

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public double calcularArea() {
        return 0.5 * base * altura; 
    }

}
