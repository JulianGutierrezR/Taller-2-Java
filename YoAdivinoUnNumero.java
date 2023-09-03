import java.util.Random;
import java.util.Scanner;

public class YoAdivinoUnNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(101);
        try (Scanner scanner = new Scanner(System.in)) {
            int intentos = 0;

            System.out.println("Adivina el número entre 0 y 100");

            while (true) {
                System.out.print("Intento " + (intentos + 1) + ": ");
                int adivinanza = scanner.nextInt();
                intentos++;

                if (adivinanza < numero) {
                    System.out.println("Es mayor que " + adivinanza);
                } else if (adivinanza > numero) {
                    System.out.println("Es menor que " + adivinanza);
                } else {
                    System.out.println("Correcto. Adivinaste en " + intentos + " intentos");
                    break;
                }
            }
        }
    }
}
