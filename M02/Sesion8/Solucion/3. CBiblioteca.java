package Sesion8.ArrayList.Ejercicio;

import java.util.ArrayList;

public class CBiblioteca {
    private String nombre;
    private ArrayList<CLibro> libros = new ArrayList<CLibro>();

    public CBiblioteca(String nombre) {
        this.nombre = nombre;
    }
    public void agregarLibros(CLibro libro){ // Se esta implementando la agregacion
        libros.add(libro);   // Estamos agregando el objeto libro al array libros.
    }
    public void mostrarLibros(){
        for(int i = 0; i < libros.size(); i++){
            System.out.println("LIBRO #"+ (i+1) );
            System.out.println("Titulo:" + libros.get(i).getTitulo());
            System.out.println("Autor:" + libros.get(i).getAutor());
            System.out.println("ID:" + libros.get(i).getId());
        }
    }
    public void removerLibro(int posicion){
        libros.remove(posicion);
    }

    public boolean buscarLibro(String titulo){
        boolean respuesta = false;
        for(int i = 0; i < libros.size(); i++){
            CLibro aux = libros.get(i);
            String auxTitulo = aux.getTitulo().toLowerCase();
            if(auxTitulo.equals(titulo.toLowerCase())){
                  respuesta = true;
                  break;
            }
        }
        return respuesta;
    }
//    aux.getTitulo() = ABC -> abc
// titulo = aBc -> abc





}
