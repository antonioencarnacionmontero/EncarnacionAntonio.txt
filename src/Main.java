
import java.util.Scanner;
import java.util.Random;

public class Main {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int filas, columnas;
                int[][] matriz;

                // Pedir al usuario las dimensiones de la matriz
                do {
                        System.out.print("Ingrese el número de filas: ");
                        while (!scanner.hasNextInt()) {
                                System.out.println("Entrada inválida. Ingrese un número entero positivo.");
                                scanner.next();
                        }
                        filas = scanner.nextInt();

                        System.out.print("Ingrese el número de columnas: ");
                        while (!scanner.hasNextInt()) {
                                System.out.println("Entrada inválida. Ingrese un número entero positivo.");
                                scanner.next();
                        }
                        columnas = scanner.nextInt();

                        if (filas <= 0 || columnas <= 0) {
                                System.out.println("Las dimensiones deben ser números enteros positivos.");
                        }
                } while (filas <= 0 || columnas <= 0);

                // Generar la matriz con números aleatorios
                matriz = generarMatriz(filas, columnas);

                // Menú principal
                int opcion;
                do {
                        mostrarMenu();
                        System.out.print("Ingrese una opción: ");
                        while (!scanner.hasNextInt()) {
                                System.out.println("Opción inválida. Ingrese un número entero.");
                                scanner.next();
                        }
                        opcion = scanner.nextInt();

                        switch (opcion) {
                                case 1:
                                        mostrarMatriz(matriz);
                                        break;
                                case 2:
                                        // Aquí implementarías la funcionalidad de poner una bomba
                                        System.out.println("Función poner bomba aún no implementada.");
                                        break;
                                case 0:
                                        System.out.println("Saliendo del programa...");
                                        break;
                                default:
                                        System.out.println("Opción inválida.");
                        }
                } while (opcion != 0);
        }

        // Genera una matriz con números aleatorios del 1 al 9
        public static int[][] generarMatriz(int filas, int columnas) {
                int[][] matriz = new int[filas][columnas];
                Random random = new Random();
                for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                                matriz[i][j] = random.nextInt(9) + 1;
                        }
                }
                return matriz;
        }

        // Muestra el contenido de la matriz por consola
        public static void mostrarMatriz(int[][] matriz) {
                for (int[] fila : matriz) {
                        for (int valor : fila) {
                                System.out.print(valor + " ");
                        }
                        System.out.println();
                }
        }

        // Muestra el menú de opciones
        public static void mostrarMenu() {
                System.out.println("Menú:");
                System.out.println("[1] Mostrar matriz");
                System.out.println("[2] Poner bomba");
                System.out.println("[0] Salir");
        }
}