
public class Arreglos {
    public static void main(String[] args) {
        int[] arregloEnteros = {10, 7, 17, 9};
        System.out.println("Tamanio: " + arregloEnteros.length); // 4

        for (int i = 0; i < arregloEnteros.length ; i++){
            System.out.println(arregloEnteros[i]);
        }

        double[] arregloFlotantes = new double[5];
        System.out.println("Antes de actualizar");
        for (int i = 0; i < arregloFlotantes.length ;i++){
            System.out.println(arregloFlotantes[i]);
        }
        arregloFlotantes[0] = 5.15; //Actualizar
        arregloFlotantes[3] = 4;

        System.out.println("Actualizado");
        for (int i = 0; i < arregloFlotantes.length ;i++){ // FOR
            System.out.println(arregloFlotantes[i]); // Acceso a elementos
        }







    }
}
