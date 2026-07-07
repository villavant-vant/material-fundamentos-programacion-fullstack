
import java.util.Scanner;

public class CondicionalAnidada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaSemana = sc.nextInt(); // -1
        if (diaSemana==1){
            System.out.println("Hoy es lunes");
        }else if (diaSemana==2){
            System.out.println("Hoy es Martes");
        }else if (diaSemana==3){
            System.out.println("Hoy es Miercoles");
        }else if (diaSemana==4){
            System.out.println("Hoy es Jueves");
        }else if (diaSemana==5){
            System.out.println("Hoy es Viernes");
        }else if (diaSemana==6){
            System.out.println("Hoy es Sabado");
        } else if (diaSemana==7 ) {
            System.out.println("Hoy es Domingo");
        }else {
            System.out.println("Numero de dia  no correcto");
        }
    }
}
