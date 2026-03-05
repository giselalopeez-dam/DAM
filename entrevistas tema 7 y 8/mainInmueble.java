public class mainInmueble {
    public static void main(String[] args) {

        opcionPiso();
        opcionCasa();
        opcionLocal();

    }

    private static void opcionPiso() {

        Inmueble piso = new Piso(150, 2300, "Calle Turquesa, 23, Bajo Izquierda", "Alejandro Perez", "642080864",
                false, 3, true);

        System.out.println("Su inmueble está valorado en: " + piso.calcularPrecioFinal() + " euros.");
        piso.llamarDueno();

    }

    private static void opcionCasa() {

        // ejemplo de casa con jardín y casa no adosada

        Inmueble casa = new Casa(235, 3000, "Calle Amatista, 36", "Pepa Garcia", "684016573", true, true, 2, false);
        System.out.println("Su inmueble está valorado en: " + casa.calcularPrecioFinal() + " euros.");
        casa.llamarDueno();
    }

    private static void opcionLocal() {

        Inmueble local = new Local(80, 500, "Calle San Fernando, 45", "Jose Perez", "654326754", true, "Restaurante",
                true);
        System.out.println("Su inmueble está valorado en: " + local.calcularPrecioFinal() + " euros.");
        local.llamarDueno();

    }

}
