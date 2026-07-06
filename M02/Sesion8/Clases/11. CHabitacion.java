package Sesion8.Composicion;

// Clase Habitacion
public class CHabitacion {
    private String tipo;
    private double area;
    private int ventanas;

    public CHabitacion(String tipo, double area, int ventanas) {
        this.tipo = tipo;
        this.area = area;
        this.ventanas = ventanas;
    }
    public void mostrarInfo() {
        System.out.println("- " + tipo + ": " + area + "m² (" + ventanas + " ventanas)");
    }

    // getters
    public String getTipo() { return tipo; }
    public double getArea() { return area; }
}



