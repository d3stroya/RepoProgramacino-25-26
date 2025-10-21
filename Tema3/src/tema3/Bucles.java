package tema3;

import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Bucles {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. FOR: se repite un número de veces conocida
        System.out.println("- BUCLE FOR -");
        for(int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        
        // 2. WHILE: se repite mientras se cumpla la condición (un número indefinido de veces)
        System.out.println("\n\n- BUCLE WHILE -");
        int contador = 0;
        int numero = 1;
        
        while(contador < 10) {
            if(numero % 2 == 0) {
                contador++;
            } else {
                numero++;
            }
        }
        
        // 3. DO WHILE: se ejecuta 1 vez y se repite mientras se cumpla la condición
        System.out.println("-\n BUCLE DO WHILE -");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elige una opción: ");
        int opcion;
        
        do {
            System.out.println("\n- MENÚ -");
            System.out.println("1. Aprender Java");
            System.out.println("2. Aprender Python");
            System.out.println("3. No aprender nada");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
        } while(opcion != 4);
    }     

}
