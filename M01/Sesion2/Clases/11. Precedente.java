package S2;

public class Precedente {
    public static void main(String[] args) {
        int resultado = 10 + 5*2 -8/4; // 18
        System.out.println("Precio: " + resultado);

        resultado = 4 + 2 * 3; // 10
        System.out.println(resultado);
        resultado = (4 + 2) * 3; // 18
        System.out.println(resultado);


        resultado = 10 + 6 % 4; // 12
        System.out.println(resultado);

        resultado = 8 + 2 * 5 - (6 / 3) + 4 % 3;
        // 17;
        System.out.println(resultado);
    }

}
