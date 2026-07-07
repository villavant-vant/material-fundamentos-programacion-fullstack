
import java.util.Scanner;

class CapturarScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADAS
        String nombre = sc.nextLine(); // Texto largos
        String palabra = sc.next(); // Solamente 1 palabra
        int edad = sc.nextInt(); // Leer enteros
        double precio = sc.nextDouble(); // Capturar un decimal
        boolean respuesta = sc.nextBoolean(); //  true false


        //SALIDAS
        System.out.println("Texto: " + nombre);
        System.out.println("Palabra: " + palabra);
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("Respuesta: " + respuesta);
    }

}
