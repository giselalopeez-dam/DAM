/*2. Número invertido
Crea una función recursiva que reciba un número entero y devuelva el mismo número pero invertido.
Ej: 1234 → 4321
 */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiere invertir");
        int numero = usuario.nextInt();

        int resultado = numeroEntero(numero);
        System.out.println("El resultado es: " + resultado);

        usuario.close();
    }

    private static int numeroEntero(int numero) {

        if (numero < 10) {
            return numero;
        }

        int restoInvertido = numeroEntero(numero / 10);
        int ultimo = numero % 10;

        // Encontrar dónde colocar 'ultimo'
        int multiplicador = 1;

        while (restoInvertido >= multiplicador) {
            multiplicador *= 10;
        }

        return ultimo * multiplicador + restoInvertido;
    }

}
