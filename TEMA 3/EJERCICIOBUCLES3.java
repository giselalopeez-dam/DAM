/*Codificar el juego «el número secreto•, que consiste en acertar un número entre 1 y 100
(generado aleatoriamente). Para ello se introduce por teclado una serie de números, para
los que se indica: •mayor• o «menor», según sea mayor o menor con respecto al núme­ro secreto.
El proceso termina cuando el usuario acierta o cuando se rinde (introducien­do un -1).
 */

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOBUCLES3 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        Random random = new Random();
        int numeroRandom = random.nextInt(1, 101);// Esto si genera numeros del 1 al 100
        // int numeroRandom = random.nextInt(1, 100);// Esto si genera numeros del 1 al
        // 99

        int numeroUsuario;

        do {

            System.out.println("Di un numero entre el 1 y el 100 para adivinar cual es. Si te rindes, pon '-1'");
            numeroUsuario = usuario.nextInt();

            if (numeroUsuario == numeroRandom) {
                System.out.println("Has acertado, enhorabuena. El numero secreto era " + numeroRandom);
            }

            if (numeroUsuario > numeroRandom) {

                System.out.println("El numero secreto es menor al que has introducido");

            } else {

                System.out.println("El numero secreto es mayor al que has introducido");

            }

        } while (numeroUsuario == -1 && numeroUsuario != numeroRandom);

        usuario.close();
    }
}
