/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es
el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada
árbol (terminando la introducción de datos cuando se utilice -1 como altura). Los árboles
se identifican mediante etiquetas con números únicos correlativos, comenzando en O. 
Di­señar una aplicación que resuelva el problema planteado.
 */

import java.util.Scanner;

public class EJERCICIOBUCLES4 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        int centimetros;
        int etiquetas = 0;
        int mayorAltura = 0;
        int etiquetaMayorAltura = 0;

        do {

            System.out.println("Introduzca la altura (en centimetros). Cuando introduca '-1' acaban los datos");
            centimetros = usuario.nextInt();

            if (centimetros != -1) {
                if (centimetros > mayorAltura) {
                    mayorAltura = centimetros;
                    etiquetaMayorAltura = etiquetas;
                }
            }

            etiquetas++;

        } while (centimetros != -1);

        if (etiquetas > 0) {
            System.out.println("Resultados finales:");
            System.out.println("El árbol más alto mide " + mayorAltura + " centimetros");
            System.out.println("Su etiqueta es " + etiquetaMayorAltura);

        } else {

            System.out.println("No introdujo datos de árboles");
        }

        usuario.close();
    }
}
