class Telefono extends Dispositivo {
    private String tipo;

    // Constructor
    public Telefono(String marca, String modelo, int anio, String tipo) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }

    // Implementación del método abstracto
    @Override
    public void encender() {
        System.out.println("Encendiendo el teléfono...");
    }

    // Sobrecarga del método encender
    public void encender(String codigo) {
        System.out.println("Encendiendo el teléfono con código de desbloqueo: " + codigo);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

