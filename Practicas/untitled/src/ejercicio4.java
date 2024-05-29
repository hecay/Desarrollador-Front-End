/*
4) Escriba un algoritmo que dado el número de horas trabajadas
por un empleado y el sueldo por hora, calcule el sueldo total de ese empleado.
Tenga en cuenta que las horas extras se pagan el doble. Las horas extras son
aquellas que van a partir de las 40 horas.
*/
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo de empleado");
        System.out.println();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        double horas = sc.nextInt();

        System.out.println("Ingrese el sueldo por hora: ");
        double sueldoXH = sc.nextDouble();

        if (horas > 40) {
            double sueldoFinal = (sueldoXH * 40)+((horas - 40) * (sueldoXH * 2 ));
            System.out.println("El sueldo total del empleado es de: $" + sueldoFinal);
        }else {
            double sueldofinal = sueldoXH*horas;
            System.out.println("El sueldo total del empleado es de: $" + sueldofinal);
        }
    }
}
