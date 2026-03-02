import java.util.Arrays;

public class ejercicioclase {

    public static void main(String[] args) {

        int[] numeros = { 3, 0, 4, 0, 5 };
        int[] resultado = new int[numeros.length];
        int contadorCeros = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] != 0) {
                resultado[contadorCeros] = numeros[i];
                contadorCeros++;
            }
        }

        System.out.println(Arrays.toString(resultado));
    }

}
