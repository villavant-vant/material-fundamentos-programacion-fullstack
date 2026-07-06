package S3.Ejercicios;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        final double PORCENTAJE10 = 0.1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto comprado: ");
        double monto = sc.nextDouble();

        if (monto > 200){
            double descuento = monto * PORCENTAJE10;
            double precio_final = monto - descuento;
            System.out.println("Precio de compra: " + monto);
            System.out.println("Descuento: " + precio_final);
            System.out.println("Precio final " + precio_final);
        }else{
            System.out.println("No aplica descuento ");
        }
    }
}
