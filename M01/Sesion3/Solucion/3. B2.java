package S3.Ejercicios;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar edad: ");
        int edad = sc.nextInt();

        if (edad >= 18 && edad<= 35){
            System.out.println("Joven");
        } else if (edad > 35){
            System.out.println("Experimentado");
        }
    }
}
