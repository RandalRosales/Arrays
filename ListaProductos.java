import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaCompras = new ArrayList<>();

        int opcion = 0;
        while (opcion != 6) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto(listaCompras, scanner);
                    break;
                case 2:
                    mostrarLista(listaCompras);
                    break;
                case 3:
                    eliminarProducto(listaCompras, scanner);
                    break;
                case 4:
                    buscarProducto(listaCompras, scanner);
                    break;
                case 5:
                    ordenarLista(listaCompras);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    
    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Agregar un producto a la lista");
        System.out.println("2. Mostrar la lista de compras");
        System.out.println("3. Eliminar un producto de la lista");
        System.out.println("4. Buscar un producto en la lista");
        System.out.println("5. Ordenar la lista alfabéticamente");
        System.out.println("6. Salir");
        System.out.println(" ");
        System.out.print("Seleccione una opción: ");
    }

    // Agregar un producto a la lista
    private static void agregarProducto(ArrayList<String> lista, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        lista.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    // Imprimir la lista de compras
    private static void mostrarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de compras está vacía.");
        } else {
            System.out.println("Lista de compras:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i));
            }
        }
    }

    // Eliminar un producto de la lista
    private static void eliminarProducto(ArrayList<String> lista, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto que quieres eliminar: ");
        String producto = scanner.nextLine();
        if (lista.remove(producto)) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no está en la lista.");
        }
    }

    // Buscar un producto en la lista
    private static void buscarProducto(ArrayList<String> lista, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto que deseas buscar: ");
        String producto = scanner.nextLine();
        if (lista.contains(producto)) {
            System.out.println("El producto está en la lista.");
        } else {
            System.out.println("El producto NO está en la lista.");
        }
    }

    // Ordenar la lista alfabéticamente
    private static void ordenarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía. Asegurate de agregar productos para ordenarlos.");
        } else {
            Collections.sort(lista);
            System.out.println("La lista fue ordenada alfabéticamente.");
            mostrarLista(lista);
        }
    }
}
