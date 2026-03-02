/*Ejercicio 5.8: Duplicados en un Array

Crea un programa que encuentre los elementos duplicados en un array. 

Por ejemplo, para el array {1, 2, 3, 2, 1, 4}, el programa debe identificar 1 y 2 como duplicados. 
Tiene que salir por pantalla 1 y 2. */

public class ejercicio12 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 2, 1, 4 };

        for (int i = 0; i < array.length; i++) { // recorro toda la longitud del array
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);

                }

            }

        }

    }
}
