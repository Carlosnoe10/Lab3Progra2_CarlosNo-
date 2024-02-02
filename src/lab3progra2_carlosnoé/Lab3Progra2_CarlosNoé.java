package lab3progra2_carlosnoé;

import java.util.Scanner;

public class Lab3Progra2_CarlosNoé {

    public static void main(String[] args) {
        Scanner sc= new Scanner()
        boolean Bandera = true;
        while (Bandera != false) {

            System.out.println("--Bienvenido al menu-- \n"
                    + "Ingrese '1' Para Agregar Mascotas \n"
                    + "Ingrese '2' Para Listar Las Mascotas Creadas \n"
                    + "Ingrese '3' Para Modificar la informacion de las mascotas \n"
                    + "Ingrese '4' Para Eliminar Alguna Mascota \n"
                    + "Ingrese '5' Para visualizar la Mascota mas antigua \n"
                    + "Ingrese '6' Para visualizar las Mascotas de color Negro \n"
                    + "Ingrese '7' Para Ingresar a la calculadora de edades (2) \n"
                    + "Ingrese '8' Para Salir");
            

            if ((elec > 0) && (elec < 7)) {
                switch (elec) {
                    case 1:
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
                       
                        break;

                    case 8:
                        Bandera = false;
                        break;
                }
            } else {
                
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
    
    public static boolean Numero0a100(int numero){
        if (numero>0 && numero <101) {
            return true;
        }else{
            return false;
        }
        
    }

    public static boolean Numero1a3(int numero){
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
