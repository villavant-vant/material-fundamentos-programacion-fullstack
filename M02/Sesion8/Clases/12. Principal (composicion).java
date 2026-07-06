package Sesion8.Composicion;

public class Principal {
    public static void main(String[] args) {
        CCasa miCasa = new CCasa("Av. Principal 123");
        miCasa.mostrarPlanos();

        // Si eliminamos la casa (miCasa = null),
        // las habitaciones también se eliminan automáticamente
    }
}
