import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();

        // Realizar operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // División: controlar división por cero
        double division;
        if (num2 != 0) {
            division = (double) num1 / num2; 
        } else {
            division = Double.NaN;  // "No es un número"
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por cero");
        }

        input.close();
    }
}
