package Sesion8.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioListas {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresar la cantidad de notas: ");
        int cantidad = input.nextInt();

        for (int i = 0; i < cantidad; i++) {
            double nota = 0.0;
            do{
                System.out.println("Ingresar nota "+ (i+1));
                nota = input.nextDouble(); // 7
            }while(nota<=0 || nota>=20);

            notas.add(nota);
        }
        double sumatoria = 0;
        for(int i = 0; i < notas.size(); i++){
            sumatoria =  sumatoria + notas.get(i);
        }
        System.out.println("La promedio es: "+ (sumatoria / notas.size()));


    }
}
