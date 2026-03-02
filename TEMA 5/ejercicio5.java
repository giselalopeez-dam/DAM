/*Ejercicio 5.1

Crear un array de longitud 10 que se inicializará con números aleatorios comprendidos en­tre 1 y 100. 
Mostrar la suma de todos los números aleatorios que se guardan en el array.
 */

import java.util.Random;

public class ejercicio5 {

    public static void main(String[] args) {

        Random random = new Random();

        int suma = 0;

        int[] numeroAleatorio = new int[10];

        for (int i = 0; i < numeroAleatorio.length; i++) {

            numeroAleatorio[i] = random.nextInt(1, 101);

            suma += numeroAleatorio[i];

        }

        for (int i = 0; i < numeroAleatorio.length; i++) {

            System.out.print(numeroAleatorio[i] + " ");
        }

        System.out.println(" El resultado de la suma es: " + suma);
    }
}