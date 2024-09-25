/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int Km;
        int Month;
        
        //INFORMACIÓN A USUSARIO
        System.out.println("Hola Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el Kilometraje de tu Vehiculo:");
            Km = Captur.nextInt();
        System.out.println(" ");
        System.out.println("Ingresa el Lapzo de Tiempo desde el Ultimo Cambio de Aceite:");
            Month = Captur.nextInt();
        System.out.println(" ");
        System.out.println("Gracias, en Breve te dare los Resultados :3");
        System.out.println(" ");

        //RESULTADO Y VALORACIÓN DE DATOS
        if(Km >= 5000 || Month >= 6){
            System.out.println("El Vehiculo necesita un Cambio de Aceite :c");
        }
        else{
            System.out.println("Todo en orden con el Vehiculo :D");
        }
    }
    
}
