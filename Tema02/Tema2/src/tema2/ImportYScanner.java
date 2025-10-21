package tema2;

// 1. SENTENCIA IMPORT
// Importamos la clase System del paquete java.lang 
// (no es necesario, porque este paquete se importa automáticamente).
import java.lang.System;
import java.lang.AbstractMethodError;

// Importamos todas las clases (*) del paquete java.lang
import java.lang.*;

// 2. ENTRADA DE DATOS POR TECLADO
// Importamos la clase Scanner del paquete java.util
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class ImportYScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Usamos la clase System del paquete java.lang
        System.out.println("Estoy aprendiendo a importar paquetes");
              
        // 2. Pedimos datos al usuario por teclado
        // 2.1. Creamos el escáner que lea los datos
        Scanner entrada = new Scanner(System.in);
        
        // 2.2. Mostramos un mensaje por pantalla para indicar al usuario qué escribir
        System.out.println("¿Cuánto dinero tienes en la cuenta?");
                
        // 2.3. Leemos los datos del usuario
        int dinero = entrada.nextInt();
        
        // 2.4. Mostrar el resultado
        System.out.println("Tienes " + dinero + " euros.");
        
    }    

}
