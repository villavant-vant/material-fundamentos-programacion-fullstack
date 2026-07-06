package S1;

import java.util.Scanner;

public class FormularioUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

        System.out.println("Ingrese su nota:");
        double nota = sc.nextDouble();

        System.out.println("Te gusta programar:");
        boolean respuesta = sc.nextBoolean();

        System.out.println("Resumen");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
        System.out.println("Respuesta: " + respuesta);


    }
}

//Nombre (texto)
//
//
//Edad (entero)
//
//
//Nota final (decimal)
//
//
//        ¿Le gusta programar? (true/false)
//Luego, muestra todos los datos usando printf.
