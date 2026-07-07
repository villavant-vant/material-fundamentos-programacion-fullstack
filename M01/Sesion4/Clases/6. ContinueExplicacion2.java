
import java.util.Scanner;

class ContinueExplicacion2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cantidadVentas = sc.nextInt(); // 6
        double sumatoria = 0;

        for(int i=1; i<=cantidadVentas; i++){
            System.out.println("Ingresar valor de la venta" + i);
            double monto = sc.nextDouble(); // 90
            if (monto<100){
                continue;
            }
            sumatoria = sumatoria + monto;
        }
        System.out.println("La sumatoria es: " + sumatoria);
    }
}
