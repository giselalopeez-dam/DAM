/*Buenos días, aquí os dejo otro ejercicio que veremos el viernes tras el examen tipo test. 
Llegad a la hora para que nos de tiempo a verlo entero, os va a venir genial para el examen 
 
Crea un programa con el que el usuario deba introducir letras 
por consola para adivinar una palabra (plabraSecreta) y que finalice cuando todas las letras hayan sido descubiertas. 
 
Además, por cada letra que acierte debe de informar y enseñar su progreso de la siguiente manera:
¡La palabra secreta contiene esa letra! Este es tu progreso: _ l a _ _ 
Cuando la palabr haya sido adivinada muestra un mensaje que muestres los 
intentos en los que lo ha conseguido de esta manera:
Cuando la palabra haya sido adivinada muestra un mensaje que le diga los 
intentos en los que lo ha conseguido de esta manera:
Has descubierto la palabra en 11 intentos.

 
Variables del programa: 
palabraSecreta, intentos, progreso, progresoString */

import java.util.Scanner;

public class ejemploclase {
    public static void main(String[] args) {

        String palabraSecreta = "plato";

        Scanner usuario = new Scanner(System.in);

        int intentos = 0;

        char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        String progresoString = new String(progreso);

        System.out.println("Tienes que adivinar la siguiente palabra: " + progresoString);

        while (progresoString.contains("_")) {
            System.out.println("\nIntroduce una letra");
            char letra = usuario.next().toLowerCase().charAt(0);

            intentos++;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && progreso[i] == '_') {
                    progreso[i] = letra;
                    System.out.println("La palabra secreta tiene esa letra baby. Así vas de momento: ");
                    for (int j = 0; j < progreso.length; j++) {
                        System.out.print(progreso[j]);
                    }
                }
            }

            progresoString = new String(progreso);

        }

        System.out.println("\nHas descubierto la palabra. Era: " + palabraSecreta);
        System.out.println("Lo has conseguido en " + intentos + " intentos");

        usuario.close();
    }

}
