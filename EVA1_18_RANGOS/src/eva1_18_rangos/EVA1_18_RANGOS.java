/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Asignación de Variables
        Scanner Captur = new Scanner(System.in);
        double Qualy; 
        
        //Información al Usuario
        System.out.println("Hola Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa tu Calificacion");
            Qualy = Captur.nextDouble();
        System.out.println(" ");
        
        //Validación de Información
        if(Qualy >=70 && Qualy == 100){
            System.out.println("La Calificacion es ACREDITABLE");
        }
        else{
            System.out.println("La Calificacion NO es ACREDITABLE");
        }
        
        
    }
    
}
