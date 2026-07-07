
import java.util.ArrayList;

public class PrincipalCRUD {
    public static void main(String[] args) {
        CUsuario usuario1 = new CUsuario("Jorge", 30, 'M'); // Estoy creando un objeto de tipo CUsuario que se llama como variable usuario1
        CUsuario usuario2 = new CUsuario("Wildor");

        int variable1 = 60;
        int variable2 = 20;

        Integer variable3 = 30;

        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(variable1);
        listaEnteros.add(variable2);
        listaEnteros.add(variable3);
        int valor =listaEnteros.get(0);
        listaEnteros.remove(0);
        listaEnteros.set(0, 999);

        System.out.println(listaEnteros.size());

        ArrayList<CUsuario> listaCUsuarios = new ArrayList<CUsuario>(); // Creacion
        listaCUsuarios.add(usuario1); // Agregar un objeto de un usuario a la lista listaCUsuarios
        listaCUsuarios.add(usuario2); // Agregar un objeto de un usuario a la lista listaCUsuarios

        CUsuario valor2 = listaCUsuarios.get(0); // Obtener el objeto CUsuario en la posicion 0
        System.out.println("Nombre: " + valor2.getNombre());
        System.out.println("Edad: " + valor2.getEdad());
        System.out.println("Genero: " + valor2.getGenero());

        listaCUsuarios.set(0, usuario2); // Actualizar la posicion con el objeto usuario2
        System.out.println(listaCUsuarios.size()); // Obtener el tamanio






    }
}
