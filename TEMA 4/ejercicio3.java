/*3. Comprobar si un número de 3 cifras es capicúa
No es un método recursivo.
Ej: 242 → true.
 */

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.println("Introduzca el numero para ver si es capicua");
        int numero = usuario.nextInt();

        System.out.println(numeroCapicua(numero));

        usuario.close();

    }

    private static boolean numeroCapicua(int numero) {

        int primerNumero = numero / 100;
        int ultimoNumero = numero % 10;

        return primerNumero == ultimoNumero;
    }

}
