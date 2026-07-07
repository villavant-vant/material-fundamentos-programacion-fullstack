
public class ArregloString {
    public static void main(String[] args) {
        String[] arregloNro1 = {"Hola", "como", "estas","pepito","buenas","noches"};
        String[] arregloNro2 = {"Jorge", "Enrique"};
        String[] arregloNro3 = {"1", "2", "3"};

        imprimirArreglo(arregloNro1);
        System.out.println("-------------------------------------------");
        imprimirArreglo(arregloNro2);
        System.out.println("-------------------------------------------");
        imprimirArreglo(arregloNro3);
    }

    public static void imprimirArreglo(String[] elementos){
        for(int i=0; i<elementos.length; i++){
            System.out.println(elementos[i]);
        }
    }
}
