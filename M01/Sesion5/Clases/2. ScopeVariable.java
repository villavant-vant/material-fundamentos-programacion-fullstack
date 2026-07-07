
public class ScopeVariable {

    public static void main(String[] args) {
        int edad = 10;
        int resultado = incrementarEdad(17);
        System.out.println(resultado);
    }

    public static int incrementarEdad(int edad){
        edad++;
        return edad;
    }
}
