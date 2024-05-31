/*
9) Se desea conocer el promedio y porcentaje de hombres y mujeres
cursando el Programación I en UTN FRRe, teniendo como dato la
cantidad de hombres y mujeres de 3 comisiones.
 */
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalVarones = 0;
        int totalMujeres = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la cantidad de varones de la comision "+i+": ");
            int varones = sc.nextInt();
            System.out.println("Ingrese la cantidad de mujeres de la comision "+i+": ");
            int mujeres = sc.nextInt();

            //sumamos a ls totales
            totalVarones += varones;
            totalMujeres += mujeres;
        }

        int totalAlumnos = totalVarones + totalMujeres;

        //promedio
        double promedioVarones = totalVarones / 3.0;
        double promedioMujeres = totalMujeres / 3.0;

        //porcentaje
        double porcentajeVarones = ((double) totalVarones/totalAlumnos) * 100;
        double porcentajeMujeres = ((double) totalMujeres/totalAlumnos) * 100;


        System.out.println("===================================");
        System.out.println("          Pogrogamacion 1");
        System.out.println();
        System.out.println("Cantidad de alumnos cursando (3 comisiones): "+totalAlumnos);
        System.out.println(" ");
        System.out.printf("Promedio de varones: %.2f%n", promedioVarones);
        System.out.printf("Promedio de mujeres: %.2f%n", promedioMujeres);
        System.out.println(" ");
        System.out.printf("Porcentaje de varones: %.2f%%%n", porcentajeVarones);
        System.out.printf("Porcentaje de mujeres: %.2f%%%n", porcentajeMujeres);
    }
}
