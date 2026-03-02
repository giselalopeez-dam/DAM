import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Diga su salario bruto sin puntos. Los centimos, pongalos con coma (,) y no con punto (.)");
        Scanner usuario = new Scanner(System.in);
        double salarioBruto = usuario.nextDouble();

        System.out.println("Indique el porcentaje de retencion para calcular su salario neto");
        double retencion = usuario.nextDouble();

        double impuestos = (salarioBruto * retencion) / 100;
        double resultadoNeto = salarioBruto - impuestos;

        if (retencion <= 0 || retencion > 100) {

            System.out.println("Introduzca un porcentaje valido");

        } else {

            System.out.println("Le quitan " + impuestos + " euros. Su salario neto es " + resultadoNeto + " euros.");
        }

        usuario.close();
    }
}