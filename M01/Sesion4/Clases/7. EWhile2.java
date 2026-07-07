
import java.util.Scanner;

class EWhile2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        int sumatoria = numero;

        while(numero != -1){
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            sumatoria = sumatoria + numero;
        }
        System.out.println("Sumatoria es: "+sumatoria);

    }
}

