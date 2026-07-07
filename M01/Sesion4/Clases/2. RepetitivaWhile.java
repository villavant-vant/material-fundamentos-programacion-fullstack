
import java.util.Scanner;

class RepetitivaWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt(); // 40

        while(numero < 0 || numero > 20) { // False
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt(); // 16
        }

        // [0 - 20]
    }
}
