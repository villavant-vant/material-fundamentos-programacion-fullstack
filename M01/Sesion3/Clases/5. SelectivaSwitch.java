package S3;

import java.util.Scanner;

public class SelectivaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte diaSemana = sc.nextByte();
        switch (diaSemana){
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("Te has equivocado de numero");
        }

    }
}
