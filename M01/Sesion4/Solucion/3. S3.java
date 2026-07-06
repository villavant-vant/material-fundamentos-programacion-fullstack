package S4;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int sumatoria = 0;
        for(int a = 1; a <= n; a++){
            sumatoria = sumatoria + a;
            // a = 1; sumatoria = 1
            // a = 2; sumatoria = 1 + 2
            // a = 3; sumatoria = 1 + 2 + 3
            // a = 4; sumatoria = 1 + 2 + 3 + 4
            // ...
            // a = n; sumatoria = 1 + 2 + 3 + ...+ n
        }
        System.out.println("Sumatoria: " + sumatoria);




    }
}
