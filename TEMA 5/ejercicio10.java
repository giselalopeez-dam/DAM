/*Ejercicio 5.6

Invertir un array

Enunciado: Escribe un programa que invierta el 
orden de los elementos de un array. El array original y el invertido deben imprimirse en pantalla.

Ejemplo de entrada:

int[] numeros = {1, 2, 3, 4, 5};
 */

public class ejercicio10 {
    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5 };

        System.out.println("Array original: ");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

        System.out.println("Array invertido: ");

        for (int i = numeros.length - 1; i >= 0; i--) {

            System.out.println(numeros[i]);

        }
    }
}
