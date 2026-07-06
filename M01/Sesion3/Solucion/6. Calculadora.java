package S3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero 1: ");
        int numero1 = sc.nextInt(); // 5

        System.out.println("Digite um numero 2: ");
        int numero2 = sc.nextInt(); // 6

        System.out.println("Indicar operador(+,-,*,/): ");
        char operador = sc.next().charAt(0); // *
        float resultado = 0;
        switch (operador){
            case '+':
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case '-':
                System.out.println(numero1 - numero2);
                break;
            case '*':
                System.out.println(numero1 * numero2);
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
                }else{
                    resultado  = numero1 / numero2;
                    System.out.println(resultado);
                }
                break;
            default:
                System.out.println("Operador invalido");
        }
    }
}

// Ingresamos 2 numeros entero
// Solicitamos el operador(+,-,*,/)
// Imprimir el resultado de la operacion
// si en caso el usuario seleciona la division (/), validar que el
// segundo numero no sea 0, en caso de ser 0, Mostrar un mensaje
// "NO SE PUEDE DIVIDIR ENTRE 0"
