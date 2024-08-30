/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_captura_autos;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_7_CAPTURA_AUTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        
                String Marca;
                String Modelo;
                int Year;
                double Precio;
                Scanner Captu;
                
                Captu = new Scanner(System.in);
                
        //CAPTURA Y IMPRESIÓN
                
        System.out.println("Ingresa el Marca del Auto");
                Marca = Captu.nextLine();
        System.out.println("Ingresa el Modelo del Auto");
                Modelo = Captu.nextLine();
        System.out.println("Ingresa la Fecha de Lanzamiento");
                Year = Captu.nextInt();
        System.out.println("Ingresa el Precio del Auto");
                Precio = Captu.nextDouble();
                
        
        System.out.println("Informacion Del Auto");
            System.out.println("Marca del Auto");
                System.out.println(Marca);
            System.out.println("Modelo del Auto");
                System.out.println(Modelo);
            System.out.println("Año del Auto");
                System.out.println(Year);
            System.out.println("Precio del Auto");
                System.out.println(Precio);
            
        
                
    }
    
}
