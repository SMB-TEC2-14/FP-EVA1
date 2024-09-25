/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_meses_año;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA1_21_MESES_AÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int NMonth;
        
        //INFORMACIÓN AL USURAIO
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el Numero de Mes que Deseas Imprimir");
            NMonth = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias, en breve te darle el Resultado :D");
        System.out.println(" ");
        
        //RESULTADO FINAL Y VALORACIÓN DE DATOS
        if(NMonth == 1){
        System.out.println("El Mes es Enero");
        }
        else if(NMonth == 2){
        System.out.println("El Mes es Febrero");    
        }
        else if(NMonth == 3){
        System.out.println("El Mes es Marzo");    
        }
        else if(NMonth == 4){
        System.out.println("El Mes es Abril");    
        }
        else if(NMonth == 5){
        System.out.println("El Mes es Mayo");    
        }
        else if(NMonth == 6){
        System.out.println("El Mes es Junio");    
        }
        else if(NMonth == 7){
        System.out.println("El Mes es Julio");    
        }
        else if(NMonth == 8){
        System.out.println("El Mes es Agosto");    
        }
        else if(NMonth == 9){
        System.out.println("El Mes es Septiembre");    
        }
        else if(NMonth == 10){
        System.out.println("El Mes es Octubre");    
        }
        else if(NMonth == 11){
        System.out.println("El Mes es Noviembre");    
        }
        else if(NMonth == 12){
        System.out.println("El Mes es Diciembre");    
        }
        else{
           System.out.println("El Numero es Invalido :c");
           System.out.println(" ");
        }
    }
    
}
