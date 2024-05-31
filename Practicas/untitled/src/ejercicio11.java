/*
11) En un almacén se hace un 20% de descuento a los clientes cuya compra
supere los $1000. Mostrar por pantalla cuál será la cantidad que pagará
una persona por su compra.
 */

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese monto de de la compra: ");
        double monto = sc.nextDouble();

        if (monto > 1000) {
            double descuento = monto - (monto * 0.2);
            System.out.println("mayor a 1000 obtiene 20% de descuento");
            System.out.println();
            System.out.printf("Monto total: %.2f\n", monto);
            System.out.printf("MONTO FINAL: %.2f\n", descuento);
        } else {
            System.out.printf("MONTO FINAL: %.2f\n", monto);
        }
    }
}
