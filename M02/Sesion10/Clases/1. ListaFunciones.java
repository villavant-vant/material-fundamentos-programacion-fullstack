
import java.util.ArrayList;

class ListaFunciones {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        if (numeros.isEmpty()){ // Consulta si la lista esta vacia
            System.out.println("Lista vacia");
        }else{
            System.out.println("Lista con elementos");
        }

        int posicion = numeros.indexOf(100); // Devuelve la posicion de un elemento sie xiste
        // Caso contrario devuelve -1
        if (posicion == -1){
            System.out.println("Elemento 100 no encontrado");
        }else{

            System.out.println("Posicion del elemento 100 es: "+ posicion);
        }

        if(numeros.contains(100)){ // Devuelve si un elemento esta dentro de un ArrayList
            System.out.println("Elemento 100 encontrado");
        }else{
            System.out.println("Elemento 100 no encontrado");
        }

    }
}
