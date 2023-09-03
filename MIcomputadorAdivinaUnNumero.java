import java.util.Scanner;

public class MIcomputadorAdivinaUnNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int minimo = 0;
            int maximo = 100;
            int intentos = 0;

            System.out.println("Piensa en un número entre 0 y 100");

            while (true) {
                int adivinanza = (minimo + maximo) / 2;
                System.out.print("Intento " + (intentos + 1) + ": " + adivinanza + " ");
                System.out.print("(ingresa <, >, o =): ");
                String respuesta = scanner.nextLine();
                intentos++;

                if (respuesta.equals("<")) {
                    maximo = adivinanza - 1;
                } else if (respuesta.equals(">")) {
                    minimo = adivinanza + 1;
                } else {
                    System.out.println("Adiviné en " + intentos + " intentos");
                    break;
                }
            }
        }
    }
}
