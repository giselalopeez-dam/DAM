/*Crea un programa que genere un array de tamaño 5, 
donde cada posición contenga los resultados de la 
tabla de multiplicar de un número dado por el usuario.
Entrada:
Ingrese un número: 3
Salida:
Array generado: [3, 6, 9, 12, 15]
 */

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Ingrese un numero");

        int usuarioMultiplicacion = usuario.nextInt();

        for (int i = 0; i < 5; i++) {
            array[i] = usuarioMultiplicacion * (i + 1);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("" + array[i]);
        }

        usuario.close();
    }

}
