import java.util.Scanner;

public class TiempoDeViaje {
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int[] tiempos = new int[100]; // suponemos que el viaje tiene menos de 100 tramos
            int i = 0;

            while (true) {
                System.out.print("Duracion tramo: ");
                int tiempo = scnr.nextInt();
                if (tiempo == 0) {
                    break;
                }
                tiempos[i] = tiempo;
                i++;
            }

            int tiempoTotal = calcularTiempoTotal(tiempos, i);

            int horas = tiempoTotal / 60;
            int minutos = tiempoTotal % 60;

            System.out.printf("Tiempo total de viaje: %d:%02d horas", horas, minutos);
        }
    }

    public static int calcularTiempoTotal(int[] tiempos, int n) {
        int tiempoTotal = 0;
        for (int i = 0; i < n; i++) {
            tiempoTotal += tiempos[i];
        }
        return tiempoTotal;
    }
}