package S5S6;


public class EjercicioClase {

    public static int calcularTotalHoras(int[] horas) {
        int total = 0;
        for (int i = 0; i < horas.length; i++) {
            total += horas[i];
        }
        return total;
    }

    // Método para encontrar el día con más horas trabajadas
    public static int encontrarDiaMaximo(int[] horas) {
        int diaMaximo = 1; // Empezamos con el primer día (Lunes = 1)
        int horasMaximas = horas[0];

        return diaMaximo;
    }


    public static int contarDiasLibres(int[] horas) {
        int diasLibres = 0;

        return diasLibres;
    }


    public static void mostrarHoras(int[] horas) {

    }

    public static void main(String[] args) {
        // Crear el array con las horas trabajadas en la semana
        int[] horasSemanales = {8, 6, 8, 0, 8, 4, 0};

        // Mostrar las horas
        mostrarHoras(horasSemanales);

        // Calcular y mostrar el total de horas
        int totalHoras = calcularTotalHoras(horasSemanales);
        System.out.println("Total horas: " + totalHoras);

        // Encontrar el día con más trabajo
        int diaMaximo = encontrarDiaMaximo(horasSemanales);
        String[] nombresDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println("Día con más trabajo: " + diaMaximo + " (" + nombresDias[diaMaximo-1] + ")");

        // Contar días libres
        int diasLibres = contarDiasLibres(horasSemanales);
        System.out.println("Días libres: " + diasLibres);
    }
}
