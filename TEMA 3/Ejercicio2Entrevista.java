/*Desarrolla un programa que dibuje una pirámide de asteriscos (*) basada en el número de niveles que ingrese el usuario.
El número máximo de niveles debe ser 10.
El programa debe validar que el número de niveles esté dentro del rango permitido (1 a 10).

Ejemplo: Para el nivel igual a 4


     *
    * *
   * * *
  * * * *

 */

import java.util.Scanner;

public class Ejercicio2Entrevista {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int niveles;

        do {

            System.out.println("Ponga un numero y le dibujamos una piramide de asteriscos, no mas de 10");
            niveles = usuario.nextInt();

            if (niveles < 1 || niveles > 10) {
                System.out.println("Error. Debe ser entre el 1 y el 10");
            } else {

                for (int i = 1; i <= niveles; i++) {

                    for (int j = 1; j <= niveles - i; j++) {

                        System.out.print(" ");

                    }

                    for (int j = 1; j <= i; j++) {

                        System.out.print("* ");
                    }

                    System.out.println();

                }

            }

        } while (niveles < 1 || niveles > 10);

        usuario.close();

    }
}
