/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int Qualy;
        //INFORMACIÓN AL USUARIO
        System.out.println("Saludoas Usuario");
        System.out.println(" ");
        System.out.println("Ingresa la Calificacion que deses imprimir:");
        System.out.println("Tomando en cuenta de la A al a F");
        System.out.println(" ");
            Qualy = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias en un momento de dare un resultado");
        System.out.println(" ");
        
        //RESULTADO Y VALORACIÓN DE DATOS
        if(Qualy == 100){
            System.out.println("La calificacion es A y es la calificacion Maxima");
        }
        else if(Qualy <= 0 || Qualy >=101)
            System.out.println("El Numero es invalido");

        else if(Qualy >= 90){
                System.out.println("La calificacion es A");
                System.out.println(" ");
        }
        else if(Qualy >= 80){
                System.out.println("La calificacion es B");
                System.out.println(" ");
        } 
        else if(Qualy >= 70){
                System.out.println("La calificacion es C");
                System.out.println(" ");
        } 
        else if(Qualy >= 60){
                System.out.println("La calificacion es D");
                System.out.println(" ");
        } 
        else if(Qualy >= 59){
                System.out.println("La calificacion es F");
                System.out.println(" ");
        } 


        
    }
    
}
