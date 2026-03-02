/*1. Potencia
Crear un método recursivo potencia(int base, int exponente) sin usar Math.pow().
Ejemplo:
potencia(4, 5);
 */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca el numero base y el exponente");
        int base = usuario.nextInt();
        int exponente = usuario.nextInt();

        int resultado = potencia(base, exponente);

        System.out.println("El resultado es: " + resultado);

        usuario.close();
    }

    private static int potencia(int base, int exponente) {

        if (exponente == 1) {

            return base;

        }

        return base * potencia(base, exponente - 1);
    }
}