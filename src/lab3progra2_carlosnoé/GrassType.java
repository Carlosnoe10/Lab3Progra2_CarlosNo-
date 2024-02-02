
package lab3progra2_carlosnoé;

public class GrassType extends Pokemon{
    public String Habitat;
    public int DominioPlantas;

    public GrassType(String Habitat, int DominioPlantas) {
        this.Habitat = Habitat;
        this.DominioPlantas = DominioPlantas;
    }

    public GrassType(String Habitat, int DominioPlantas, String Nombre, int NumPokeDex, String Naturaleza, boolean Atrapat) {
        super(Nombre, NumPokeDex, Naturaleza, Atrapat);
        this.Habitat = Habitat;
        this.DominioPlantas = DominioPlantas;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public int getDominioPlantas() {
        return DominioPlantas;
    }

    public void setDominioPlantas(int DominioPlantas) {
        this.DominioPlantas = DominioPlantas;
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
        return "GrassType{" + "Habitat=" + Habitat + ", DominioPlantas=" + DominioPlantas + '}';
    }
    
}
