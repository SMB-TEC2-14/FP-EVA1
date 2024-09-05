/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se busca con este codigo hacer una formula de distacia
        
        //Asignacion de Variables y Scanner
        
        double DISTANCIA, VELOCIDAD, TIEMPO, ACELERACION;
        Scanner CAPTURA = new Scanner(System.in);
        
        //Captura y Impresiión de la Información
        
        System.out.println("Que tal Usuario :D");
        
        System.out.println("Ingresa la Velocidad:");
            VELOCIDAD = CAPTURA.nextDouble();
        System.out.println("Ingresa el Tiempo:");
            TIEMPO = CAPTURA.nextDouble();
        System.out.println("Igresa la aceleracion:");
            ACELERACION = CAPTURA.nextDouble();
            
        //Formula
        
        DISTANCIA = (VELOCIDAD * TIEMPO) + (((ACELERACION * TIEMPO) * TIEMPO) / 2.0);
        
        //Impresión de Resultados
        
        System.out.println("La Distancia es:" + " " + DISTANCIA);
        
    }
    
}
