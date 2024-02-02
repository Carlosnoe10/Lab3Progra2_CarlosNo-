package lab3progra2_carlosnoé;

public class WaterType extends Pokemon{
    public boolean VivirAgua;
    public int Rapid;

    public WaterType(boolean VivirAgua, int Rapid) {
        this.VivirAgua = VivirAgua;
        this.Rapid = Rapid;
    }

    public WaterType(boolean VivirAgua, int Rapid, String Nombre, int NumPokeDex, String Naturaleza, boolean Atrapat) {
        super(Nombre, NumPokeDex, Naturaleza, Atrapat);
        this.VivirAgua = VivirAgua;
        this.Rapid = Rapid;
    }

    public boolean isVivirAgua() {
        return VivirAgua;
    }

    public void setVivirAgua(boolean VivirAgua) {
        this.VivirAgua = VivirAgua;
    }

    public int getRapid() {
        return Rapid;
    }

    public void setRapid(int Rapid) {
        this.Rapid = Rapid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumPokeDex() {
        return NumPokeDex;
    }

    public void setNumPokeDex(int NumPokeDex) {
        this.NumPokeDex = NumPokeDex;
    }

    public String getNaturaleza() {
        return Naturaleza;
    }

    public void setNaturaleza(String Naturaleza) {
        this.Naturaleza = Naturaleza;
    }

    public boolean isAtrapat() {
        return Atrapat;
    }

    public void setAtrapat(boolean Atrapat) {
        this.Atrapat = Atrapat;
    }

    public Pokeball getPokebola() {
        return Pokebola;
    }

    public void setPokebola(Pokeball Pokebola) {
        this.Pokebola = Pokebola;
    }

    @Override
    public String toString() {
        return "WaterType{" + "VivirAgua=" + VivirAgua + ", Rapid=" + Rapid + '}';
    }
    
    
}
