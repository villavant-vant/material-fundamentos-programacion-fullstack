package Sesion10.ArrayListPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalEjercicioNivel2 {
    public static void main(String[] args) {
        //1. Ingresar cantidad de usuarios
        //2. En cada iteracion solicitar el nombre, edad y genero de los usuarios
        //3. Imprimir la lista de los Nombres de usuarios almacenados en el ArrayList<CUsuario>
        //4. Imprimir el nombre del usuario que tiene mayor edad.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Cantidad de usuarios: ");
        int cantidad = sc.nextInt();

        ArrayList<CUsuario> usuariosLista = new ArrayList<CUsuario>();

        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingresar Nombre: ");
            String nombre = sc.next();

            System.out.println("Ingresar edad: ");
            int edad = sc.nextInt();

            System.out.println("Ingresar genero: ");
            char genero = sc.next().charAt(0);

            CUsuario nuevoUsuario = new CUsuario(nombre, edad, genero);
            usuariosLista.add(nuevoUsuario);
        }


        for(int i = 0; i < cantidad; i++){
            CUsuario usuario = usuariosLista.get(i);
            System.out.println("Nombre: " + usuario.getNombre());
        }

        CUsuario usuarioMayor = usuariosLista.get(0); // Estamos asumiendo que el elemento en la posicion 0 es el
        // que tiene mayor edad.

        for(int i = 1; i < cantidad; i++){ // Recorriendo todas las posiciones del arrayList, ya no 0 porque hemos asumido que el tiene la mayor edad
            CUsuario usuario = usuariosLista.get(i);
            if(usuarioMayor.getEdad() < usuario.getEdad()) // Si el usuario que estoy consultando
                //Tiene mayor edad al usuario que supuse como Mayor, intercambio
            {
                usuarioMayor = usuario;// Actualizo la variable usuarioMayor por la variable que estoy consultando
            }
        }

        System.out.println("El es el usuario mayor: " +usuarioMayor.getNombre());






    }

}
