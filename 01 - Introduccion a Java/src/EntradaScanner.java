import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);

        input.close();
    }
}
