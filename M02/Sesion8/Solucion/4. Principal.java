package Sesion8.ArrayList.Ejercicio;
public class Principal {
    public static void main(String[] args) {

        CBiblioteca bib = new CBiblioteca("Biblioteca nacional");
        CLibro lib1 = new CLibro("Paco Yunque", "Cesar Vallejo","CV1");
        CLibro lib2 = new CLibro("Las aventuras de Tom Sawayar", "MT","MT1");

        bib.agregarLibros(lib1);
        bib.agregarLibros(lib2);
        if(bib.buscarLibro("paco YUNQUE")){
            System.out.println("Libro encontrado");
        }
        else{
            System.out.println("Libro no encontrado");
        }

    }
}
