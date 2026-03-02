import java.util.Random;
import java.util.Scanner;

public class ejercicio2entrevista {

    public static void main(String[] args) {

        leerEntradaUsuario();
    }

    private static void leerEntradaUsuario() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que quiera de numeros");
        int cantidad;

        do {

            cantidad = usuario.nextInt();

            if (cantidad <= 0) {

                System.out.println("No, ponga una cantidad mayor de 0");

            }

        } while (cantidad <= 0);

        System.out.println("Desde que numero quiere empezar a generar numeros");
        int inicio = usuario.nextInt();
        System.out.println("Desde que numero quiere terminar de generar numeros");
        int fin = usuario.nextInt();

        mostrarRangoAleatorio(cantidad, inicio, fin);
        mostrarRangoAleatorio(cantidad);

        usuario.close();

    }

    private static void mostrarRangoAleatorio(int cantidad, int inicio, int fin) {

        Random random = new Random();
        System.out.println("Los numeros randoms enteros son: ");

        for (int i = 1; i <= cantidad; i++) {

            int numeroRandom = random.nextInt(inicio, fin) + 1;
            System.out.println(" " + numeroRandom);

        }

    }

    private static void mostrarRangoAleatorio(int cantidad) {

        Random random = new Random();
        System.out.println("Los numeros randoms son ");

        for (int i = 1; i <= cantidad; i++) {

            int numeroRandom = random.nextInt(0, 101);
            double resultado = numeroRandom * 0.01;

            System.out.println(" " + resultado);

        }
    }
}

/*
 * if (inicio > fin) {
 * 
 * int aux = inicio;
 * inicio = fin;
 * fin = aux;
 * 
 * }
 */