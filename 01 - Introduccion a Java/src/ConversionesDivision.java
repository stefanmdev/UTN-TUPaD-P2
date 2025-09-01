import java.util.Scanner;

public class ConversionesDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        // División usando enteros (resultado truncado)
        int divisionEntera = num1 / num2;

        // División usando double (resultado con decimales)
        double divisionDecimal = (double) num1 / num2;

        // Mostrar resultados
        System.out.println("División entera (int): " + divisionEntera);
        System.out.println("División con decimales (double): " + divisionDecimal);

        input.close();
    }
}
