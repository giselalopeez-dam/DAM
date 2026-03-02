/*Ejercicio 5.3

Escribir una aplicación que solicite al usuario cuantos números desea introducir. 
A continuación, introducir por teclado esa cantidad de números enteros, y por ultimo, mostrarlos en orden inverso.
 */

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Cuantos numeros quiere introducir");

        int solicitudNumeros = usuario.nextInt();

        int[] enteros = new int[solicitudNumeros];

        for (int i = 0; i < solicitudNumeros; i++) {

            System.out.println("Introduzca el numero entero");

            enteros[i] = usuario.nextInt();

        }

        for (int i = enteros.length - 1; i >= 0; i--) {

            System.out.println(enteros[i]);

        }

        usuario.close();

    }
}
