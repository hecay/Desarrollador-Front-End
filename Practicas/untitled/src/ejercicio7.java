/*
* 7) Un profesor desea saber qué porcentaje de hombres y qué porcentaje
* de mujeres hay en un grupo de estudiantes.
*/
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de varones del curso: ");
        int varones = sc.nextInt();
        System.out.println("Ingrese la cantidad de mujeres del curso: ");
        int mujeres = sc.nextInt();


        int totalAlumnos = varones + mujeres;

        System.out.println("hay "+totalAlumnos+" alumnos en el curso");

        double porcentajeV = ((double) varones/totalAlumnos)*100;
        double porcentajeM = ((double) mujeres/totalAlumnos)*100;

        System.out.printf("Hay un %.2f%% de varones y un %.2f%% de mujeres en el curso%n", porcentajeV, porcentajeM);

    }
}
