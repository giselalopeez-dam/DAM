/*Triángulo de asteriscos
Pide un número N y dibuja un triángulo: */

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        int numero = usuario.nextInt();

        for (int i = 1; i <= numero; i++) { // filas

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();
        }

        usuario.close();
    }
}
