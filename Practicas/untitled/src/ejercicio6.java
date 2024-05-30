/*
    6) Leer tres números enteros de un Digito y almacenarlos
    en una sola variable que contenga a esos tres dígitos
    Por ejemplo si A=5 y B=6 y C=2 entonces X=562.
 */
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos los 3 digitos
        System.out.println("Ingrese el primer numero (solo 1 digito!): ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero (solo 1 digito!): ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero (solo 1 digito!): ");
        int c = sc.nextInt();

        String concatenacion = ""+a+b+c;

        int x = Integer.parseInt(concatenacion);

        System.out.println("X= "+x);
    }
}
