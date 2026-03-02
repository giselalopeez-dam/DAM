public class ejercicioUno {
    public static void main(String[] args) {

        // creamos los departamentos
        Departamentos ventas = new Departamentos("Ventas");
        Departamentos RRHH = new Departamentos("Recursos Humanos");

        // creamos los empleados
        Empleados maria = new Empleados("María");
        Empleados carlos = new Empleados("Carlos");
        Empleados ana = new Empleados("Ana");
        Empleados juan = new Empleados("Juan");

        // añadimos los empleados de ventas a su departamento
        ventas.anadirEmpleados(carlos);
        ventas.anadirEmpleados(ana);
        RRHH.anadirEmpleados(maria);
        RRHH.anadirEmpleados(juan);

        ventas.mostrarEmpleados();

    }
}
