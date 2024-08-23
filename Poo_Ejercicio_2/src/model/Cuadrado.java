package model;

public class Cuadrado extends Forma{
    private double lado;

    public Cuadrado(){
        
    }

    public Cuadrado(String color, double lado) {
    super(color);
    this.lado = lado;
}

   @Override
public double calcularArea() {
    return lado * lado; 
}


}
