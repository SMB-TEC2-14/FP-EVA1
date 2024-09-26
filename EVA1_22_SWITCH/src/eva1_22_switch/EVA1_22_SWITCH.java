/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int SemDay;
        Scanner Captur = new Scanner(System.in);
        //INFORMACIÓN AL USUARIO
        System.out.println("Hola Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el dia de la Semana que deseas imprimir (1 - 7)");
        System.out.println("");
            SemDay = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias en un momento te dare el Resultado :D");
        System.out.println(" ");
        
        //RESULTADOS
        switch (SemDay){
            case 1:
                System.out.println("El Dia es Domingo");
                break;
            case 2:
                System.out.println("El Dia es Lunes");
                break;
            case 3:
                System.out.println("El Dia es Martes");
                break;
            case 4:
                System.out.println("El Dia es Miercoles");
                break;
            case 5:
                System.out.println("El Dia es Jueves");
                break;
            case 6:
                System.out.println("El Dia es Viernes");
                break;
            case 7:
                System.out.println("El Dia es Sabado");
                break;
            default:
                System.out.println("El Numero es invalido (1 - 7)");
        }
        
    }
    
}
