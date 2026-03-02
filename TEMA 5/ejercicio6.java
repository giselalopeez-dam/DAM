/*Ejercicio 5.2

Diseñar un programa que solicite al usuario que introduzca por teclado 5 números deci­males. 
A continuación, mostrar los números en el mismo orden que se han introducido.
 */

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        double[] arreglo = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Introduzca 1 numero decimal");

            arreglo[i] = usuario.nextDouble();

        }

        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + ". " + arreglo[i]);

        }

        usuario.close();

    }
}
