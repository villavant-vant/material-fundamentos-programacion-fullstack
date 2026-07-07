
import java.util.ArrayList;

public class CCasa {
    private String direccion;
    private ArrayList<CHabitacion> habitaciones;

    public CCasa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        crearHabitacionesBasicas();
    }

    // Método privado para crear habitaciones básicas
    private void crearHabitacionesBasicas() {
        CHabitacion c1 = new  CHabitacion("Sala", 25.0, 2);
        CHabitacion c2 = new  CHabitacion("Cocina", 25.0, 2);
        CHabitacion c3 = new  CHabitacion("Dormitorio", 25.0, 2);
        CHabitacion c4 = new  CHabitacion("Banio", 25.0, 2);
        habitaciones.add(c1);
        habitaciones.add(c2);
        habitaciones.add(c3);
        habitaciones.add(c4);

    }

    // Agregar habitación adicional
    public void agregarHabitacion(String tipo, double area, int ventanas) {
        CHabitacion nueva = new CHabitacion(tipo, area, ventanas);
        habitaciones.add(nueva);
        System.out.println("Se agregó: " + tipo);
    }

    public void mostrarPlanos() {
        System.out.println("\n🏠 CASA EN: " + direccion);
        System.out.println("Habitaciones:");

        double areaTotal = 0;
        for (CHabitacion hab : habitaciones) {
            hab.mostrarInfo();
            areaTotal += hab.getArea();
        }

        System.out.println("Área total: " + areaTotal + "m²");
    }

    public int getCantidadHabitaciones() {
        return habitaciones.size();
    }
}
