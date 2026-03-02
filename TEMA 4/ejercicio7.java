/*Tabla de multiplicar
Pide un número y muestra su tabla de multiplicar del 1 al 10. */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca un numero y le mostramos su tabla de multiplicar");

        int numero = usuario.nextInt();
        int multiplicar = 0;

        for (int i = 1; i <= 10; i++) {

            multiplicar = numero * i;

            System.out.println(numero + " x " + i + " = " + multiplicar);

        }

        usuario.close();
    }
}
