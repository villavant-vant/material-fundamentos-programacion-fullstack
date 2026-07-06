package S3;

import java.util.Scanner;

public class CondicinalAnidada2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();  // 50

        if (nota>=0 && nota<=20){
            if (nota >= 11){
                if (nota <=17){
                    System.out.println("Aprobado");
                }else {
                    System.out.println("Excelente");
                }
            } else{
                System.out.println("Desaprobado");
            }
        }else{
            System.out.println("Numero invalido");
        }





    }
}
