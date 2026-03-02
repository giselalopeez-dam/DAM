import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.saldo = 2000.0;
        cuenta1.titular = "Gisela Lopez";

        cuenta1.MostrarDineroYTitular();
        System.out.println("Ingrese dinero");
        cuenta1.Depositar(sc.nextDouble());
        System.out.println("Retire dinero");
        cuenta1.RetirarDinero(sc.nextDouble());

        sc.close();

    }

}
