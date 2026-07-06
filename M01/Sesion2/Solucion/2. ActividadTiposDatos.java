package S2;

import java.util.Scanner;

public class ActividadTiposDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Edad:");
        byte edad = sc.nextByte();

        System.out.println("Altura:");
        float altura = sc.nextFloat();

        System.out.println("Si es estudiante:");
        boolean estudiante = sc.nextBoolean();

        System.out.println("Genero:");
        char genero = sc.next().charAt(0);

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("¿Es estudiante?: " + estudiante);
        System.out.println("Género: " + genero);


    }
}
