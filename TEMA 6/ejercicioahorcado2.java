import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicioahorcado2 {
    public static void main(String[] args) {

        String[] palabras = { "perro", "pato", "manzana", "pera", "thiago" };

        Scanner usuario = new Scanner(System.in);

        Random random = new Random(System.currentTimeMillis());

        int intento = 0;

        int posicionAleatoria = random.nextInt(palabras.length);

        String palabrasSecreta = palabras[posicionAleatoria];

        char[] letrasVisibles = new char[palabrasSecreta.length()];
        Arrays.fill(letrasVisibles, '_');

        String palabraString = new String(letrasVisibles);

        System.out.println("MUCHA SUERTE");
        System.out.println("La palabra secreta tiene los siguientes espacios: ");

        while (palabraString.contains("_")) {
            System.out.println(palabraString);
            System.out.println("Escribe una letra");
            String letraUsuarioS = usuario.nextLine();

            char letraUsuarioC = letraUsuarioS.toLowerCase().charAt(0);

            boolean letraEncontrada = false;

            for (int i = 0; i < palabrasSecreta.length(); i++) {
                if (palabrasSecreta.charAt(i) == letraUsuarioC) {

                    letraEncontrada = true;
                    letrasVisibles[i] = letraUsuarioC;

                }

                palabraString = new String(letrasVisibles);

                if (letraEncontrada) {
                    System.out.println("Ha encontrado una letra");
                } else {
                    System.out.println("No ha encontrado la letra. Siga intentandolo");
                }

                intento++;

            }

            System.out.println("¡¡¡ ENHORABUENA !!!");
            System.out.println("Ha encontrado la palabra. Era " + palabrasSecreta);
            System.out.println("Lo ha conseguido en " + intento + " intentos");

            usuario.close();
        }
    }
}
