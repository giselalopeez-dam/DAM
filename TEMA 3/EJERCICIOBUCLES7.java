//Escribir todos los múltiplos de 7 menores que 100

public class EJERCICIOBUCLES7 {

    public static void main(String[] args) {

        int numeroPrincipal = 7;

        do {
            System.out.println(numeroPrincipal);
            numeroPrincipal += 7;

        } while (numeroPrincipal < 100);
    }
}