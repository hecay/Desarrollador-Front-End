/*
5) Leer dos números y encontrar:
a. La suma del doble del primero más el cuadrado del segundo.
b. El promedio de sus cubos.
 */
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos los numeros
        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        //calculamos la suma del doble del primero mas el cuadrado del segundo
        double dobleDelPrimero  = num1 * 2;
        double cuadradoDelSegundo = num2 * num2;
        double resultadoSuma = dobleDelPrimero + cuadradoDelSegundo;
        System.out.println("El resultado de la suma del doble del primero mas el cuadrado del segundo es: " + resultadoSuma);

        //calculamos el promedio de sus cubos
        double cuboDelPrimero = num1 * num1 * num1;
        double cuboDelSegundo = num2 * num2 * num2;
        double resultadoPromedio = (cuboDelPrimero + cuboDelSegundo) / 2;
        System.out.println("el promedio de sus cubos es de : " + resultadoPromedio);
    }

}
