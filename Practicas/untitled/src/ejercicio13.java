/*
13) Diseñar una solución que permita ingresar tres números enteros, e
informe cuál es el mayor.
 */
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        mayor(num, num2, num3);

        
    }

    private static void mayor(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("El primer numero es el mayor de los 3");
        } else if (b > a && b > c) {
            System.out.println("El segundo numero es el mayor de los 3");
        }else {
            System.out.println("El tercer numero es el mayor de los 3");
        }

    }
}
