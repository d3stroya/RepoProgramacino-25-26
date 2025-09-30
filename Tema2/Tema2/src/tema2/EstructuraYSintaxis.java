package tema2;


/**
 *
 * @author d3stroya
 */
// CLASE
public class EstructuraYSintaxis {
    // CONSTANTE
    final static char LETRA_DNI = 'A';
    
    // ATRIBUTOS
    int vida = 100;
    int niveles = 100;
    String genero = "RPG";
    
    // MÉTODOS
    public static void iniciar() {
        System.out.println("Iniciando juego....");
    }
    
    public static void mostrarMenu() {
        System.out.println("- MENÚ -");
        System.out.println("Inicia");
        System.out.println("Seleccionar nivel");
        System.out.println("Opciones");
        System.out.println("Salir");
    }

    // MÉTODO PRINCIPAL (MAIN)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // VARIABLES
        int tiempoEspera = 3;                
        float notaMedia = 6.8F;
        
        // 1. Declarar una variable
        char letraDNI;        
        
        // 2. Inicializar la variable
        letraDNI = 'A';
        
        // Declarar e inicializar una variable
        boolean encontrado = false;
        
        // Declarar varias variables en la misma línea
        int edad, niveles, vida;
        
        // Declarar e inicializar varias variables en la misma línea
        int edad1 = 3, niveles1 = 100, vida1 = 100;
        

        // LLAMADA A MÉTODOS
        iniciar();
        
        // SENTENCIAS
        System.out.println("Este es mi programa");
        System.out.println("Estoy aprendiendo a usar variables y constantes");
        System.out.println(letraDNI);
    }    
   

}
