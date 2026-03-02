/*Ejercicio 5.7

Combinar dos arrays

Enunciado: Escribe un programa que combine dos arrays en un único array.

Ejemplo de entrada: (Copiate estos array de ejemplo en el código para probar)

int[] array1 = {1, 2, 3};

int[] array2 = {4, 5, 6};
 */

public class ejercicio11 {
    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {

            array3[i] = array1[i];

        }

        for (int i = 0; i < array2.length; i++) {

            array3[array1.length + i] = array2[i];

        }

        for (int i = 0; i < array3.length; i++) {

            System.out.println(array3[i]);

        }

    }
}
