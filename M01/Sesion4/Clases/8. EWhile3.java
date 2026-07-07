
import java.util.Scanner;

class EWhile3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un password: ");
        String password = sc.next(); // pepito

        System.out.println("Repite tu password: ");
        String passwordRepetido = sc.next(); // pepito2

        while(!password.equals(passwordRepetido)){ // False
            System.out.println("Repite tu password: ");
            passwordRepetido = sc.next(); //pepito
        }
    }
}
