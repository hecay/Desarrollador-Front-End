import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestionVentaVehiculos {

    public static void main(String[] args) {
        ArrayList<String> autos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del auto: ");
                    String nuevoAuto = scanner.nextLine();
                    agregarAuto(autos, nuevoAuto);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del auto a buscar: ");
                    String autoABuscar = scanner.nextLine();
                    buscarAuto(autos, autoABuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del auto a eliminar: ");
                    String autoAEliminar = scanner.nextLine();
                    eliminarAuto(autos, autoAEliminar);
                    break;
                case 4:
                    System.out.println(listarAutos(autos));
                    break;
                case 5:
                    ordenarAutos(autos);
                    break;
                case 6:
                    System.out.print("Ingrese el índice del auto a editar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el nuevo nombre del auto: ");
                    String nuevoNombre = scanner.nextLine();
                    editarAuto(autos, indice, nuevoNombre);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.\n");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n==================================");
        System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
        System.out.println("==================================");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Buscar vehículo");
        System.out.println("3. Eliminar vehículo");
        System.out.println("4. Listar vehículos");
        System.out.println("5. Ordenar vehículos alfabéticamente");
        System.out.println("6. Editar vehículo por índice");
        System.out.println("7. Salir");
        System.out.println("==================================\n");
        System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
    }

    public static void agregarAuto(ArrayList<String> autos, String nombreAuto) {
        autos.add(nombreAuto);
        System.out.println("Vehículo agregado correctamente.");
    }

    public static void buscarAuto(ArrayList<String> autos, String nombreAuto) {
        int indice = autos.indexOf(nombreAuto);
        if (indice != -1) {
            System.out.println("Vehículo encontrado en la posición: " + indice);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public static void eliminarAuto(ArrayList<String> autos, String nombreAuto) {
        if (autos.remove(nombreAuto)) {
            System.out.println("Vehículo eliminado correctamente.");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public static String listarAutos(ArrayList<String> autos) {
        System.out.println("Listado de vehículos:");
        String listaAutos = "";
        for (String auto : autos) {
            listaAutos += auto + "\n";
        }
        return listaAutos;
    }

    public static void ordenarAutos(ArrayList<String> autos) {
        Collections.sort(autos);
        System.out.println("Vehículos ordenados alfabéticamente.");
    }

    public static void editarAuto(ArrayList<String> autos, int indice, String nuevoNombre) {
        if (indice >= 0 && indice < autos.size()) {
            autos.set(indice, nuevoNombre);
            System.out.println("Vehículo editado correctamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }
}
