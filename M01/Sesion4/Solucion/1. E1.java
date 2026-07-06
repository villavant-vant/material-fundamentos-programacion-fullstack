package S4;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt(); // 40

        for(int a = 1; a <= numero; a++){
            System.out.println(a);
        }
    }
}
