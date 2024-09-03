/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_operaciones2;

/**
 *
 * @author santy
 */
public class EVA1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Concatenacion
        //El operador de Concatenación es "+"
        
        //Nota: Cuando se tiene el mismo simbolo con diferentes usos se llama "sobrecarga"
        
        String nombre = "Santiago";
        String apellido = "Morquecho";
        String nomCom;
        
        //Concatenación
        
        nomCom = nombre + " " + apellido;
        
        //Impresion de Datos
        
        System.out.println("Datos Capturados");
        System.out.println("El Nombre del Usuario es:" + nombre);
        System.out.println("El Apellido del Usuario es:" + apellido);
        System.out.println(nomCom);
        
        
    }
    
}
