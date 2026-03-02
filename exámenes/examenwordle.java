import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class examenwordle {

    public static void main(String[] args) {

        String[] palabras = { "novia", "frito", "tinto", "mixto", "dicto", "listo", "masas" };

        Random random = new Random();
        Scanner usuario = new Scanner(System.in);

        int intentos = 10;

        String palabraSecreta = palabras[random.nextInt(palabras.length)];

        char[] progreso = new char[5];
        Arrays.fill(progreso, '_');

        String progresoString = new String(progreso);

        while (intentos > 0) {

            System.out.println("Ingresa una palabra de 5 letras");
            String palabraIngresada = usuario.next().toLowerCase();

            if (palabraIngresada.length() != 5) {
                System.out.println("La palabra debe tener 5 letras.");
                continue;
            }

            if (palabraIngresada.equals(palabraSecreta)) {
                System.out.println("Has acertado. La palabra era: " + palabraSecreta);
                return;
            }

            for (int i = 0; i < palabraSecreta.length(); i++) {

                char letra = palabraIngresada.charAt(i);

                for (int j = 0; j < palabraSecreta.length(); j++) {

                    if (letra == palabraSecreta.charAt(i)) {
                        progreso[i] = letra;
                    }
                }

                if (palabraSecreta.contains(String.valueOf(letra))) {
                    System.out.println("De la palabra que has ingresado, estas son las letras que aparecen: " + letra);

                }
            }

            progresoString = new String(progreso);
            System.out.println("Este es tu progreso: " + progresoString);

            intentos--;
            System.out.println("Te quedan " + intentos + " intentos");
        }

        System.out.println("Has perdido. La palabra era " + palabraSecreta);

        usuario.close();
    }
}
