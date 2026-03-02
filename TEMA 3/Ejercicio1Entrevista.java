/*Crea un programa que permita al usuario adivinar un número secreto entre 1 y 100. 
El programa debe dar al usuario un máximo de 5 intentos para adivinar el número correcto.
 Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número secreto. 
 Si el usuario acierta el número, el programa debe felicitarlo y terminar. 
 Si el usuario no acierta después de 5 intentos, el programa debe mostrar un mensaje indicando que se ha perdido
y revelar el número secreto */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1Entrevista {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int teclado;
        Random numero = new Random();
        int numeroRandom = numero.nextInt(1, 101);
        int intentos = 0;
        System.out.println("Adivina el numero secreto del 1 al 100. Tienes solo 5 intentos");

        do {

            teclado = usuario.nextInt();

            if (teclado < numeroRandom) {

                System.out.println("El numero secreto es mayor");

            } else {

                System.out.println("El numero secreto es menor");
            }

            if (teclado == numeroRandom) {

                System.out.println("Enhorabuena, has acertado. El programa acaba aquí");

            }

            intentos++;

            if (intentos == 5) {
                System.out.println("Has superado el numero de intentos. El numero era " + numeroRandom);

            }

        } while (teclado != numeroRandom && intentos != 5);

        usuario.close();

    }
}
