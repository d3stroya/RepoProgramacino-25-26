package tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Control de Excepciones
 * 
 * @author d3stroya
 */
public class ControlDeExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro las variables que usaré
        int numero1;
        int numero2;
        int resultado;
        
        // Instancio el escáner para leer datos desde teclado
        Scanner entrada = new Scanner(System.in);
        
        // Le doy indicaciones al usuario y leo los datos
        System.out.println("Introduce los núemros que quieres dividir:");
        
        // 1. SIN CONTROL DE EXCEPCIONES
        System.out.print("Dividendo: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Divisor: ");
        numero2 = entrada.nextInt();
                
        // Hago la división
        // ¡¡¡OJO!!! Código problemático. Si numero2 = 0, saltará una excepción
        resultado = numero1 / numero2;      
        System.out.println(numero1 + " / " + numero2 + " = " + resultado);
        
        System.out.println("Sigue el programa");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // 2. CON CONTROL DE EXCEPCIONES
        // Controlo la división por 0 con ArithmeticException
        // y la entrada del tipo de dato adecuado con InputMismatchException
//        try {
//            System.out.print("Dividendo: ");
//            numero1 = entrada.nextInt();
//            
//            System.out.print("Divisor: ");
//            numero2 = entrada.nextInt();
//            
//            resultado = numero1 / numero2;
//            System.out.println(numero1 + " / " + numero2 + " = " + resultado);
//            
//        } catch(ArithmeticException e) {
//            System.out.println("No puedes dividir por cero.");
//            System.out.println(e);
//        } catch(InputMismatchException e) {
//            System.out.println("Has introducido un dato inválido.");
//        }
//        
//        System.out.println("Sigue el programa");

    }    

}
