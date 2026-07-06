package S2;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar datos
        System.out.print("Ingrese el nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        byte edad = scanner.nextByte();

        System.out.print("Ingrese la primera nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Ingrese la segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Ingrese la tercera nota: ");
        float nota3 = scanner.nextFloat();

        System.out.print("Ingrese el género (M/F): ");
        char genero = scanner.next().charAt(0);

        System.out.print("¿Está matriculado? (true/false): ");
        boolean estaMatriculado = scanner.nextBoolean();

        // 2. Calcular promedio
        float promedio = (nota1 + nota2 + nota3) / 3;

        // 3. Declarar constante
        final float NOTA_APROBATORIA = 13;

        // 4. Evaluar si aprobó
        boolean aprobo = promedio >= NOTA_APROBATORIA;

        // 5. Imprimir resultados
        System.out.println("\n--- Resultado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("¿Está matriculado?: " + estaMatriculado);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println("¿Aprobó?: " + aprobo);


    }
}
