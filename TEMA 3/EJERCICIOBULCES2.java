/*Implementar una aplicación para calcular datos estadísticos de las edades de los alum­
nos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y
se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos
y cuántos son mayores de edad
 */

import java.util.Scanner;

public class EJERCICIOBULCES2 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        double media = 0;
        int mayoresEdad = 0;

        do {

            System.out.println("Introduzca su edad y cuando quiera acabar de meter datos, pongalo en negativo");
            numero = usuario.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero; // se va sumando la edad de los chavales
            contador++; // va contando cuantos chavales van entrando por teclado

            if (numero >= 18) {
                mayoresEdad++; // se suma cuantos mayores o igual a 18 hay en clase
            }

        } while (true);

        media = (double) suma / contador;

        System.out.println("La suma de todas las edades introducidas es " + suma);
        System.out.println("La media de todas las edades es " + media);
        System.out.println("En clase hay " + contador + " alumnos");
        System.out.println("Hay en total " + mayoresEdad + " mayores de edad en clase");

        usuario.close();

    }
}
