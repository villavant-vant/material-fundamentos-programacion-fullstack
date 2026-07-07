
public class RepetitivasBreak {
    public static void main(String[] args) {
        int numero = 10;
        while(numero > 0){
            System.out.println(numero); // 10
            numero--; // numero = 9
            if (numero == 5){
                break;
            }
        }
    }
}
