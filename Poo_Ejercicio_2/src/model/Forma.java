package model;

public abstract class Forma {

    private String Color;


    public Forma(){
    }

    public Forma(String Color){
    this.Color = Color;
    }

    // Getter para el atributo color
    public String getColor() {
        return Color;
    }

    // Setter para el atributo color
    public void setColor(String Color) {
        this.Color = Color;
    }

    public abstract double calcularArea();

}
