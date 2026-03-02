import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        int numero = usuario.nextInt();
        int suma = 0;

        do {

            int modulo = numero % 10; // pillo ultimo numero
            suma = suma + modulo; // vamos sumandolo
            numero = numero / 10; // quitamos la ultima cifra

        } while (numero > 0);

        System.out.println(suma);

        usuario.close();
    }
}
