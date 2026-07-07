
import java.util.Scanner;

public class RepetitivaDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1 = 0;

        do{
            System.out.println("Ingrese un numero: ");
            numero1 = sc.nextInt(); // 32
        }while(numero1 < 0); // False
    }
}
