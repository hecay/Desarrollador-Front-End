import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de kilometros a recorrer: ");
        int km = sc.nextInt();

        //precio por kilometro
        double precioKm = 10.50;

        //calcula el precio
        double precioBoleto = km * precioKm;

        //mostramos resultado
        System.out.println("El precio del boleto es : $" + precioBoleto);
    }
}
