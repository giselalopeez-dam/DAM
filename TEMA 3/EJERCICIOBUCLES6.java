/*Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos
los números del 1 a n.
 */

import java.util.Scanner;

public class EJERCICIOBUCLES6 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int contador = 1;

        System.out.println(
                "Ponga un número (empezando desde el 1) y le mostraré todos los números antes de llegar a ese número");
        int numero = usuario.nextInt();
        System.out.println("El contador del numero " + numero + " es: ");

        do {
            if (numero <= 0) {
                System.out.println("El numero debe ser mayor de 0");

            }
            System.out.println(contador);
            contador++;

        } while (contador < numero);

        usuario.close();
    }
}
