/* Inversión de número
Pide un número y muéstralo al revés (ej: 54321 → 12345)
*/

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        int numero = usuario.nextInt();
        int invertido = 0;

        while (numero > 0) {

            int ultimo = numero % 10; // coger último dígito
            invertido = invertido * 10 + ultimo; // añadirlo al número invertido
            numero = numero / 10; // quitar último dígito

        }

        System.out.println(invertido);

        usuario.close();
    }
}
