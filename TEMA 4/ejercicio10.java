/*Factorial
Pide un número y calcula su factorial usando un bucle. */

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ponga un numero y le damos su factorial");
        int numero = usuario.nextInt();
        int multiplicacion = 1;

        for (int i = 1; i <= numero; i++) {

            multiplicacion = multiplicacion * i;

        }

        System.out.println("El factorial de " + numero + " es: " + multiplicacion);
        usuario.close();
    }
}
