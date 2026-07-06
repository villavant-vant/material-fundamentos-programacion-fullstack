package Sesion7.Ejercicio;

public class CProducto {
    // Atributos
    private String nombre;
    private double precio;
    private int stock;

    // Constructor 1
    public CProducto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Constructor 2
    public CProducto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 100;
    }
    // Constructor 3
    public CProducto(String nombre) {
        this.nombre = nombre;
        this.precio = 19.90;
        this.stock = 200;
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Metodos
    public void mostrarInfo(){
        System.out.println("---------PRODUCTO----------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
    public double aplicarDescuento(double descuento){
        double precioFinal = precio - precio*descuento;
        return precioFinal;
    }
}
