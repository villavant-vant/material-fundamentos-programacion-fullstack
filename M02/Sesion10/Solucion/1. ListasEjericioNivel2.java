package Sesion10;
import java.util.ArrayList;
import java.util.Scanner;

public class ListasEjericioNivel2 {
    public static void main(String[] args) {
        //1. Ingresar cantidad de ventas de laptops
        //2. Almacenar cada precio en un ArrayList de doubles
        //3. Imprimir el promedio de precios del Array de doubles

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar cantidad de ventas de Laptops: ");
        int cantidad = sc.nextInt();


        ArrayList<Double> preciosLista = new ArrayList<Double>();

        for(int i=0; i<cantidad; i++){
            System.out.println("Ingresar precio de la venta #"+ (i+1));
            double precio = sc.nextDouble();
            preciosLista.add(precio);
        }

        //Obtener Promedio
        double promedioPrecio = obtenerPromedio(preciosLista);
        System.out.println("El promedio  es: "+ promedioPrecio);
        System.out.println("El promedio  es: "+ promedioPrecio);
    }
    public static double obtenerPromedio(ArrayList<Double> precios){
        double sumatoria = 0;
        for(int i=0; i<precios.size(); i++){
            sumatoria = sumatoria + precios.get(i);
        }
        return sumatoria/precios.size();
    }
}
