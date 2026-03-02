public class CuentaBancaria {

    String titular;
    Double saldo;

    void MostrarDineroYTitular() {

        System.out.println("El titular es: " + titular);
        System.out.println("Tu dinero actual es: " + saldo);

    }

    void Depositar(double dinero) {

        System.out.println("Hemos ingresado " + dinero + " euros");
        System.out.println("Nos queda: " + (saldo + dinero));

    }

    void RetirarDinero(double dinero) {
        System.out.println("Hemos ingresado " + dinero + " euros");
        System.out.println("Nos queda: " + (saldo - dinero));

    }

}
