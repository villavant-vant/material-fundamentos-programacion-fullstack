package Sesion8.Herencia;

// Clase hija - Motocicleta
class Motocicleta extends Vehiculo {
    // Atributo adicional específico de Motocicleta
    private int cilindrada;

    // Constructor que llama al constructor de la clase padre
    public Motocicleta(String marca, String modelo, int año, String color, int cilindrada) {
        super(marca, modelo, año, color); // Llamada al constructor padre
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método del padre
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo: Motocicleta");
    }

    @Override
    public void acelerar() {
        System.out.println("La moto acelera rápidamente");
    }

    // Getter específico
    public int getCilindrada() { return cilindrada; }
}