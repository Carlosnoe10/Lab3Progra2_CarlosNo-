package lab3progra2_carlosnoé;

public class Pokemon {
    public String Nombre;
    public int NumPokeDex;
    public String Naturaleza;
    public boolean Atrapat =false;
    public Pokeball Pokebola=null;

    public Pokemon() {
    }

    
    public Pokemon(String Nombre, int NumPokeDex, String Naturaleza, boolean Atrapat) {
        this.Nombre = Nombre;
        this.NumPokeDex = NumPokeDex;
        this.Naturaleza = Naturaleza;
        this.Atrapat = Atrapat;
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
        return "Nombre= " + Nombre + "\n"
                + "NumPokeDex= " + NumPokeDex + "\n"
                + "Naturaleza= " + Naturaleza + "\n"
                + "Atrapat= " + Atrapat + "\n"
                + "Pokebola= " + Pokebola;
    }
    
    
}
