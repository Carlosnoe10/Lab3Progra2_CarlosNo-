package lab3progra2_carlosnoé;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3Progra2_CarlosNoé {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Bandera = true;
        ArrayList<Pokemon> Equipo= new ArrayList();
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
                                    String nombre= sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese su naturaleza");
                                    String Naturaleza= sc.nextLine();
                                    System.out.println("Ingrese su numero de entrada a la pokedex");
                                    int Pokenum=ints.nextInt();
                                    System.out.println("Ingrese la potencia de su llamarada");
                                    int Poten= ints.nextInt();
                                    
                                    boolean one=VerrNaturaleza(Naturaleza);
                                    boolean Zero = NumeroMayora0(Pokenum);
                                    Zero = NumeroMayora0(Poten);
                                    
                                    if ((one=false) || (Zero=false)) {
                                        System.out.println("Creacion invalida");
                                    }else{
                                        FireType Novo= new FireType(Poten, nombre, Pokenum, Naturaleza, false);
                                        Equipo.add(Novo);
                                        System.out.println("List");
                                    }
                                    
                                    Menu1=false;
                                    break;
                                case 2:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre");
                                    String nombre1= sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese su naturaleza");
                                    String Naturaleza1= sc.nextLine();
                                    System.out.println("Ingrese su numero de entrada a la pokedex");
                                    int Pokenum1=ints.nextInt();
                                    System.out.println("Ingrese un numero que represente la rapidez al nadar");
                                    int Aqua= ints.nextInt();
                                    System.out.println("Ingrese si(1) puede o no(2) estar fuera del agua");
                                    int boolfuera=ints.nextInt();
                                    
                                    boolean Fuera = false;
                                    boolean one1=VerrNaturaleza(Naturaleza1);
                                    boolean Zero1 = NumeroMayora0(Pokenum1);
                                    Zero1 = NumeroMayora0(Aqua);
                                    switch (boolfuera) {
                                        case 1:
                                            Fuera=true;
                                            break;
                                        case 2:
                                            Fuera= false;
                                            break;                                     
                                        default:
                                            System.out.println("Valor invalido");
                                            Zero1=false;
                                    } 
                                    
                                    if ((one1=false) || (Zero1=false)) {
                                        System.out.println("Creacion invalida");
                                    }else{
                                        WaterType wata= new WaterType(Fuera, Aqua, nombre1, Pokenum1, Naturaleza1, Zero1);
                                        Equipo.add(wata);
                                        System.out.println("List");
                                    }
                                    
                                    Menu1=false;
                                    break;    
    
                                case 3:
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre");
                                    String nombre2= sc.nextLine();
                                    sc = new Scanner(System.in);
                                    System.out.println("Ingrese su naturaleza");
                                    String Naturaleza2= sc.nextLine();
                                    System.out.println("Ingrese el habitat");
                                    sc = new Scanner(System.in);
                                    String Habitat= sc.nextLine();
                                    System.out.println("Ingrese su numero de entrada a la pokedex");
                                    int Pokenum2=ints.nextInt();
                                    System.out.println("Ingrese el dominio sobre las plantas (Numero)");
                                    int DOM= ints.nextInt();
                                    
                                    boolean one2=VerrNaturaleza(Naturaleza2);
                                    boolean Zero2 = NumeroMayora0(Pokenum2);
                                    Zero2 = Numero0a100(DOM);
                                    
                                    if ((one2=false) || (Zero2=false)) {
                                        System.out.println("Creacion invalida");
                                    }else{
                                        GrassType plante= GrassType();
                                        Equipo.add(Novo);
                                        System.out.println("List");
                                    }
                                    
                                    Menu1=false;
                                    break;
                                case 4:
                                    
                                    Menu1=false;
                                    break;    
                                default:
                                    System.out.println("Numero mal ingresado");
                            }
                        }

                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
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
}
