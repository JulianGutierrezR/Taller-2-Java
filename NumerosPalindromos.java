import java.util.Scanner;

public class NumerosPalindromos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            if (esPalindromo(numero)) {
                System.out.println(numero + " es palíndromo");
            } else {
                System.out.println(numero + " no es palíndromo");
            }
        }
    }

    public static boolean esPalindromo(int numero) {
        String numeroString = Integer.toString(numero);
        String numeroReverso = new StringBuilder(numeroString).reverse().toString();
        return numeroString.equals(numeroReverso);
    }
}
