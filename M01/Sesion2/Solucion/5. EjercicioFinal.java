package S2;

import java.util.Scanner;

public class EjercicioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingresar edad:");
        byte edad = sc.nextByte();

        System.out.println("Ingresar notas:");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Genero:");
        char genero = sc.next().charAt(0);

        System.out.println("Esta matriculad?:");
        boolean estaMatriculado = sc.nextBoolean();

        final int NOTA_APROBATORIA = 13;
        boolean estaAprobado = (promedio > NOTA_APROBATORIA);

        System.out.println("Notas" + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobe?: " + estaAprobado);


    }
}
