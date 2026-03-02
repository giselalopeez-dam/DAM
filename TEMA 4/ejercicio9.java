/* Adivinar el número
El ordenador genera un número aleatorio del 1 al 100. El usuario debe adivinarlo.
Indica “mayor” o “menor” hasta acertar. Usa un bucle do-while.*/

import java.util.Random;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        Random random = new Random();
        int numeroRandom = random.nextInt(1, 101);

        int numero;

        System.out.println("Adivine el numero entre 1 y 100, si te rindes pon 0");

        do {

            numero = usuario.nextInt();

            if (numero < 0) {

                System.out
                        .println("Escriba un numero mayor a 0 para adivinar el numero secreto o 0 si quiere rendirse");

            } else if (numero == 0) {

                System.out.println("Te has rendido. El numero era: " + numeroRandom);
            } else {

                if (numero < numeroRandom) {

                    System.out.println("El numero secreto es mayor que lo que puso");

                } else if (numero > numeroRandom) {

                    System.out.println("El numero secreto es menor de lo que puso");

                } else {

                    System.out.println("Enhorabuena, si, el numero secreto era: " + numeroRandom);

                }
            }

        } while (numero != 0 && numero != numeroRandom);

        usuario.close();
    }
}
