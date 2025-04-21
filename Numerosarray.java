import java.util.Scanner;

public class Numerosarray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        try {
            System.out.println("Ingrese 10 números enteros:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el número de la posición " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            } 
        } catch (Exception e) {
            System.out.println("Por favor ingresar un valor numérico válido...");
        }
        
        int opcion = 0;
        while (opcion != 5) {
            Menu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    arrayoriginal(numeros);
                    break;
                case 2:
                    Suma(numeros);
                    break;
                case 3:
                    buscarMaximoMinimo(numeros);
                    break;
                case 4:
                    invertirArray(numeros);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    
    private static void Menu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Mostrar el array original");
        System.out.println("2. Calcular la suma de los elementos");
        System.out.println("3. Buscar el número máximo y el número mínimo");
        System.out.println("4. Invertir el array");
        System.out.println("5. Salir");
        System.out.print("Por favor seleccione una opción: ");
    }

    // Imprimir el array original
    private static void arrayoriginal(int[] array) {
        System.out.print("Array Original -> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    // Calcular la suma de los elementos
    private static void Suma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("La suma de los elementos es -> " + suma);
    }

    // Encontrar el número máximo y mínimo
    private static void buscarMaximoMinimo(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Número máximo -> " + max);
        System.out.println("Número mínimo -> " + min);
    }

    // Método para invertir el array
    private static void invertirArray(int[] array) {
        System.out.print("Array invertido -> ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }
}