/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_14_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Captura de Datos y Asignación de Variables
        double qualy;
        Scanner captur = new Scanner(System.in);
        
        //Impresion de Información
        System.out.println("Hola Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa tu calificación");
            qualy = captur.nextDouble();
            
        //Operaciones y Impresión de Resultado Final
        if (qualy >=70){
            
            System.out.println("La Calificacion es Apreditable");
        }
        else{
            
            System.out.println("NA");
        }

    }
    
}
