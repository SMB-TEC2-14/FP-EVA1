/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Asignación de Variables
        
                String Nombre;
                String Reparto;
                String Clasificacion;
                String Genero;
                int Duracion;
                Scanner Teclado;
                Teclado = new Scanner(System.in);
                
        System.out.println("Ingresa el Nombre de la Pelicula");
            Nombre = Teclado.nextLine();
        System.out.println("Ingresa el Reparto de la Pelicula");
            Reparto = Teclado.nextLine();
        System.out.println("Ingresa la Clasificacion de la Pelicula");
            Clasificacion = Teclado.nextLine();
        System.out.println("Ingresa la Duracion de la Pelicula");
            Duracion = Teclado.nextInt();
        System.out.println("Ingresa el Genero de la Pelicula");
            Genero = Teclado.nextLine();
        
        
        
        System.out.println("El Nombre de la Pelicula Es:");
            System.out.println(Nombre);
        System.out.println("El Reparto de la Pelicula Es:");
            System.out.println(Reparto);
        System.out.println("La Clasificacion de la Pelicula Es:");
            System.out.println(Clasificacion);
        System.out.println("La Duracion Total de la Pelicula Es:");
            System.out.println(Duracion);
        System.out.println("El Genero de la Pelicula Es:");
            System.out.println(Genero);
        
                
    }
    
}
