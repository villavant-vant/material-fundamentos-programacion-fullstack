package Sesion7.Ejercicio;

public class Principal {
    public static void main(String[] args) {
        CProducto p1 = new CProducto("TV",1999.50, 20);
        CProducto p2 = new CProducto("Laptop", 3000);
        CProducto p3 = new CProducto("Mochilas");

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();

        System.out.println("Precio inicial: " + p1.getPrecio());
        double precioActualizado = p1.aplicarDescuento(0.10);
        System.out.println("Precio con descuento: " + precioActualizado);
    }
}
