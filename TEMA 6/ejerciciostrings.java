/*Crea un programa con el cual se puedan registrar 5 nombres de usuario. 
Los nombres deben cumplir las siguientes condiciones:

Tener entre 3 y 12 caracteres.
No contener espacios.
Solo pueden tener letras y números.
Los nombres se almacenarán en un array de Strings.

Se pide:

Pedir los 5 nombres usando un bucle.
Validar cada nombre carácter por carácter.
Si el nombre no cumple las condiciones, volver a pedirlo al final indicando cual es el erróneo.
Mostrar todos los nombres válidos al final.
Indicar cuál es el nombre más largo.

 */

import java.util.Scanner;

public class ejerciciostrings {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        String[] nombres = new String[5];

        String[] usuariosCorrectos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = usuario.nextLine();

        }

        for (int i = 0; i < nombres.length; i++) {

            // char[] nombre = nombres[].toCharArray();

            //
        }

    }
}
