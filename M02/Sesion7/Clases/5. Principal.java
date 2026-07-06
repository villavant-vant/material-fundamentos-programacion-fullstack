package Sesion7;

public class Principal {
    public static void main(String[] args) {
        CTriangulo a = new CTriangulo(6,7,6);
        CTriangulo b = new CTriangulo(10);
        CTriangulo c = new CTriangulo();

        System.out.println("=== INICIANDO CONSULTA ===");
        int perimetro = a.obtenerPerimetro();
        System.out.println("Lado 1: " + a.getLado1());
        System.out.println("Lado 2: " + a.getLado2());
        System.out.println("Lado 3: " + a.getLado3());
        System.out.println("Perimetro: " + perimetro);

        System.out.println("=== ACTUALIZANDO===");
        a.setLado1(20);
        System.out.println("Lado 1: " + a.getLado1());
        System.out.println("Lado 2: " + a.getLado2());
        System.out.println("Lado 3: " + a.getLado3());

        a.setLado2(10);
        System.out.println("Area: " + a.obtenerArea());


    }
}
