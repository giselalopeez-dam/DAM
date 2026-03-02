import java.util.Scanner;

public class ejerciciosExamen {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
    }

    /*
     * Ejercicio 1 : Cálculo de números primos en un rango (3 puntos)
     * 
     * Escribe un programa (podéis escribirlo en una única función, que se llame por
     * ejemplo ejercicio1(), o en su defecto programarlo todo en el main()) que
     * realice las siguientes tareas utilizando bucles:
     * 
     * a) (0.5 pt) Solicite al usuario dos números enteros positivos, inicio y fin,
     * que representen el rango de números a analizar. Valida que inicio < fin. Si
     * no lo es, solicita los números nuevamente.
     * 
     * b) (0.5 pt) Encuentre y muestre todos los números primos dentro del rango
     * [inicio, fin].
     * #Nota: Un número es primo si es mayor que 1 y solo es divisible por 1 y por
     * sí mismo.
     * 
     * c) (0.5 pt) Calcule y muestre cuántos números primos hay en total dentro del
     * rango.
     * 
     * d) (0.5 pt) Calcule la suma de todos los números primos encontrados y
     * muéstrala.
     * 
     * e) (0.5 pt) Encuentre y muestre el primer número primo en el rango y el
     * último número primo en el rango.
     * f) (0.5 pt) Determina y muestra el número primo más cercano a la mitad del
     * rango.
     * Debes seguir estos pasos:
     * 
     * mitad = (inicio + fin) / 2
     * Busca el número primo que esté más cerca de ese valor (puede estar por debajo
     * o por encima).
     * 
     * 
     * Si hay dos primos igual de cercanos, muestra ambos.
     * 
     * 
     * Ejemplo de salida:
     * La mitad del rango es 27.
     * El número primo más cercano es 29.
     * 
     * Ejemplo con empate:
     * La mitad del rango es 50.
     * Los números primos más cercanos son 47 y 53.
     */

    private static void ejercicio1() {

        Scanner usuario = new Scanner(System.in);

        int inicio;
        int fin;

        int suma = 0;
        int contador = 0;
        int primerPrimo = -1;
        int ultimoPrimo = -1;

        do {

            System.out.println("Introduzca dos numeros positivos enteros");
            inicio = usuario.nextInt();
            fin = usuario.nextInt();

            if (inicio < 0 || fin < 0) {

                System.out.println("No puede introducir numeros negativos");

            } else if (inicio > fin) {

                System.out.println("El primer numero debe ser menor al segundo, introduzca de nuevo ambos");

            }

        } while (inicio > fin && inicio < 0 || fin < 0);

        // parte para hacer la f
        double mitad = (inicio + fin) / 2.0;
        double resultado = 0;

        System.out.println("Los numeros primos son: ");

        for (int i = inicio; i <= fin; i++) {

            if (esPrimo(i)) {

                System.out.println(i + " ");
                suma += i;
                contador++;

                if (primerPrimo == -1) {

                    primerPrimo = i;

                }

                ultimoPrimo = i;

                if (mitad > i) {
                    resultado = mitad - i;

                } else {

                    resultado = i - mitad;
                }

            }
        }

        System.out.println("Hay en total " + contador + " numero/s primo/s");
        System.out.println("La suma de los numero/s primo/s es: " + suma);
        System.out.println("El primer primo en el rango es: " + primerPrimo);
        System.out.println("El ultimo primo en el rango es: " + ultimoPrimo);
        System.out.println("La media de los numeros rangos es: " + resultado);

        usuario.close();
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

    /*
     * Ejercicio 2: Conversión de Unidades con Funciones (3 puntos)
     * 
     * Escribe un programa que realice conversiones entre diferentes unidades de
     * medida usando funciones. El programa debe:
     * 
     * Mostrar un menú al usuario con las siguientes opciones:
     * 
     * 1. Convertir kilómetros a millas
     * 
     * 2. Convertir libras a kilogramos
     * 
     * 3. Convertir grados Celsius a Fahrenheit
     * 
     * 4. Salir
     * 
     * a) (1pt) Implementar una función separada para cada tipo de conversión, que
     * devuelva la unidad que nos den como parámetro ya convertida, utilizando las
     * siguientes fórmulas:
     * 
     * Kilómetros a millas: millas = kilómetros x 0.621371
     * 
     * Libras a kilogramos: kilogramos= libras x 0.453592
     * 
     * Celsius a Fahrenheit: Fahrenheit = (Celsius × 9/5​) + 32
     * 
     * b) (0.5pt) Solicitar los valores necesarios para cada conversión dentro de la
     * función menuConversion() y pasarlos como parámetros a las funciones
     * correspondientes.
     * 
     * c) (0.5pt) Repetir el menú hasta que el usuario seleccione la opción 4.
     * Salir.
     * 
     * d) (0.5 pt) Registrar cuántas conversiones ha realizado el usuario durante la
     * ejecución del programa (sin contar la opción de salir) y, al seleccionar la
     * opción 4. Salir, mostrar un mensaje indicando el número total de conversiones
     * efectuadas.
     * 
     * e) (0.5pt) Validar que las entradas sean válidas (por ejemplo, números
     * positivos cuando corresponda).
     * 
     */

    private static void ejercicio2() {

        Scanner usuario = new Scanner(System.in);
        int contador = 0;
        int opcion;
        double n;

        do {

            System.out.println(
                    "Introduzca que accion quiere realizar: (1)  Convertir kilómetros a millas, (2) Convertir libras a kilogramos, (3) Convertir grados Celsius a Fahrenheit, (4) Salir del programa");
            opcion = usuario.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Introduzca los kilometros que quiere convertir");
                    do {
                        n = usuario.nextDouble();
                        if (n <= 0) {
                            System.out.println(
                                    "Los kilometros no pueden ser menores ni iguales a 0. Introduzca de nuevo el numero");
                        }

                    } while (n <= 0);

                    System.out.println("El resultado es: " + kmsMillas(n));

                    contador++;
                    break;

                case 2:

                    System.out.println("Introduzca las libras que quiere convertir");

                    do {
                        n = usuario.nextDouble();
                        if (n <= 0) {
                            System.out.println(
                                    "Las libras no pueden ser menores ni iguales a 0. Introduzca de nuevo el numero");
                        }

                    } while (n <= 0);

                    System.out.println("El resultado es: " + librasKms(n));

                    contador++;
                    break;

                case 3:
                    System.out.println("Introduzca los Celsius que quiere convertir");

                    n = usuario.nextDouble();

                    System.out.println(celsiusFahrenheit(n));

                    contador++;
                    break;

                case 4:

                    System.out.println("Ha realizado " + contador + " conversiones");

                    System.out.println("Saliendo del programa...");

                    break;

                default:
                    System.out.println("No ha introducido ninguna opcion valida");
                    break;
            }

        } while (opcion != 4);

        usuario.close();

    }

    private static double kmsMillas(double n) {

        return n * 0.621371;
    }

    private static double librasKms(double n) {

        return n * 0.453592;
    }

    private static double celsiusFahrenheit(double n) {

        return (n * 9.0 / 5) + 32;
    }
}