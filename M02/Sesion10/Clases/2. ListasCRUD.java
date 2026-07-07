
import java.util.ArrayList;

public class ListasCRUD {
    public static void main(String[] args) {
        // Arraylist o Lista - tamanio dinamico
        ArrayList<Double> notas = new ArrayList<Double>();
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> dias = new ArrayList<Integer>();

        dias.add(1);
        dias.add(2);
        dias.add(3);
        System.out.println("Tamanio inicial: "+dias.size());
        dias.remove(0);
        System.out.println("Tamanio actualizado: "+ dias.size());

        dias.set(0, 100);
        int numero = dias.get(0); // Obtiene un numero entero en la posicion 0
        System.out.println("Numero en la posicion 0: " + dias.get(0)); // Imprime el elemtno en la posicion 0

        // CRUD
        // C - create  new ArrayList<....>(), add
        // R - Read  -> get
        // U - update -> set
        // D - Delete -> remove
        for(int i=0; i<dias.size(); i++){
            System.out.println(dias.get(i)) ;
        }









    }
}
