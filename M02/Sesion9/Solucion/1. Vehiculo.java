package Sesion8.Herencia;


class Vehiculo {
    // Atributos protegidos para que las clases hijas puedan acceder
    protected String marca;
    protected String modelo;
    protected int año;
    protected String color;

    // Constructor parametrizado
    public Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public void mostrarInfo() {
        System.out.println("=== Información del Vehículo ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando...");
    }

    // Getters para acceder a los atributos desde fuera de la clase
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public String getColor() { return color; }
}
