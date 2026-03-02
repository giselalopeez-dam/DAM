/* Contar pares e impares
Pide al usuario números hasta que introduzca un 0. Indica cuántos eran pares y cuántos impares.*/

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println(
                "Introduzca numeros y cuando te canses pon 0. Te digo cuantos son impares y cuantos son pares");

        int numero;
        int pares = 0;
        int impares = 0;

        do {

            numero = usuario.nextInt();

            if (numero != 0) {

                if (numero % 2 == 0) {

                    pares++;

                } else {

                    impares++;
                }

            } else {

                System.out.println("Chao pescao");

            }

        } while (numero != 0);

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);

        usuario.close();

    }
}
