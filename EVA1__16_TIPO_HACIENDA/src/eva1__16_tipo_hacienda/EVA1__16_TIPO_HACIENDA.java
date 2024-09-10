/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1__16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1__16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Asignación de Variables
    char type;
    Scanner captur = new Scanner(System.in);
    
    //Instrucciones al Usuario y Captura de Datos
    System.out.println("Hola Usuario");
    System.out.println(" ");
    System.out.println("Ingresa el Tipo de Persona que es:");
    System.out.println("Tomando en cuenta que F = Fisica y M = Moral");
        type = captur.nextLine().charAt(0);
    System.out.println(type);
    
    //Impresión de Resultados
    if(type == 'F'){
        System.out.println("Es de Tipo PERSONA FISICA");
    }
    else{
        System.out.println("Es de Tipo PERSONA MORAL");
    }
    
    }
    
}
