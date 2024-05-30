/*
8) Elabore un programa que realice
la conversión de cm. a pulgadas. a. Donde 1cm = 0.39737 pulgadas.
 */
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unCm = 0.39737;

        System.out.println("======================================================");
        System.out.println("              Calculadora cm a pulgadas");
        System.out.println();
        System.out.print("ingrese la cantidad de cm: ");
        double cm = sc.nextDouble();
        System.out.println();
        System.out.println("1 cm = "+unCm+" Pulgadas");

        double resulPulgadas = unCm * cm;
        System.out.printf("%.2f Cm = %.5f Pulgadas%n", cm, resulPulgadas);
    }
}
