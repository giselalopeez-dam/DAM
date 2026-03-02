/*Saludo personalizado
Función que recibe un nombre y devuelve “Hola, <nombre>”. */

import java.util.Scanner;

public class ejerciciorevisarfunciones {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Diga su nombre y lo saludamos");
        String nombre = usuario.next();

        System.out.println("Hola " + nombre);

        usuario.close();
    }
}
