package S3;

import java.util.Scanner;

public class SelectivasSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billete = sc.nextInt();
        switch(billete){
            case 10:
            case 20:
            case 50:
                System.out.println("Billetes basicos");
                break;
            case 100:
                System.out.println("Tiene dinero");
                break;
            case 200:
                System.out.println("Has recibido tu grati");
                break;
            default:
                System.out.println("El billete no existe");
        }
    }
}



// Si un usuario ingresa un billeta de 10, 20 o 50 Deberia imprimir "Billetes basicos"
// Si un usuario ingresa un billete de 100 indicar que "Tiene dinero"
// Sie un usuario ingresa un billete de 200 , "Has recibido tu grati"
// Caso contrario, indicar que "El billete no existe".
