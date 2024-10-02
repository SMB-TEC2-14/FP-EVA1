/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int Age;

        //INFORMACIÓN AL USUARIO
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el año que deseas Capturar");
        System.out.println("Depende el Dato Capturado te informare si es un Año Bisiesto o no");
        System.out.println(" ");
            Age = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias en un momento que dare el resultado :D");
        System.out.println(" ");
        
        //RESULTADO Y VALLORACIÓN DE DATOS
        if(Age % 4 == 0 || Age % 100 < 0){
            System.out.println("Bisiesto");
        }
        else if(Age % 100 == 0 && Age % 400 == 0){
            System.out.println("Bisiesto");
         }
        else{
            System.out.println("No es Bisiesto");
        }
    }
    
}
