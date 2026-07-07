

import java.util.ArrayList;

// La clase CBiblioteca tiene relacion con la clase CLibro
// Porque la clase CBiblioteca tiene un ArrayList de CLibro

public class CBiblioteca {
    private String nombre;
    private ArrayList<CLibro> librosLista = new ArrayList<CLibro>(); // Aqui esta la agregacion
    // librosLista es el nombre del atributo, y este atributo es de tipo ArrayList<CLibro>

    //Constructor 1
    public CBiblioteca(String nombre){
        this.nombre = nombre;
    }
    //Constructor 2
    public CBiblioteca(String nombre, ArrayList<CLibro> librosLista){
        this.nombre = nombre;
        this.librosLista = librosLista;
    }
    //Constructor 3
    public CBiblioteca(){
        this.nombre = "Biblioteca Central";
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    } //Obtiene el atributo nombre que es un String

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  // Actualiza el atributo nombre con un parametro de tipo String

    public ArrayList<CLibro> getLibrosLista() {
        return librosLista;
    } //get- Obtiene el atributo librosLista el cual es un ArrayList<CLibro>

    public void setLibrosLista(ArrayList<CLibro> librosLista) {
        this.librosLista = librosLista;
    } // set- actualiza el atributo librosLista con un parametro de tipo ArrayList<CLibro>

    //Necesito un metodo que me permita agregar objetos de tipo libro al ArrayList<CLibro>
    public void agregarLibro(CLibro libro){
        librosLista.add(libro); // agregando a la lista de ArrayList<CLibro>
        System.out.println("Libro agregado exitosamente");
    }

    public void eliminarLibro(int posicion){
        librosLista.remove(posicion);
    }

//    public boolean  buscarLibroXTitulo(String titulo){
//        boolean resultado = false;
//        for(int i = 0; i < librosLista.size(); i++){
//            CLibro libroConsultado = librosLista.get(i); // Esta obteniendo el objeto en la posicion i
//            String tituloConsultado = libroConsultado.getTitulo();
//            if(titulo.equals(tituloConsultado)){ // utilizando el equal en vez del == solo para String
//                resultado = true;
//                break;
//            }
//        }
//        return resultado; // Si encontro devolvera True, si no encuentra False
//    }

    public int buscarLibroXTitulo(String titulo){
        int indice = -1;
        for(int i = 0; i < librosLista.size(); i++){
            CLibro libroConsultado = librosLista.get(i); // Esta obteniendo el objeto en la posicion i
            String tituloConsultado = libroConsultado.getTitulo();
            if(titulo.equals(tituloConsultado)){ // utilizando el equal en vez del == solo para String
                indice = i;
                break;
            }
        }
        return indice; // Si encontro devolvera el indice(i), si no encuentra -1
    }

    public int buscarLibroXAutor(String autor){
        int indice = -1;
        for(int i = 0; i < librosLista.size(); i++){
            CLibro libroConsultado = librosLista.get(i); // Esta obteniendo el objeto en la posicion i
            String autorConsultado = libroConsultado.getAutor();
            if(autor.equals(autorConsultado)){ // utilizando el equal en vez del == solo para String
                indice = i;
                break;
            }
        }
        return indice; // Si encontro devolvera el indice(i), si no encuentra -1
    }


}
