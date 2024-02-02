package lab3progra2_carlosnoé;

import java.util.Scanner;

public class Lab3Progra2_CarlosNoé {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Bandera = true;
        while (Bandera != false) {

            System.out.println("----MENU PRINCIPAL---- \n"
                    + "1. CREAR POKEMON \n"
                    + "2. CREAR POKEBOLA \n"
                    + "3. LISTAR POKEMON \n"
                    + "4. ELIMNAR POKEMON \n"
                    + "5. CAPTURAR POKEMON \n"
                    + "6. MODIFICAR POKEMON \n"
                    + "Ingrese '8' Para Salir");
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
                                    if (one=false) {
                                        System.out.println("Creacion invalida");
                                    }else{
                                        
                                    }
                                    
                                    Menu1=false;
                                    break;
                                case 2:
                                    
                                    Menu1=false;
                                    break;    
                                case 3:
                                    
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
