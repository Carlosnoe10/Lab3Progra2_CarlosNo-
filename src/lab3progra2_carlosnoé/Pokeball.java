package lab3progra2_carlosnoé;

import java.awt.Color;

public class Pokeball {
    public Color color;
    public int NumeroSerie;
    public int Eficiencia;

    public Pokeball() {
    }

    
    
    public Pokeball(Color color, int NumeroSerie, int Eficiencia) {
        this.color = color;
        this.NumeroSerie = NumeroSerie;
        this.Eficiencia = Eficiencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(int NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public int getEficiencia() {
        return Eficiencia;
    }

    public void setEficiencia(int Eficiencia) {
        this.Eficiencia = Eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "color=" + color + ", NumeroSerie=" + NumeroSerie + ", Eficiencia=" + Eficiencia + '}';
    }
    
    
    
}
