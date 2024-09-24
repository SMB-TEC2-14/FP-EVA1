/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_17_CONTROL_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asignación de Variables
        String USR;
        String PSWRD;
        Scanner Captur = new Scanner(System.in);
        
        //Información al Usuario
        System.out.println("Hola Usuario :D");
        System.out.println("");
        System.out.println("Tu Usuario es ADMIN");
        System.out.println(" ");
        System.out.println("Tu Clave de Acceso es 1234");
        System.out.println(" ");
        System.out.println("Ingresa la Informacion de Manera Correcta");
        System.out.println(" ");
        
        //Valoración de Información
        System.out.println("Ingresa tu Usuario");
            USR = Captur.nextLine();
        System.out.println("Ingresa la Clave de Acceso");
            PSWRD = Captur.nextLine();
        if(USR.equals("ADMIN") && PSWRD.equals("1234")){
            System.out.println("Los Datos son Correctos");
        }
        else{
            System.out.println("Los Datos son Erroneos");
        }
        
        
    }
    
}
