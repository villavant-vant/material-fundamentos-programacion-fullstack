package S4;

import java.util.Scanner;

public class EjercicioPropuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas: ");
        int cantidadNotas = sc.nextInt();  // 5

        int sumatoriaNotas = 0;

        for(int i = 1; i <= cantidadNotas; i++){
            System.out.println("Ingrese un nota: ");
            int nota = sc.nextInt();
            sumatoriaNotas = sumatoriaNotas + nota;
        }
        double promedio = sumatoriaNotas/cantidadNotas;
        if (promedio >= 13){
            System.out.println("APROBADO");
        }else{
            System.out.println("DESAPROBADO");
        }

    }
}

// 1. Ingresar la cantidad de notas de un alumno
// 2. Imprimir el promedio de notas del alumno.
// 3. Indicar si es el alumno aprobo o no ( APRUEBA con mayor igual a 13)

//Por ejemplo
// cantidasNotas = 5
// notas1 = 20
// notas2 = 19
// notas3 = 15
// notas4 = 12
// notas5 = 20

// El promedio es (sumatoria de notas) / 5
// Si el promedio es mayor o igual a 13 INDICAR QUE APROBO