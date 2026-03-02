/*Ejercicio 1: Matriz Espiral 
Descripción: Escribe un programa que recorra una matriz bidimensional en espiral y 
devuelva los elementos en un array de una dimensión en el orden de la espiral.
Entrada:
int[][] numeros =
        { { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 } };
Salida:
{1, 2, 3, 6, 9, 8, 7, 4, 5}
*/

public class entrevistatema5 {
    public static void main(String[] args) {

        int[][] numeros = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int filaArriba = 0;
        int columnaDerecha = numeros[0].length - 1;
        int filaAbajo = numeros.length - 1;
        int columnaIzquierda = 0;

        while (filaArriba <= filaAbajo && columnaIzquierda <= columnaDerecha) {

            for (int i = columnaIzquierda; i <= columnaDerecha; i++) {
                System.out.println(numeros[filaArriba][i]);
            }

            filaArriba++;

            for (int i = filaArriba; i <= filaAbajo; i++) {
                System.out.println(numeros[i][columnaDerecha]);

            }

            columnaDerecha--;

            if (filaArriba <= filaAbajo) {

                for (int i = columnaDerecha; i >= columnaIzquierda; i--) {
                    System.out.println(numeros[filaAbajo][i]);
                }

                filaAbajo--;

            }

            if (columnaDerecha <= columnaIzquierda) {
                for (int i = filaAbajo; i >= filaArriba; i--) {
                    System.out.println(numeros[i][columnaIzquierda]);
                }

                columnaIzquierda++;
            }

        }
    }
}