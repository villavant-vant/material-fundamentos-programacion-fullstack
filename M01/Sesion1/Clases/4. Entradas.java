package S1;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args){
        System.out.println("Ingresar tu nombre:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Ingresar tu edad:");
        int edad = sc.nextInt();
        System.out.println(edad);
        System.out.println(name);
    }
}
