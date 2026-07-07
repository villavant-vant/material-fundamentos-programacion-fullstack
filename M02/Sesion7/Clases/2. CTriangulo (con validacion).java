class CTriangulo {
    // Atributos
    public double lado1;
    private double lado2;
    private double lado3;

    //Metodos
    public CTriangulo(double lado1, double lado2, double lado3) {
        if (esTrianguloValido(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }
    }
    private boolean esTrianguloValido(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void mostrarInformacion() {
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
    }
}
