
public class CUsuario {
    //Atributos
    private String nombre;
    private int edad;
    private char genero;

    //Metodos
    // Constructor 1
    public CUsuario(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    // Constructor 2
    public CUsuario(String nombre){
        this.nombre = nombre;
        this.edad = 20;
        this.genero = 'M';
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
