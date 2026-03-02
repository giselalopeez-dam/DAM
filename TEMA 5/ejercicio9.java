/*Ejercicio 5.5

Calcular la suma de los elementos de un array (Este ejercicio está repetido, si quereis no hace falta que lo hagáis)

Enunciado: Escribe un programa que calcule la suma de todos 
los elementos en un array de números enteros predefinido.
 */

public class ejercicio9 {

    public static void main(String[] args) {

        int[] numeros = { 3, 5, 6, 8, 15 };

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            suma += numeros[i];

        }

        System.out.println("El resultado de la suma es: " + suma);
    }
}
