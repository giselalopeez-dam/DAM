/*Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá
que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y
100. Mientras la solución introducida sea correcta, el juego continuará. En caso contra­
rio, el programa terminará y mostrará el número de operaciones realizadas correctamente.
 */

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOBUCLES5 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int numero;
        Random random = new Random();
        int aleatorioNumero1;
        int aleatorioNumero2;
        int sumaNumerosAleaorios = 0;
        int solucion = 0;

        do {

            aleatorioNumero1 = random.nextInt(1, 101);
            aleatorioNumero2 = random.nextInt(1, 101);
            System.out.println(
                    "Introduzca la solucion de la suma de los dos numeros entre el 1 y el 100. Si aciertas, el juego continua. En caso contrario, pierdes.");

            System.out.println("Cuánto es la suma de " + aleatorioNumero1 + " + " + aleatorioNumero2);
            numero = usuario.nextInt();

            sumaNumerosAleaorios = aleatorioNumero1 + aleatorioNumero2;

            if (numero == sumaNumerosAleaorios) {
                System.out.println("Enhorabuena, has acertado");
                solucion++;
            }

            if (numero < 0) {

                System.out.println("Introduzca un numero valido");
            }

        } while (numero == sumaNumerosAleaorios);

        System.out.println("Acabaste. Sumas acertadas: " + solucion);

        usuario.close();
    }
}
