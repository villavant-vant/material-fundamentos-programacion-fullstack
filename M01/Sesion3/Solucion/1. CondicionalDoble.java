package S3;

import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt(); // 45

        if ( (numero%5 == 0) && (numero%6 == 0) ) { //  false
            System.out.println("Eres un numero raro");
        } else {
            System.out.println("desconozco el numero");
        }
    }
}

// multiplos de 5 y multiplos de 6  -> Eres un numero raro
// Sino -> desconozco el numero