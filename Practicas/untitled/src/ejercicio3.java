import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner presupuesto = new Scanner(System.in);

        System.out.print("Ingrese monto presupuestal: $$");
        double monto = presupuesto.nextDouble();

        double urgencias = monto * (37.0/100.0);
        double pediatria = monto * (42.0/100.0);
        double traumatologia = monto * (21.0/100.0);

        System.out.println("La cantidad de dinero que recibira pediatria es: $" + pediatria);
        System.out.println("La cantidad de dinero que recibira traumatologia es: $" + traumatologia);
        System.out.println("La cantidad de dinero que recibira urgencia es: $" + urgencias);


    }
}
