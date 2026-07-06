package S2;

import java.util.Scanner;

public class ActividadOperadorLogico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt(); // 8

        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt(); // 6


        int resultado = numero1 + 20;

        // Mostrar resultados
        System.out.println();
        System.out.println("¿Son iguales? " + (numero1 == numero2) ); // 1 peso
        System.out.println("¿Son diferentes? " + (numero1 != numero2) );
        System.out.println("¿El primero es mayor que el segundo? " + (numero1 > numero2) );
        System.out.println("¿El primero es menor que el segundo? " + (numero1 < numero2) );
        System.out.println("¿El primero es mayor o igual que el segundo? " + (numero1 >= numero2) );
        System.out.println("¿El primero es menor o igual que el segundo? " + (numero1 <= numero2) );

        System.out.println("Resultado:" + resultado);
        System.out.println("Resultado:" + resultado);
        System.out.println("Resultado:" + resultado);
        System.out.println("Resultado:" + resultado);
        System.out.println("Resultado:" + resultado);
        System.out.println("Resultado:" + resultado);





    }
}
