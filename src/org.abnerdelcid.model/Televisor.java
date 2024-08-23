class Televisor extends Dispositivo {
    private int tamanoPantalla;

    
    public Televisor(String marca, String modelo, int anio, int tamanoPantalla) {
        super(marca, modelo, anio);
        this.tamanoPantalla = tamanoPantalla;
    }

 
    @Override
    public void encender() {
        System.out.println("Encendiendo el televisor...");
    }

    
    public void encender(int volumen) {
        System.out.println("Encendiendo el televisor con volumen: " + volumen);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño de Pantalla: " + tamanoPantalla + " pulgadas");
    }

  
    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
}

