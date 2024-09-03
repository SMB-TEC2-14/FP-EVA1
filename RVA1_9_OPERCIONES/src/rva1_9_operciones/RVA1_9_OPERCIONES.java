/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rva1_9_operciones;

/**
 *
 * @author santy
 */
public class RVA1_9_OPERCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OPERACIONES ARITMETICAS
        
        int x = 10; //Asignacion y declaracion
        int y = 5;
        
        //
        int suma, resta, mult, div, pot, raiz;
        
        //Suma Y Resta
        suma = x + y; //El operador de suma es "+"
        resta = x - y; //El operador de resta es "-"
        
        System.out.println("La Suma de X + Y =");
        System.out.println(suma);
        System.out.println("La Resta de X - Y =");
        System.out.println(resta);
        
        //Multiplicacion
        mult = x * y; //El operador de multiplicacion es "*"
        
        System.out.println("La Multiplicacion de X * Y =");
        System.out.println(mult);
        
        //Division
        
        //Si se dividen enteros Java da como resultado enteros
        div = x / y; //El operador de division es "/"
        
        System.out.println("La Division de X / Y =");
        System.out.println(div);
        
        //Cambio de Variable
        
        x = 5;
        y = 2;
        
        div = x / y;
        
        System.out.println("La Division de X / Y =");
        System.out.println(div);
        
        //Division con Números con punto flotante
        
        double val1 = 5;
        double val2 = 2;
        double resu;
        
        resu = val1 / val2;
        
        System.out.println("El Resultado correcto de la Division es:");
        System.out.println(resu);
        
    }
    
}
