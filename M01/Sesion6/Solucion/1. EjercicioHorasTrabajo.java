package S5S6;

public class EjercicioHorasTrabajo {
    public static void main(String[] args) {
        int[] horas = {8, 6, 8, 0, 8, 4, 0};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        imprimirArreglo(horas);
        int horasTotales = calcularTotalHoras(horas);
        System.out.println("Total horas: " + horasTotales);

        int diaMaximo = encontrarDiaMaximo(horas);
        System.out.println("Dia maximo: " + (diaMaximo) + " " + dias[diaMaximo-1]);


        int diasLibre = contarDiasLibres(horas);
        System.out.println("Dias libre: " + diasLibre);

    }
    public static void imprimirArreglo(int[] horas){
        System.out.print("Horas trabajadas: ");
        System.out.print("[");
        for(int i = 0; i < horas.length; i++){
            if(i != horas.length - 1)
                System.out.print(horas[i] + ", ");
            else
                System.out.print(horas[i]);
        }
        System.out.println("]");
    }
    public static int calcularTotalHoras(int[] horas){
        int sumatoria = 0;
        for(int i = 0; i < horas.length; i++){
            sumatoria = sumatoria +  horas[i];
        }
        return sumatoria;
    }

    //    int[] horas = {8, 6, 8, 0, 8, 4, 0};
    public static int[] encontrarDiaMaximo(int[] horas){
        int indiceHorasMaximo = 0;
        int horasMaximo = horas[0];
        int[] diasMaximo = new int[horas.length];

        for(int i = 1; i < horas.length; i++){
            if(horas[i] > horasMaximo){ // i=2 ->  horas[2] ->    8 > 8  --
                horasMaximo = horas[i]; // horasMaximo = 8
                indiceHorasMaximo = i;  // i = 0
            }
        }

        return diasMaximo; // 7
    }

    public static int contarDiasLibres(int[] horas){
        int contador = 0;
        for(int i = 0; i < horas.length; i++){
            if(horas[i] == 0){ // 0 == 0   Verdad
                contador++; // contador = 2
            }
        }
        return contador; // 2
    }
}
