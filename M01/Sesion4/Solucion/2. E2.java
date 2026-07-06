package S4;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = sc.nextInt();

        for(int a = 1; a <= 10; a++){
            System.out.println(numero + "x" + a + " = " + numero*a);
        }

    }
}
