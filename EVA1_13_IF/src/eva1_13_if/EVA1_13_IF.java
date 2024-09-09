/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Captura de Datos y Valores de la Variables
        int Age;
        Scanner captu = new Scanner(System.in);
        
        //Instrucciones para el Usuario
        System.out.println("Hola usuario :D");
        System.out.println("Ingresa tu edad:");
        Age = captu.nextInt();
        
        //Operaciones
        
        if (Age >= 18){
        
        System.out.println("El Usuario es un Adulto: Persona con la Mayoria de Edad");
        
            }
        else{
        
        System.out.println("El Ususario es un Menor: Persona que no tiene la Mayoria de Edad");
        
        }
        
        //Impresion de Edad
        System.out.println("La edad es:");
        System.out.println(Age);

    }
        
}
