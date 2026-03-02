/*Ejercicio 5.10: Intersección de Arrays

Dado dos arrays, escribe un programa que calcule la intersección (los elementos que existen en los dos arrays)
de los arrays.

Ejemplo:

Entrada: {1, 2, 3, 4} y {3, 4, 5, 6}
Salida:
Intersección: {3, 4}
 */

public class ejercicio14 {
    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3, 4 };

        int[] array2 = { 3, 4, 5, 6 };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }

        }
    }
}
