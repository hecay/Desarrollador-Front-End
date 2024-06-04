/*
12) Solicitar la edad de dos hermanos, mostrando un mensaje que informe
la edad del mayor y cuántos años de diferencia tiene con el menor.
 */
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la edad del 1er hermano: ");
        int edad1 = sc.nextInt();

        System.out.println("Ingrese la edad del 2do hermano: ");
        int edad2 = sc.nextInt();

        if (edad1 > edad2){
            System.out.println("El primer hermano es el mayor");
            int diferenciaEdad = edad1 - edad2;
            System.out.println("la diferencia de edad con el hermano menor es de: "+diferenciaEdad+" años");

        }else {
            System.out.println("El segundo hermano es el mayor");
            int diferenciaEdad = edad2 - edad1;
            System.out.printf("la diferencia de edad con el hermano menor es de: "+diferenciaEdad+" años");
        }
    }
}
