package lab3progra2_carlosnoé;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Lab3Progra2_CarlosNoé {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Bandera = true;
        JColorChooser colorChooser = new JColorChooser();
        ArrayList<Pokemon> Equipo = new ArrayList();
        ArrayList<Pokeball> Balls = new ArrayList();
        Random random = new Random();
        while (Bandera != false) {

            System.out.println("----MENU PRINCIPAL---- \n"
                    + "1. CREAR POKEMON \n"
                    + "2. CREAR POKEBOLA \n"
                    + "3. LISTAR POKEMON \n"
                    + "4. ELIMNAR POKEMON \n"
                    + "5. CAPTURAR POKEMON \n"
                    + "6. MODIFICAR POKEMON \n"
                    + "7. SALIDA");
            int elec = sc.nextInt();

            if ((elec > 0) && (elec < 8)) {
                switch (elec) {
                    case 1:
                        sc = new Scanner(System.in);
                        Scanner ints = new Scanner(System.in);
                        boolean Menu1 = true;
                        while (Menu1 != false) {
                            System.out.println("----Menu Creado----\n"
                                    + "1. CREAR TIPO FUEGO \n"
                                    + "2. CREAR TIPO AGUA \n"
                                    + "3. CREAR TIPO PLANTA \n"
                                    + "4. VOLVER AL MENU PRINCIPAL");
                            int elec1 = sc.nextInt();
                            switch (elec1) {
                                case 1:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre");
                                    String nombre = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese su naturaleza");
                                    String Naturaleza = sc.nextLine();
                                    System.out.println("Ingrese su numero de entrada a la pokedex");
                                    int Pokenum = ints.nextInt();
                                    System.out.println("Ingrese la potencia de su llamarada");
                                    int Poten = ints.nextInt();

                                    boolean one = VerrNaturaleza(Naturaleza);
                                    boolean Zero = NumeroMayora0(Pokenum);
                                    Zero = NumeroMayora0(Poten);

                                    if ((one = false) || (Zero = false)) {
                                        System.out.println("Creacion invalida");
                                    } else {
                                        FireType Novo = new FireType(Poten, nombre, Pokenum, Naturaleza, false);
                                        Equipo.add(Novo);
                                        System.out.println("List");
                                    }

                                    Menu1 = false;
                                    break;
                                case 2:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre");
                                    String nombre1 = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese su naturaleza");
                                    String Naturaleza1 = sc.nextLine();
                                    System.out.println("Ingrese su numero de entrada a la pokedex");
                                    int Pokenum1 = ints.nextInt();
                                    System.out.println("Ingrese un numero que represente la rapidez al nadar");
                                    int Aqua = ints.nextInt();
                                    System.out.println("Ingrese si(1) puede o no(2) estar fuera del agua");
                                    int boolfuera = ints.nextInt();

                                    boolean Fuera = false;
                                    boolean one1 = VerrNaturaleza(Naturaleza1);
                                    boolean Zero1 = NumeroMayora0(Pokenum1);
                                    Zero1 = NumeroMayora0(Aqua);
                                    switch (boolfuera) {
                                        case 1:
                                            Fuera = true;
                                            break;
                                        case 2:
                                            Fuera = false;
                                            break;
                                        default:
                                            System.out.println("Valor invalido");
                                            Zero1 = false;
                                    }

                                    if ((one1 = false) || (Zero1 = false)) {
                                        System.out.println("Creacion invalida");
                                    } else {
                                        WaterType wata = new WaterType(Fuera, Aqua, nombre1, Pokenum1, Naturaleza1, false);
                                        Equipo.add(wata);
                                        System.out.println("List");
                                    }

                                    Menu1 = false;
                                    break;

                                case 3:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre");
                                    String nombre2 = sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese su naturaleza");
                                    String Naturaleza2 = sc.nextLine();
                                    System.out.println("Ingrese el habitat");
                                    sc = new Scanner(System.in);
                                    String Habitat = sc.nextLine();
                                    System.out.println("Ingrese su numero de entrada a la pokedex");
                                    int Pokenum2 = ints.nextInt();
                                    System.out.println("Ingrese el dominio sobre las plantas (Numero)");
                                    int DOM = ints.nextInt();

                                    boolean one2 = VerrNaturaleza(Naturaleza2);
                                    boolean Zero2 = NumeroMayora0(Pokenum2);
                                    Zero2 = Numero0a100(DOM);

                                    if ((one2 = false) || (Zero2 = false)) {
                                        System.out.println("Creacion invalida");
                                    } else {
                                        GrassType plante = new GrassType(Habitat, DOM, nombre2, Pokenum2, Naturaleza2, false);
                                        Equipo.add(plante);
                                        System.out.println("List");
                                    }

                                    Menu1 = false;
                                    break;
                                case 4:

                                    Menu1 = false;
                                    break;
                                default:
                                    System.out.println("Numero mal ingresado");
                            }
                        }
                        break;

                    case 2:
                        sc = new Scanner(System.in);
                        Scanner ints2 = new Scanner(System.in);
                        int resultado = JOptionPane.showConfirmDialog(null, colorChooser, "Selecciona un color para la pokebola", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        Color color = colorChooser.getColor();
                        System.out.println("Ingrese su numero de serie");
                        int Serie = ints2.nextInt();
                        ints2 = new Scanner(System.in);
                        System.out.println("Ingrese su eficiencia del 1 al 3");
                        int Efect = ints2.nextInt();
                        boolean marck = Numero1a3(Efect);

                        if (marck = false) {
                            System.out.println("Valor invalido");
                        } else {
                            Pokeball Pocket = new Pokeball(color, Serie, Efect);
                            System.out.println("List");
                        }

                        break;

                    case 3:
                        System.out.println("Tipos Fuego");
                        for (int i = 0; i < Equipo.size(); i++) {
                            if (Equipo.get(i) instanceof FireType) {
                                System.out.println(i + ". " + Equipo.get(i).toString());
                            }
                        }
                        System.out.println("Tipos Agua");

                        for (int i = 0; i < Equipo.size(); i++) {
                            if (Equipo.get(i) instanceof WaterType) {
                                System.out.println(i + ". " + Equipo.get(i).toString());
                            }
                        }
                        System.out.println("Tipos Planta");
                        for (int i = 0; i < Equipo.size(); i++) {
                            if (Equipo.get(i) instanceof GrassType) {
                                System.out.println(i + ". " + Equipo.get(i).toString());
                            }
                        }
                        break;

                    case 4:
                        sc = new Scanner(System.in);
                        Scanner ints1 = new Scanner(System.in);
                        boolean Menu2 = true;

                        while (Menu2 != false) {
                            System.out.println("----Menu Creado----\n"
                                    + "1. ELIMINAR TIPO FUEGO \n"
                                    + "2. ELIMINAR TIPO AGUA \n"
                                    + "3. ELIMINAR TIPO PLANTA \n"
                                    + "4. VOLVER AL MENU PRINCIPAL");
                            int elec1 = sc.nextInt();
                            switch (elec1) {
                                case 1:
                                    for (int i = 0; i < Equipo.size(); i++) {
                                        if (Equipo.get(i) instanceof FireType) {
                                            System.out.println(i + ". " + Equipo.get(i).toString());
                                        }
                                    }
                                    System.out.println("Ingrese el numero del pokemon que quiere eliminar");
                                    int DeletPok = ints1.nextInt();
                                    if (Equipo.get(DeletPok) instanceof FireType) {
                                        Equipo.remove(DeletPok);
                                        System.out.println("Se ha eliminado correctamente");
                                    } else {
                                        System.out.println("Pokemon no valido");
                                    }

                                    Menu2 = false;
                                    break;
                                case 2:
                                    for (int i = 0; i < Equipo.size(); i++) {
                                        if (Equipo.get(i) instanceof WaterType) {
                                            System.out.println(i + ". " + Equipo.get(i).toString());
                                        }
                                    }
                                    System.out.println("Ingrese el numero del pokemon que quiere eliminar");
                                    int DeletPok1 = ints1.nextInt();
                                    if (Equipo.get(DeletPok1) instanceof WaterType) {
                                        Equipo.remove(DeletPok1);
                                        System.out.println("Se ha eliminado correctamente");
                                    } else {
                                        System.out.println("Pokemon no valido");
                                    }
                                    Menu2 = false;
                                    break;

                                case 3:
                                    for (int i = 0; i < Equipo.size(); i++) {
                                        if (Equipo.get(i) instanceof GrassType) {
                                            System.out.println(i + ". " + Equipo.get(i).toString());
                                        }
                                    }
                                    System.out.println("Ingrese el numero del pokemon que quiere eliminar");
                                    int DeletPok2 = ints1.nextInt();
                                    if (Equipo.get(DeletPok2) instanceof GrassType) {
                                        Equipo.remove(DeletPok2);
                                        System.out.println("Se ha eliminado correctamente");
                                    } else {
                                        System.out.println("Pokemon no valido");
                                    }
                                    Menu2 = false;
                                    break;
                                case 4:

                                    Menu2 = false;
                                    break;
                                default:
                                    System.out.println("Numero mal ingresado");
                            }
                        }
                        break;

                    case 5:
                        Scanner ints3 = new Scanner(System.in);
                        for (int i = 0; i < Balls.size(); i++) {
                            System.out.println(i + " " + Balls.get(i).toString());
                        }
                        int elec2 = ints3.nextInt();
                        boolean Verificador = DentroDelArrayList(Balls, elec2);
                        if (Verificador = false) {
                            System.out.println("Mal Ingresado");
                        } else {
                            Pokeball sub = Balls.get(elec2);
                            int RANDOM = random.nextInt(Equipo.size()) + 0;
                            Pokemon Menos = Equipo.get(RANDOM);
                            if (Menos.isAtrapat() == false) {
                                System.out.println("EL POKEMON -" + Menos.getNombre() + "- HA APARECIDO");
                                System.out.println("Ingrese huir(1) o Capturar(0)");
                                int Safe = ints3.nextInt();
                                switch (Safe) {
                                    case 1:
                                        System.out.println("Ha huido con cobardia y acertividad");
                                        break;
                                    case 2:
                                        if (sub.getEficiencia() == 1) {
                                            int Ran2 = random.nextInt(3) + 1;
                                            if (sub.getEficiencia() == Ran2) {
                                                Balls.remove(elec2);
                                                Equipo.get(RANDOM).setPokebola(sub);
                                            } else {
                                                Balls.remove(elec2);
                                                System.out.println("El Pokemon ha escapado");
                                            }
                                        } else if ((sub.getEficiencia() == 1) || (sub.getEficiencia() == 2)) {
                                            int Ran2 = random.nextInt(3) + 1;
                                            if (sub.getEficiencia() == Ran2) {
                                                Balls.remove(elec2);
                                                Equipo.get(RANDOM).setPokebola(sub);
                                            } else {
                                                Balls.remove(elec2);
                                                System.out.println("El Pokemon ha escapado");
                                            }
                                        } else {
                                            Balls.remove(elec2);
                                            Equipo.get(RANDOM).setPokebola(sub);
                                        }

                                        break;

                                    default:
                                        System.out.println("Numero invalido");
                                }

                            } else {
                                System.out.println("Ha desaparecido");
                            }

                        }

                        break;

                    case 6:
                        break;

                    case 7:
                        Bandera = false;
                        break;
                }
            } else {
                System.out.println("Numero Invalido");
            }
        }
    }

    //Validaciones
    public static boolean VerrNaturaleza(String Naturaleza) {
        if (Naturaleza.equalsIgnoreCase("Timido")) {
            return true;
        } else if (Naturaleza.equalsIgnoreCase("Energetico")) {
            return true;
        } else if (Naturaleza.equalsIgnoreCase("Misterioso")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Numero0a100(int numero) {
        if (numero > 0 && numero < 101) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean NumeroMayora0(int numero) {
        if (numero > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean Numero1a3(int numero) {
        switch (numero) {
            case 1:
                return true;
            case 2:
                return true;

            case 3:
                return true;
            default:
                return false;
        }

    }

    public static boolean DentroDelArrayList(ArrayList<Pokeball> asan, int num) {
        if ((num < 0) || (num > asan.size())) {
            return false;
        } else {
            return true;
        }
    }
}
