/* 1. Mostrar números del 1 al n

Pide un número y muestra los números del 1 al n.*/

import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {

        // ejercicio1(0);
        // ejercicio2(0);
        // ejercicio3(0);
        // ejercicio4(0);
        // ejercicio5();
        // ejercicio6();
        // ejericio7();
        // ejercicio8();
        // ejercicio9();
        // ejercicio10();
        esPrimoo(7);

    }

    /*
     * 1. Mostrar números del 1 al n
     * 
     * Pide un número y muestra los números del 1 al n.
     */

    private static void ejercicio1(int numero) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Vamos a contar numeros desde el 1 hasta el que digas");
        numero = usuario.nextInt();

        for (int i = 1; i <= numero; i++) {

            System.out.println(i);

        }

        usuario.close();

    }

    /*
     * 2. Mostrar números pares entre 1 y n
     * 
     * Pide un número y muestra solo los pares.
     */

    private static void ejercicio2(int numero) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Vamos a contar numeros desde el 1 hasta el que digas y te mostrare solo los pares");

        numero = usuario.nextInt();

        for (int i = 1; i <= numero; i++) { // mostramos desde 1 a n

            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
        usuario.close();

    }

    /*
     * 3. Contar cuántos números impares hay entre 1 y n
     * 
     * Devuelve cuántos impares has encontrado.
     */

    private static void ejercicio3(int numero) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Vamos a contar numeros desde el 1 hasta el que digas y te mostrare solo los pares");
        numero = usuario.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i % 2 != 0) {
                System.out.println(i);

            }

        }

        usuario.close();
    }

    /*
     * 4. Sumar todos los números del 1 al n
     * 
     * Devuelve el total de la suma.
     */

    private static void ejercicio4(int numero) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Vamos a contar numeros desde el 1 hasta el que digas y te mostrare la suma de todos");

        numero = usuario.nextInt();

        int suma = 0;

        for (int i = 1; i <= numero; i++) { // contamos de 1 a n

            suma += i;

        }

        System.out.println(suma);
        usuario.close();

    }

    /*
     * 5. Comprobar si un número es múltiplo de otro
     * 
     * Función:
     * 
     * boolean esMultiplo(int a, int b)
     */

    private static void ejercicio5() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Vamos a saber si un numero es multiplo de otro");

        int a;
        int b;

        do {

            a = usuario.nextInt();

            if (a <= 0) {

                System.out.println("El primer numero no puede ser 0 ni menor de 0");

            }

        } while (a <= 0);

        do {

            b = usuario.nextInt();

            if (b <= 0) {

                System.out.println("El segundo numero no puede ser 0 ni menor de 0");
            }

        } while (b <= 0);

        boolean resultado = esMultiplo(a, b);
        System.out.println(resultado);

        usuario.close();

    }

    private static boolean esMultiplo(int a, int b) {

        if (a % b == 0) {

            return true;

        } else {

            return false;
        }

        // return a % b == 0;
        // Si es verdadero → return true
        // Si es falso → return false
    }

    /*
     * 6. Función que devuelva el cuadrado de un número
     * int cuadrado(int n)
     */

    private static void ejercicio6() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Diga un numero y le decimos su cuadrado");

        int n;

        do {

            n = usuario.nextInt();

            if (n <= 0) {

                System.out.println("No puede introducir un numero menor a 0 ni 0. Introduzca de nuevo el numero");

            }

        } while (n <= 0);

        int resultado = cuadrado(n);

        System.out.println("Su resultado es: " + resultado);

        usuario.close();

    }

    private static int cuadrado(int n) {

        return n * n;

        // return (int) Math.pow(n,2) o tambien para un ejercicio de base-exponente
        // es decir, return (int) Math.pow(base, exponente)

    }

    /*
     * 7. Función que devuelva la media de 3 números
     * 
     * Pide 3 números y devuelve la media.
     */

    private static void ejericio7() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Dame tres numeros y te damos su media");
        double a = usuario.nextDouble();
        double b = usuario.nextDouble();
        double c = usuario.nextDouble();

        double resultado = mediaNumeros(a, b, c);
        System.out.println("La media es: " + resultado);

        usuario.close();

    }

    private static double mediaNumeros(double a, double b, double c) {

        return (a + b + c) / 3;
    }

    /*
     * 8. Pedir números hasta que el usuario escriba 0
     * 
     * Suma todos los números introducidos menos el 0.
     */

    private static void ejercicio8() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ponga numeros y cuando se canse ponga 0, le sumaremos todos");

        int n;
        int suma = 0;

        do {

            n = usuario.nextInt();
            suma = numerosUsuario(n, suma);

        } while (n != 0);

        System.out.println(suma);

        usuario.close();

    }

    private static int numerosUsuario(int n, int sumaBucle) {

        if (n != 0) {
            sumaBucle += n;
        }

        return sumaBucle;

    }

    /*
     * 9. Número invertido
     * 
     * Pide un número entero y muéstralo al revés (ej: 543 → 345).
     */

    private static void ejercicio9() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ponga un numero de 3 cifras y se lo damos a la inversa");

        int n;

        do {

            n = usuario.nextInt();

            if (n < 100) {
                System.out.println("Introduza un numero de 3 cifras");
            } else if (n > 999) {
                System.out.println("Introduzca un numero de 3 cifras, no mas de 3");
            }

        } while (n < 100 || n > 999); // este validador es opcional

        int resultado = numeroInverso(n);

        System.out.println("El resultado es: " + resultado);

        usuario.close();

    }

    private static int numeroInverso(int n) {

        int invertido = 0;

        while (n != 0) {

            int ultimoDigito = n % 10;
            invertido = invertido * 10 + ultimoDigito;
            n = n / 10;

        }

        return invertido;

    }

    /*
     * 10. Sumar todos los dígitos de un número
     * 
     * Ej: 1234 → 1+2+3+4 = 10.
     */

    private static void ejercicio10() {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ponga un numero de 3 cifras y se lo damos a la inversa");

        int n = usuario.nextInt();

        int resultado = sumaDigitos(n);
        System.out.println("El resultado es: " + resultado);

        usuario.close();

    }

    private static int sumaDigitos(int n) {

        if (n == 0) {

            return 0;

        } else {

            return n % 10 + sumaDigitos(n / 10);
        }

    }

    /*
     * 15. Pedir una cantidad n y leer n números
     * 
     * Contar cuántos son positivos, cuántos negativos y cuántos cero.
     */

    private static void ejercicio15() {

    }

    private static boolean esPrimo(int n) {

        if (n <= 1) {

            return false;

        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                return false;

            }

        }

        return true;

    }

    private static int numeroFactorial(int n) {

        if (n <= 1) {

            return n;

        } else {

            return n * numeroFactorial(n - 1);
        }

    }

    private static boolean esPrimoo(int n) {

        if (n <= 1) {

            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                return false;
            }

        }

        return true;

    }

    private static void ejercicioExtra(int inicio, int fin) {

        int suma = 0;
        int numeroPrimo = 0;
        int primerNumeroPrimo = -1;
        int segundoNumeroPrimo = -1;

        double mitad = (inicio + fin) / 2.0;
        int numeroMasCercano = -1;
        int diferenciaEspacio = 999999;

        for (int i = inicio; i < fin; i++) {

            if (esPrimoo(i)) {

                suma += i;
                numeroPrimo++;

                if (primerNumeroPrimo == -1) {

                    primerNumeroPrimo = i;

                }

                segundoNumeroPrimo = i;

                double diferencia;

                if (i < mitad) {

                    diferencia = mitad - i;

                } else {

                    diferencia = i - mitad;

                }

            }

            System.out.println("El primer numero primo es: " + primerNumeroPrimo);
            System.out.println("El segundo numero primo es " + segundoNumeroPrimo);
            System.out.println("Hay en total numeros primos: " + numeroPrimo);
            System.out.println("La suma de todos los numeros primos es: " + suma);

        }

    }

    private static void ejercicioExtra() {

    }

}
