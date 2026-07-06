package Sesion8.Herencia;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE HERENCIA EN JAVA ===\n");

        // Crear instancia de Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 2023, "Blanco", 4);

        // Crear instancia de Motocicleta
        Motocicleta miMoto = new Motocicleta("Yamaha", "MT-07", 2024, "Azul", 689);

        // Demostrar herencia mostrando información
        System.out.println("1. INFORMACIÓN DE LOS VEHÍCULOS:");
        System.out.println("--------------------------------");
        miAuto.mostrarInfo();
        System.out.println();
        miMoto.mostrarInfo();
        System.out.println();

        // Demostrar polimorfismo con el método acelerar()
        System.out.println("2. DEMOSTRACIÓN DE POLIMORFISMO:");
        System.out.println("--------------------------------");
        System.out.print("Auto: ");
        miAuto.acelerar();
        System.out.print("Moto: ");
        miMoto.acelerar();
        System.out.println();

        // Demostrar que heredan atributos del padre
        System.out.println("3. ACCESO A ATRIBUTOS HEREDADOS:");
        System.out.println("--------------------------------");
        System.out.println("Marca del auto: " + miAuto.getMarca());
        System.out.println("Año del auto: " + miAuto.getAño());
        System.out.println("Marca de la moto: " + miMoto.getMarca());
        System.out.println("Año de la moto: " + miMoto.getAño());
        System.out.println();

        // Demostrar polimorfismo usando referencias del tipo padre
        System.out.println("4. POLIMORFISMO CON REFERENCIAS DEL PADRE:");
        System.out.println("------------------------------------------");
        Vehiculo[] vehiculos = {miAuto, miMoto};

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("Vehículo " + (i+1) + ":");
            vehiculos[i].acelerar(); // Llama al método sobrescrito correspondiente
            System.out.println("Es de marca: " + vehiculos[i].getMarca());
            System.out.println();
        }

        // Demostrar instanceof para verificar tipos
        System.out.println("5. VERIFICACIÓN DE TIPOS:");
        System.out.println("-------------------------");
        if (miAuto instanceof Vehiculo) {
            System.out.println("miAuto ES UN Vehiculo ✓");
        }
        if (miAuto instanceof Auto) {
            System.out.println("miAuto ES UN Auto ✓");
        }
        if (miMoto instanceof Vehiculo) {
            System.out.println("miMoto ES UN Vehiculo ✓");
        }
        if (miMoto instanceof Motocicleta) {
            System.out.println("miMoto ES UNA Motocicleta ✓");
        }
    }
}
