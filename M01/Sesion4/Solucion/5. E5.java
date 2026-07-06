package S4;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int a = 1; a <= n; a++){
            factorial = factorial * a;
        }

        System.out.println(factorial);
        // a = 1 ; factorial = 1
        // a = 2 ; factorial = 1 * 2;
        // a = 3 ; factorial = 1 * 2 * 3;
        // a = 4 ; factorial = 1 * 2 * 3 * 4;
        //..
        // a = n ; factorial = 1 * 2 * 3 * 4 *...* n;

    }
}
