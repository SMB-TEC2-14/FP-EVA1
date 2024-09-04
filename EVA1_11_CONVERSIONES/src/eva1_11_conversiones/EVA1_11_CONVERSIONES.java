/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_11_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Asignacion de Valores
        
        double fahr, cent;
        Scanner Captu = new Scanner(System.in);
        
        //Mensaje al Usuario
        
        System.out.println("Ingresa La Temperatura en Fahrenheit");
        fahr = Captu.nextDouble();
        cent = (fahr - 32) / 1.8; // Esto es un Expresión
        System.out.println("Los C son:" + "---" + cent);
        
        System.out.println("Ahora Ingresa La Temperatura en Celcius");
        double temp1,temp2;
        temp1 = Captu.nextDouble();
        temp2 = ((temp1 * 9) / 5 ) + 32;
        System.out.println("La Temperatura en F es:" + "---" + temp2);
        
        System.out.println("Ahora Ingresa una Nueva Temperatura en Celcius");
        double temp3, temp4;
        temp3 = Captu.nextDouble();
        temp4 = temp3 + 273.15;
        System.out.println("La Temperatura en K es:" + "---" + temp4);
        
        
        
    }
    
}
