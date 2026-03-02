/*Crear una función que, mediante un booleano, indique si el carácter que se pasa como pa­rámetro de entrada corresponde con una vocal. */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Diga una letra y ver si es una vocal");
        char caracter = usuario.nextLine().charAt(0);
        caracter = Character.toLowerCase(caracter);
        Character.isLetter(caracter);
        Caracter(caracter);

        usuario.close();
    }

    private static void Caracter(char caracter) {

        boolean caracter1;

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            caracter1 = true;
            System.out.println("Es una vocal");
        } else {

            caracter1 = false;
            System.out.println("No es una vocal");
        }

    }

}
