import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de kilometros a recorrer: ");
        int km = sc.nextInt();

        //precio por kilometro
        int precioKm = 45;

        //calcula el precio
        int precioBoleto = km * precioKm;

        //mostramos resultado
        System.out.println("El precio del boleto es : $" + precioBoleto);
    }

}
