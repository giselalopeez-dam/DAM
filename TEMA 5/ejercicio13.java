/*
Ejercicio 5.9: Rotación de un Array

Escribe un método que reciba un array y un número k, y rote el array a la derecha k posiciones.
Por ejemplo: {1, 2, 3, 4, 5} rotado 2 posiciones debe dar {4, 5, 1, 2, 3}. */

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Tiene un array de {1, 2, 3, 4, 5}, cuántas posiciones quieres que roten los numeros");
        int rotacion = usuario.nextInt();

        int[] array = { 1, 2, 3, 4, 5 };

        int[] guardarNuevoArray = new int[array.length];

        for (int i = 0; i < rotacion; i++) {

            guardarNuevoArray[i] = array[array.length - rotacion + i];

        }

        for (int i = rotacion; i < array.length; i++) {

            guardarNuevoArray[i] = array[i - rotacion];

        }

        for (int i = 0; i < guardarNuevoArray.length; i++) {

            System.out.print(guardarNuevoArray[i] + "");
        }
        usuario.close();

    }
}
