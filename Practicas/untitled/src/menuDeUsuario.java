import java.util.ArrayList;
import java.util.Scanner;

public class menuDeUsuario {

    public static void main(String[] args) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch(opcion) {
                case 1:
                    agregarVehiculo(vehiculos, scanner);
                    break;
                case 2:
                    buscarVehiculo(vehiculos, scanner);
                    break;
                case 3:
                    eliminarVehiculo(vehiculos, scanner);
                    break;
                case 4:
                    listarVehiculos(vehiculos);
                    break;
                case 5:
                    ordenarVehiculos(vehiculos);
                    break;
                case 6:
                    editarVehiculo(vehiculos, scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while(opcion != 7);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("==================================");
        System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
        System.out.println("==================================");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Buscar vehículo");
        System.out.println("3. Eliminar vehículo");
        System.out.println("4. Listar vehículos");
        System.out.println("5. Ordenar vehículos alfabéticamente");
        System.out.println("6. Editar vehículo por índice");
        System.out.println("7. Salir");
        System.out.println("==================================");
        System.out.print("Ingrese su opción: ");
    }

    public static void agregarVehiculo(ArrayList<String> vehiculos, Scanner scanner) {
        System.out.print("Ingrese el nombre del vehículo: ");
        String vehiculo = scanner.nextLine();
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado.");
    }

    public static void buscarVehiculo(ArrayList<String> vehiculos, Scanner scanner) {
        System.out.print("Ingrese el nombre del vehículo a buscar: ");
        String vehiculo = scanner.nextLine();
        if (vehiculos.contains(vehiculo)) {
            System.out.println("Vehículo encontrado: " + vehiculo);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public static void eliminarVehiculo(ArrayList<String> vehiculos, Scanner scanner) {
        System.out.print("Ingrese el nombre del vehículo a eliminar: ");
        String vehiculo = scanner.nextLine();
        if (vehiculos.remove(vehiculo)) {
            System.out.println("Vehículo eliminado.");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public static void listarVehiculos(ArrayList<String> vehiculos) {
        System.out.println("Lista de vehículos:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i));
        }
    }

    public static void ordenarVehiculos(ArrayList<String> vehiculos) {
        int n = vehiculos.size();
        boolean swapped;

        do {
            swapped = false;
            int i = 1;
            while (i < n) {
                if (vehiculos.get(i - 1).compareTo(vehiculos.get(i)) > 0) {
                    String temp = vehiculos.get(i - 1);
                    vehiculos.set(i - 1, vehiculos.get(i));
                    vehiculos.set(i, temp);
                    swapped = true;
                }
                i++;
            }
            n--;
        } while (swapped);

        System.out.println("Vehículos ordenados alfabéticamente.");
    }

    public static void editarVehiculo(ArrayList<String> vehiculos, Scanner scanner) {
        System.out.print("Ingrese el índice del vehículo a editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        if (indice >= 1 && indice <= vehiculos.size()) {
            System.out.print("Ingrese el nuevo nombre del vehículo: ");
            String nuevoNombre = scanner.nextLine();
            vehiculos.set(indice - 1, nuevoNombre);
            System.out.println("Vehículo editado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
