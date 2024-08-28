/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Introducción de las Variables
        
        String Nombre;
        
        //Captura de Datos Con Teclado
        //Scanner es una Herramienta
        //Scanner es un tipo de DATO
        
        Scanner captu; //Se tiene que importar la herramienta al codigo
        
        //No Scanner o captu no existen, hay que crearla o darle un valor/significado
        
        captu = new Scanner(System.in); //Con este codigo se crea la herramienta para darle función a Scanner
        
        //Se le tiene que dar la indicación al Usuario para que ingrese su Nombre
        
        System.out.println("Ingresa tu Nombre Completo");
        
        //Capturar (Asignarle un Valor a la Variable)
        
        Nombre = captu.nextLine(); //Con este codigo se captura todo el texto que ingrese el Usuario, esto hasta que presione la tecla "Enter"
        
        //Imprimir los Datos
        
        System.out.println("------------------------------------------------------Datos Capturados-------------------------------------------------------");
        System.out.println(Nombre);
        
    }
    
}
