package tema4.utilidades;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Utilidades {
    // Método que pide un número al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
}
