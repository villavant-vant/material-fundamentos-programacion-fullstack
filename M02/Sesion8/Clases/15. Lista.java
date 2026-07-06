package Sesion8.ArrayList;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        // Crea un programa que permita agregar 5 notas de 0 a 20 en un ArrayList de Double
        // Imprimir el promedio

        // Crear un ArrayList de tipo String
        ArrayList<String> pedidos = new ArrayList<>();

        // Agregar elementos
        pedidos.add("Lomo Saltado");
        pedidos.add("Ceviche");
        pedidos.add("Arroz con Pollo");

        // Mostrar todos los pedidos
        System.out.println("Pedidos: " + pedidos);

        // Acceder a un pedido específico
        System.out.println("Primer pedido: " + pedidos.get(0));

        // Modificar un pedido
        pedidos.set(1, "Carapulcra");
        System.out.println("Pedidos actualizados: " + pedidos);

        // Eliminar un pedido
        pedidos.remove(2);
        System.out.println("Pedidos luego de eliminar: " + pedidos);

        // Tamaño de la lista
        System.out.println("Total de pedidos: " + pedidos.size());
    }
}


