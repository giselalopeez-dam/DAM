/*Escribir una función a la que se le pasen dos números enteros y muestre todos los números comprendidos entre ellos. */

import java.util.Scanner;

public class ejercicio2 {

    private static void Funcion(int a, int b) {

        // int absA = Math.abs(a);
        // int absB = Math.abs(a);
        // int diferencia = Math.abs(absA - absB); // NUMEROS ABSOLUTOS, LE QUITAMOS EL
        // - AL NUMERO NEGATIVO

        if (a == b) {

            System.out.println("Los números son iguales. No hay números comprendidos entre ellos");

        } else if (a > b) {

            if (a == b + 1) {

                System.out.println("Los números van seguidos uno de otro, no hay números comprendidos entre ellos");

            } else {

                System.out.println("El número o los números entre " + a + " y " + b + " son: ");
                for (int i = a - 1; i > b; i--) {

                    System.out.println(i);

                }
            }
        } else {

            if (b == a + 1) {

                System.out.println("Los números van seguidos uno de otro, no hay números comprendidos entre ellos");

            } else {

                System.out.println("El número o los números entre " + a + " y " + b + " son: ");
                for (int i = a + 1; i < b; i++) {

                    System.out.println(i);
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca dos números enteros y le decimos que números hay entre ellos ");
        int a = usuario.nextInt();
        int b = usuario.nextInt();

        Funcion(a, b);

        usuario.close();

    }
}

/*
 * do {
 * 
 * if (a < 0) {
 * 
 * System.out.
 * println("El primer numero es menor de 0. Introduzca el numero de nuevo");
 * a = usuario.nextInt();
 * 
 * }
 * 
 * } while (a < 0);
 * 
 * do {
 * 
 * if (b < 0) {
 * 
 * System.out.
 * println("El segundo numero es menor de 0. Introduzca el numero de nuevo");
 * b = usuario.nextInt();
 * 
 * }
 * 
 * } while (b < 0);
 */
