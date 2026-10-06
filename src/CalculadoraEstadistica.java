import java.util.Scanner;

/**
 * Aplicación de consola que proporciona una calculadora con menú interactivo
 * para realizar operaciones estadísticas y matemáticas básicas.
 *
 * @author Sebastián
 * @version 1.1
 */
public class CalculadoraEstadistica {

    /**
     * Punto de entrada principal de la aplicación.
     * Muestra un menú por consola que permite interactuar con las funciones estadísticas.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
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

    /**
     * Calcula la media aritmética de tres números reales.
     * Agrupa los sumandos para garantizar la precedencia correcta antes de la división.
     *
     * @param a Primer valor.
     * @param b Segundo valor.
     * @param c Tercer valor.
     * @return El promedio aritmético como double.
     */
    public static double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    /**
     * Realiza la división aritmética de dos números.
     *
     * @param a Dividendo.
     * @param b Divisor (se valida que sea distinto de cero en la interfaz).
     * @return El cociente de la división.
     */
    public static double dividir(double a, double b) {
        return a / b;
    }

    /**
     * Evalúa si un número entero es par comprobando el resto de la división por dos.
     *
     * @param numero Número entero a verificar.
     * @return {@code true} si es par, {@code false} si es impar.
     */
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}