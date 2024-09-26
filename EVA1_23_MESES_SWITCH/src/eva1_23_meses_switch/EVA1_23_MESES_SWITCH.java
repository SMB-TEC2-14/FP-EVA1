/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_meses_switch;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_23_MESES_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int NMouth; 
        
        //INFORMACIÓN PARA EL USUARIO
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el Numero de Mes que deseas Mostrar (1 - 12)");
        System.out.println("");
        NMouth = Captur.nextInt();
        Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias, en un momento te darle el Resultado");
        System.out.println(" ");
        
        //RESULTADO Y VALORACIÓN DE DATOS
        switch (NMouth){
            case 1:
                System.out.println("El Mes es Enero");
                break;
            case 2:
                System.out.println("El Mes es Febrero");
                break;
            case 3:
                System.out.println("El Mes es Marzo");
                break;
            case 4:
                System.out.println("El Mes es Abril");
                break;
            case 5:
                System.out.println("El Mes es Mayo");
                break;
            case 6:
                System.out.println("El Mes es Junio");
                break;
            case 7:
                System.out.println("El Mes es Julio");
                break;
            case 8:
                System.out.println("El Mes es Agosto");
                break;
            case 9:
                System.out.println("El Mes es Septiembre");
                break;
            case 10:
                System.out.println("El Mes es Octurbre");
                break;
            case 11:
                System.out.println("El Mes es Noviembre");
                break;
            case 12:
                System.out.println("El Mes es Diciembre");
                break;
            default:
                System.out.println("El Numero es invalido (1 - 12)");
        }
    }
    
}
