import java.util.Scanner;

public class CalculadoraEstadistica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== CALCULADORA ESTADÍSTICA Y MATEMÁTICA ===");

        while (continuar) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Calcular promedio de 3 números");
            System.out.println("2. Dividir dos números");
            System.out.println("3. Comprobar si un número es par");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    double n2 = scanner.nextDouble();
                    System.out.print("Introduce el tercer número: ");
                    double n3 = scanner.nextDouble();

                    double promedio = calcularPromedio(n1, n2, n3);
                    System.out.println("El promedio es: " + promedio);
                    break;

                case 2:
                    System.out.print("Introduce el dividendo: ");
                    double a = scanner.nextDouble();
                    System.out.print("Introduce el divisor: ");
                    double b = scanner.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        double resultado = dividir(a, b);
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case 3:
                    System.out.print("Introduce un número entero: ");
                    int num = scanner.nextInt();
                    if (esPar(num)) {
                        System.out.println("El número es par.");
                    } else {
                        System.out.println("El número es impar.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    // CORRECCIÓN 1: Se agrupan los sumandos entre paréntesis (a + b + c) antes de dividir entre 3.0
    public static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    // CORRECCIÓN 2: Realiza la división directamente (la validación de divisor != 0 se hace en la interfaz/main)
    public static double dividir(double a, double b) {
        return a / b;
    }

    // CORRECCIÓN 3: Se utiliza el operador módulo (%) para verificar si el resto de dividir por 2 es 0
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}