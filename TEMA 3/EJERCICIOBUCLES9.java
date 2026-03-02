/*Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando para ello asteriscos(*). Por ejemplo, paran= 4:
* * * *
* * *
* *
*
*/

import java.util.Scanner;

public class EJERCICIOBUCLES9 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Pon un numero entero para dibujar un triangulo rectangulo en base a ese numero con '*'");
        int asterisco = usuario.nextInt();
        int i;

        for (i = asterisco; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

        usuario.close();

    }
}
