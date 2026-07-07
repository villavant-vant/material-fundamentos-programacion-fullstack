
import java.util.Scanner;

class Introduccion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        imprimirMenu();
        int opcion = sc.nextInt();
        int resultado = menuPrincipal(opcion, numero1, numero2);
        System.out.println("Resultado: " + resultado);
    }

    public static int menuPrincipal(int op, int a, int b){
        int resultado = 0;
        switch(op){
            case 1:
                resultado = sumatoria(a,b);
                break;
            case 2:
                resultado = restar(a, b);
                break;
            case 3:
                resultado = multiplicar(a, b);
                break;
            case 4:
                resultado = division(a, b);
                break;
        }
        return resultado;
    }
    public static int sumatoria(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        if (b == 0){
            System.out.println("La division entre 0 no es factible");
            return -1;
        }else{
            return a / b;
        }
    }
    public static void imprimirMenu(){
        System.out.println("Ingresar operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
    }
}
