package lab3progra2_carlosnoé;

public class FireType extends Pokemon{
   public int PotenciaLlamas;

    public FireType(String Nombre, int NumPokeDex, String Naturaleza, boolean Atrapat) {
        super(Nombre, NumPokeDex, Naturaleza, Atrapat);
    }

    public FireType(int PotenciaLlamas, String Nombre, int NumPokeDex, String Naturaleza, boolean Atrapat) {
        super(Nombre, NumPokeDex, Naturaleza, Atrapat);
        this.PotenciaLlamas = PotenciaLlamas;
    }

    public int getPotenciaLlamas() {
        return PotenciaLlamas;
    }

    public void setPotenciaLlamas(int PotenciaLlamas) {
        this.PotenciaLlamas = PotenciaLlamas;
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
        return super.toString()
                + "FireType" + "PotenciaLlamas=" + PotenciaLlamas + '}';
    }

   
    
    
    
}
