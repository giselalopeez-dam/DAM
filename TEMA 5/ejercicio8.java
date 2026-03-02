/*Ejercicio 5.4

Diseñar la función: int maximo (int t [ ]) , que devuelva el máximo valor contenido en el array t.
Por ejemplo usar este array como entrada:
int[] numeros = {40, 50, 80,10}
 */

public class ejercicio8 {
    public static void main(String[] args) {

        int[] numeros = { 40, 50, 80, 10 };

        int numeroMayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > numeroMayor) {

                numeroMayor = numeros[i];
            }

        }

        System.out.println("El numero mayor es: " + numeroMayor);

    }
}
