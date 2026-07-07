
import java.util.Scanner;

public class CondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble(); // 20

        String resultado = (nota>= 13 && nota<20) ? "APROBADO" : "REPROBADO";
        System.out.println(resultado);


        if (nota>=13){
            System.out.println("APROBADO");
        }else{
            System.out.println("REPROBADO");
        }

    }
}

// Si el numero es mayor igual a 18 -> "Es mayor de edad"
// Sino si el numero es menor de 18 -> "Es menor de edad"
