
import java.util.Scanner;

class CondicionalSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();

        if (numero%5 == 0) {
           System.out.println("Has ingresado un multiplo de 5");
        }
    }
}
