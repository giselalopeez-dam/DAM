/*Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si
es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0
 */

import java.util.Scanner;

public class EJERCICIOBUCLES1 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int numero;

        do {
            System.out.println(
                    "Introduce un numero entero y te digo si es par, positivo y su cuadrado. Cuando quieras finalizar, pon '0'");
            numero = usuario.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {

                    System.out.println("Es par");

                } else {

                    System.out.println("Es impar");

                }

                if (numero > 0) {

                    System.out.println("Su numero es positivo");

                } else {

                    System.out.println("Su numero es negativo");

                }

                System.out.println("El cuadrado de su numero es " + numero * numero);

            }

        } while (numero != 0);

        usuario.close();
    }
}
