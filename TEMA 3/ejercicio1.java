/*Diseñar la función eco () a la que se le pasa como parámetro un número n, 
y muestra por pantalla n veces el mensaje “Eco …”. */

import java.util.Scanner;

public class ejercicio1 {

    private static void eco(int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = usuario.nextInt();
        eco(n);

        usuario.close();
    }
}