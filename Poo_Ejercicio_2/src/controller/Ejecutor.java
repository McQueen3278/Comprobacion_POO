package controller;

import model.Circulo;
import model.Rectangulo;
import model.Forma;
import model.Cuadrado;
import model.Triangulo;

public class Ejecutor {

    public void AreaCirculo(){
    Forma Circulo = new Circulo("Azul", 7 );
    System.out.println("Área del círculo: " + Circulo.calcularArea());
    }


    public void AreaRectangulo(){
        Forma Rectangulo = new Rectangulo("Morado", 6, 9);
        System.out.println("Área del rectángulo: " + Rectangulo.calcularArea());
    }

    public void areaCuadrado(){
        Forma Cuadrado = new Cuadrado("Celeste", 8);
        System.out.println("Área del cuadrado: " + Cuadrado.calcularArea());
    }

    public void areaTriangulo(){
        Forma Triangulo = new Triangulo("Celeste", 9, 8);
        System.out.println("Área del triángulo: " + Triangulo.calcularArea());

    }

}
 