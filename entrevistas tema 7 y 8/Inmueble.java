public class Inmueble {

    protected double metrosCuadrados;
    protected double precioBase;
    protected String direccion;
    protected String nombreDueno;
    protected int contactoDueno;
    protected String segundaMano;
    protected double precio;

    public Inmueble() {
        this.metrosCuadrados = 0;
        this.precioBase = 0;
        this.direccion = "Desconocida";
        this.nombreDueno = "Desconocido";
        this.contactoDueno = 0;
        this.segundaMano = "Desconocido";
        this.precio = 0;
    }

    public void calcularPrecioFinal(double precioBase, double metrosCuadrados, String segundaMano, double precio) {

        double calculo = precioBase * metrosCuadrados;
        double bajadaPrecioSegundaMano = precioBase * 0.5;
        double resultadoBajadaPrecio = precioBase - bajadaPrecioSegundaMano;

        if (segundaMano.equals("Si")) {

            precio = resultadoBajadaPrecio * metrosCuadrados;
            this.precio = precio;

        } else if (segundaMano.equals("No")) {

            precio = calculo;
            this.precio = precio;
        }
    }

}