
import java.util.Scanner;

class OperadoresLogicos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt(); //
        boolean resultado = (edad<10) || (edad>20);

        System.out.println("Recibe el billete:" +resultado);

    }
}
