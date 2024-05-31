/*
10) Determinar si un alumno aprueba o desaprueba un curso, sabiendo que
aprueba si su promedio de tres calificaciones es mayor o igual a 60;
desaprueba en caso contrario.
 */
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 3; i++){
            System.out.print("Ingrese la calificacion " + i + ": ");
            int nota = sc.nextInt();
            total += nota;
        }

        double promedio = (double)total / 3;

        if (promedio >= 60){
            System.out.println("Alumno Aprobado");
        }else {
            System.out.println("Alumno Desaprobado");
        }
    }
}
