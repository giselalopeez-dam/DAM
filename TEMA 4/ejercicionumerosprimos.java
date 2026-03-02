/*Números primos
Pide un número N y muestra todos los números primos entre 1 y N. */

import java.util.Scanner;

public class ejercicionumerosprimos {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int n = usuario.nextInt();

        for (int num = 2; num <= n; num++) { // Recorre todos los números

            int divisores = 0;

            for (int i = 1; i <= num; i++) { // Cuenta divisores de ese número
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) { // Si tiene solo 2 divisores → primo
                System.out.println(num);
            }
        }

        usuario.close();
    }
}

/*
 * if (n <= 1)
 * return false;
 * 
 * for (int i = 2; i * i <= n; i++) {
 * if (n % i == 0)
 * return false;
 * }
 * 
 * return true;
 */
