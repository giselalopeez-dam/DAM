/*Diseñar una función que recibe como parámetros dos números y devuelve el máximo de ambos*/

import java.util.Scanner;

public class ejercicio4 {

    private static int Maximo(int numero1, int numero2) {

        if (numero1 > numero2) {

            return numero1;

        } else {

            return numero2;
        }

    }

    public static void main(String[] args) {

        System.out.println("Escriba dos numeros y le decimos cuál es mayor de los dos");
        Scanner usuario = new Scanner(System.in);
        int numero1 = usuario.nextInt();
        int numero2 = usuario.nextInt();

        int maximoNum = Maximo(numero1, numero2);

        System.out.println(maximoNum);
        usuario.close();
    }
}
