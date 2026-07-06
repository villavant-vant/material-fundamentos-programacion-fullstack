package S2;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        float precio;
        System.out.println("Ingresa el precio del formulario");
        Scanner sc = new Scanner(System.in);
        precio = sc.nextFloat();
        System.out.println("El precio es: " + precio);
    }
}
