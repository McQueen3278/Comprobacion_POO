import java.util.Scanner;
class Computadora extends Dispositivo {
    Scanner sc = new Scanner(System.in);
  
    private String sistemaOperativo;


    public Computadora(String marca, String modelo, int anio, String sistemaOperativo) {
        super(marca, modelo, anio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo la computadora...");
        
    }


    public void encender(String clave) {
        System.out.println("Ingrese la clave: ");
        clave = sc.nextLine();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }


    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}

