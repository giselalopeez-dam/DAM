public class ejercicio4 {
    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Kia", "Sport", 2015, Color.AZUL);

        coche1.InfoCoche();
        coche2.InfoCoche();

        coche1.setMarca("Citroen");
        coche1.InfoCoche();

    }
}
