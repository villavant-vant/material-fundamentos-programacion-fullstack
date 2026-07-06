package S3.Ejercicios;

import java.util.Scanner;

public class I1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calificacion del empleado: ");
        int calificacion = sc.nextInt();

        System.out.println("Calificacion " + calificacion);

        if (calificacion==9 || calificacion==10){
            System.out.println("Desempeño Excelente");
            System.out.println("bono del 20%");
        } else if (calificacion>=7 && calificacion<=8){
            System.out.println("Desempeño Bueno");
            System.out.println("bono del 10%");
        } else if (calificacion>=5 && calificacion<=6){
            System.out.println("Desempeño Regular");
            System.out.println("sin bono");
        } else if (calificacion>=1 && calificacion<=4){
            System.out.println("Desempeño Deficiente");
            System.out.println("plan de mejora");
        }else{
            System.out.println("La calificacion ingresada es incorrecta");
        }

        System.out.println();

    }
}

//9-10: Excelente (bono del 20%)
//7-8: Bueno (bono del 10%)
//5-6: Regular (sin bono)
//1-4: Deficiente (plan de mejora)