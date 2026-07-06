package Sesion8.Herencia;

// Clase hija - Auto
class Auto extends Vehiculo {
    // Atributo adicional específico de Auto
    private int numeroPuertas;

    // Constructor que llama al constructor de la clase padre
    public Auto(String marca, String modelo, int año, String color, int numeroPuertas) {
        super(marca, modelo, año, color); // Llamada al constructor padre
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método del padre
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Tipo: Automóvil");
    }

    @Override
    public void acelerar() {
        System.out.println("El auto acelera suavemente");
    }

    // Getter específico
    public int getNumeroPuertas() { return numeroPuertas; }
}