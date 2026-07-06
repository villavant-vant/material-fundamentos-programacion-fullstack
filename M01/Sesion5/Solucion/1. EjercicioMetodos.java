package S5S6;

import java.util.Scanner;

public class EjercicioMetodos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingresar apellido");
        String apellido = sc.nextLine();

        System.out.println("Ingresar edad");
        int edad = sc.nextInt(); // 20

        if(validarEdad(edad)){
            System.out.println("Es mayor de edad");
            recibirBono(edad, 27, 50);
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public static boolean validarEdad(int edad){
        if(edad>=18){
          return    true;
        }else{
            return false;
        }
    }
    public static void recibirBono(int edad,int edadMinima, int edadMaxima){
        if (edad>= edadMinima && edad <=edadMaxima){
            System.out.println("Tiene un bono por el estado");
        }
    }
}
