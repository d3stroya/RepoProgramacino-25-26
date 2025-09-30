# Introducción al lenguaje de programación Java
Durante este curso aprenderemos a programar con Java.

## Algunos conceptos básicos
* **Programación**: comunicación que establecemos con la máquina para darle 
un conjunto de instrucciones ordenadas que **resuelven un problema**.

* **Lenguaje de programación**: conjunto de símbolos con una sintaxis que nos permite programar.

* **IDE**: Entorno de Desarrollo Integrado que nos permite programar usando una interfaz gráfica sencilla.

* **Compilar**: traducir nuestro programa a código máquina.

* **Depurar**: analizar el código línea a línea para encontrar errores y optimizar el código.

* **Error de compilación**: error de sintaxis que impide la compilación.

* **Error en tiempo de ejecución**: error, generalmente de lógica que sucede mientras se ejecuta el programa.

## Primeros pasos
1. **Plataforma Java**: Java cuenta con diferentes plataformas:

    1.1. **Java SE (Standard Edition)**: es la que utilizaremos, ya que está pensada para
    desarrollar aplicaciones de escritorio.

    1.2. Java EE: pensada para aplicaciones empresariales y del lado del servidor.

    1.3. Java ME: dedicada a aplicaciones móviles.

2. **Java Development Kit (JDK)**: caja de herramientas de java que nos permite ejecutar, 
compilar o documentar el programa.

3. **IDE**: Usaremos Apache Netbeans para escribir código, depurarlo, compilarlo, ejecutarlo y documentarlo.

4. **[Configurar las variables de entorno](https://www.youtube.com/watch?v=flhyaMlhkBg)** para que nuestro equipo encuentre la JDK y pueda usarla.

5. **Workspace**: carpeta en la que guardaremos todos nuestros proyectos.

## Mi primer programa
Programa en Java que imprime por pantalla el mensaje "Hola, mundo".
```
package holamundo;


/**
 *
 * @author d3stroya
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("Hola, mundo");
    }    

}
```

## Documentar el código con Javadoc
Como en cualquier lenguaje de programación, tenemos dos tipos de comentarios:

```
// Comentarios de línea

/**
 *
 * Y comentarios de bloque
 * Estos son los que aparecen en la documentación de Javadoc
 *
 */
```

En ambos casos, el compilador ignora estos comentarios.
Su utilidad es ayudar a los programadores a entender el código.

Javadoc es una de las herramientas de la JDK y nos permite crear una página web
con toda la información de nuestro programa.

Java tiene su propia documentación (la [API de Java](https://docs.oracle.com/javase/8/docs/api/)).
