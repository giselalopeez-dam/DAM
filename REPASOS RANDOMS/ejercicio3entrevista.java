/*Escribe una función recursiva sumaDigitos que reciba un número entero positivo y 
devuelva la suma de sus dígitos.

Ejemplo: Para el número 456, la función debería devolver 4+5+6=15. */

import java.util.Scanner;

public class ejercicio3entrevista {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Di un numero ");
        int n = usuario.nextInt();
        int resultado = sumaDigitos(n);
        System.out.println("El resultado es: " + resultado);

        usuario.close();

    }

    private static int sumaDigitos(int n) {

        if (n == 0) {

            return 0;
        } else {

            return n % 10 + sumaDigitos(n / 10);
        }

    }

    // el resto de n, lo sumas al cociente de n y así sucesivamente hasta que sea 0
    // y corte el retorno. chiklin
}
