package view;

import controller.Ejecutor;
import java.util.Scanner;

public class Menu {
    
    Ejecutor ejecutor = new Ejecutor();
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        int opcion;

        System.out.println("-----------Funciones ---------------------");
        System.out.println("1. Calcular Area de un Circulo ");
        opcion = sc.nextInt();
        System.out.println("2. Calcular Area de un Rectangulo ");
        opcion = sc.nextInt();
        System.out.println("3. Calcular Area de un Cuadrado");
        opcion = sc.nextInt();
        System.out.println("4. Calcular Area de un triangulo");
        opcion = sc.nextInt();

    switch(opcion){
        case 1:
            ejecutor.AreaCirculo();

            break;

        case 2:
            ejecutor.AreaRectangulo();

            break;

        case 3:
            ejecutor.areaCuadrado();

            break;

        case 4:
            ejecutor.areaTriangulo();
            break;

    }

}


}

