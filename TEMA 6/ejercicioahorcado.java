import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicioahorcado {
    public static void main(String[] args) {

        // String[] palabras = { "perro", "pato", "manzana", "pera", "thiago" };

        String[] palabras = new String[5];

        Scanner usuario = new Scanner(System.in);

        for (int i = 0; i < palabras.length; i++) {

            String auxiliarNombres = usuario.nextLine();

            while (auxiliarNombres.isEmpty() || auxiliarNombres.contains(" ")) {
                if (auxiliarNombres.isEmpty()) {

                }

                auxiliarNombres = usuario.nextLine();
            }

            palabras[i] = auxiliarNombres;

        }

        int intentos = 5;

        Random random = new Random();

        int posicionAleatoria = random.nextInt(palabras.length);

        String palabraSecreta = palabras[posicionAleatoria];

        char[] letrasVisibles = new char[palabraSecreta.length()];
        Arrays.fill(letrasVisibles, '_');

        String palabraString = new String(letrasVisibles);

        System.out.println("La palabra tiene estos huecos: ");

        while (palabraString.contains("_")) {
            System.out.println(palabraString);
            System.out.println("Escriba una letra");
            String letrasUsuarioS = usuario.nextLine();

            char letraUsuarioC = letrasUsuarioS.charAt(0);

            boolean letraEncontrada = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letraUsuarioC) {
                    letraEncontrada = true;
                    letrasVisibles[i] = letraUsuarioC;
                }
            }

            palabraString = new String(letrasVisibles);

            if (letraEncontrada) {
                System.out.println("Has encontrado una letra.");
            } else {
                System.out.println("No has encontrado la letra. Sigue intentandolo");
            }

            intentos--;

            if (intentos == 0) {

            }
        }

        System.out.println("Has acertado todas las letras. La palabra era " + palabraSecreta);
        System.out.println("Lo has encontrado en " + intentos + " intentos");

        usuario.close();
    }
}