/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_datos_2;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_6_ENTRADA_DATOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Nombre;
        String CURP;
        int Edad;
        double Promedio;
        
        //Se crea el Scanner
        
        Scanner Captu; 
        
        //Nota siempre que se crea el comando Scanner, va generar un error, en el error es doble click y listo
        
        Captu = new Scanner(System.in);
        
        //Captura del mensaje y instrucción
        
        System.out.println("Ingresa tu Nombre Completo:");
        Nombre = Captu.nextLine(); //nextLine va a CAPTURAR toda la INFORMACIÓN hasta que se precione la tecla ENTER
        System.out.println("Ingresa Tu CURP:");
        CURP = Captu.nextLine();
        System.out.println("Ingresa tu Edad:");
        Edad = Captu.nextInt();
        System.out.println("Ingresa tu Promedio:");
        Promedio = Captu.nextDouble();
        
        //Impresión:
        
        System.out.println("Datos Ingresados");
        System.out.println("Nombre");
        System.out.println(Nombre);
        System.out.println("Curp");
        System.out.println(CURP);
        System.out.println("Edad");
        System.out.println(Edad);
        System.out.println("Promedio Total");
        System.out.println(Promedio);
                
        
        
    }
    
}
