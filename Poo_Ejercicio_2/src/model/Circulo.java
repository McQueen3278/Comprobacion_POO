package model;

public class Circulo extends Forma{
    private double radio;

    public void Circulo(){

    }

    public Circulo(String Color,double radio) {
        super(Color);
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }


}
