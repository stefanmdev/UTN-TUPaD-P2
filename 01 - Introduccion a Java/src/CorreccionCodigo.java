//El error estaba en usar scanner.nextInt() para leer un nombre (texto).
//nextInt() solo sirve para números enteros.
//La solución fue reemplazarlo por scanner.nextLine(), que permite leer una línea completa de texto y guardarla en un String.

package introjava;

import java.util.Scanner;

public class CorreccionCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();  

        System.out.println("Hola, " + nombre);

        scanner.close();
    }
}

