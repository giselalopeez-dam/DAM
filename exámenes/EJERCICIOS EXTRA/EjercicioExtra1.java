import java.util.Scanner;

public class EjercicioExtra1 {
public static void main(String[] args) {

        System.out.println("Introduzca el numero de kWh consumido. Si tiene un consumo mayor de 25 se aplicara un 10% de incremento en su factura");
        Scanner kwh = new Scanner (System.in);
        double consumo = kwh.nextDouble();

        System.out.println("Introduzca del 1 al 3 donde tiene su gasto. Siendo 1 HOGAR, siendo 2 NEGOCIO, siendo 3 INDUSTRIAL");
        int tipogasto = kwh.nextInt();

        double hogar = 0.5 * consumo;
        double negocio = 0.3 * consumo;
        double industrial = 0.2 * consumo;

        

        
        if (tipogasto < 1) {
                System.out.println("Introduzca de manera valida del 1 al 3 nuevamente de donde procede su gasto");

        } else if (tipogasto > 3) {
                System.out.println("Introduzca de manera valida del 1 al 3 nuevamente de donde procede su gasto");

        }
        


        if (tipogasto == 1) 
        {
                if(consumo > 25)
                {
                hogar *= 1.1;
                }
                System.out.println("Su gasto es " + hogar + " euros");

        } else if (tipogasto == 2) {
                if(consumo > 25)
                {
                negocio *= 1.1;
                }
                System.out.println("Su gasto es " + negocio + " euros");

        } else if (tipogasto == 3) {
                if(consumo > 25)
                {
                industrial *= 1.1;
                }
                System.out.println("Su gasto es " + industrial + " euros");

        }
        kwh.close();
}
}