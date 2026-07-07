
import java.util.Scanner;

public class EjemploNotas {
    public static void main(String[] args) {
        double[] notas = new double[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<notas.length; i++){
            System.out.println("Ingresar nota " + i +": ");
            double nota =  sc.nextDouble();
            notas[i] = nota;
        }
        imprimirArreglo(notas);
        double promedio = calcularPromedio(notas);
        System.out.println("Promedio: " + promedio);
    }

    public static double calcularPromedio(double[] notas){
        double sumatoria = 0;
        for(int i=0; i<notas.length; i++){
            sumatoria = sumatoria + notas[i];
        }
        return sumatoria/notas.length;
    }
    public static void imprimirArreglo(double[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
