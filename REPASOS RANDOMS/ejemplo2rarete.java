/* Crea una función que muestre por consola una serie de números aleatorios enteros.
(Para ello utilizar la función Math.random o el objeto Random)

Los parámetros de la función serán: la cantidad de números aleatorios que se 
mostrarán y los valores enteros mínimos y máximos que estos pueden tomar.

void mostrarRangoAleatorio(int cantidad, int inicio, int fin) // números enteros
Ejemplo: Para la 1º funcion, cantidad = 5,inicio = 1, final = 10, 2, 4, 1, 6, 9

void mostrarRangoAleatorio(int cantidad) // Entre 0 y 1 , y solo numeros decimales
Ejemplo: Para la 2º funcion, cantidad = 5, 0.2, 0.34, 0.4, 0.1, 0.6

Después de esto haz una sobrecarga de la función anterior, 
para que el único pa­rámetro sea la cantidad de números aleatorios que se 
muestra por consola. Los números
aleatorios que se generan/devuelven serán reales y estarán comprendidos entre 
0 y 1, solo se acepta como parámetro la cantidad de números a generar.
*/

// preguntar si puedo hacer como en el ejercicio 1 de la entrevista private static void leerEntradaUsuario().
// preguntar sobre tener varios Scanners

import java.util.Random;
import java.util.Scanner;

public class ejemplo2rarete {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que quiera de numeros");
        int cantidad;

        do {

            cantidad = usuario.nextInt();

            if (cantidad <= 0) {

                System.out.println("No, ponga una cantidad mayor de 0");

            }

        } while (cantidad <= 0);

        System.out.println("Desde que numero quiere empezar a generar numeros");
        int inicio = usuario.nextInt();
        System.out.println("Desde que numero quiere terminar de generar numeros");
        int fin = usuario.nextInt();

        mostrarRangoAleatorio(cantidad, inicio, fin);
        mostrarRangoAleatorio(cantidad);
    }

    private static void mostrarRangoAleatorio(int cantidad, int inicio, int fin) {

        if (inicio > fin) {

            int aux = inicio;
            inicio = fin;
            fin = aux;

        }

        for (int i = 1; i <= cantidad; i++) {

            int numeroRandom = (int) (Math.random() * (fin - inicio + 1) + inicio);

            System.out.println(numeroRandom);
        }

    }

    private static void mostrarRangoAleatorio(int cantidad) {

        for (int i = 1; i <= cantidad; i++) {

            double numeroRandom = Math.random() / 10;

            System.out.println(numeroRandom);

            // preguntar como acortar el double
        }
    }

    /*
     * private static int validarCantidadDecimales(int cantidad) {
     * 
     * Scanner usuario = new Scanner(System.in);
     * 
     * do {
     * 
     * System.out.println(
     * "Ingrese la cantidad de números que quieres generar (se generaran numeros desde el 0 hasta el 1):"
     * );
     * cantidad = usuario.nextInt();
     * 
     * if (cantidad <= 0) {
     * 
     * System.out.println("No, ponga una cantidad mayor de 0");
     * 
     * }
     * } while (cantidad <= 0);
     * 
     * return cantidad;
     * 
     * }
     */

}
