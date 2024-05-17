package herramientas;

import logging.LoggerConfig;
import logging.MensajesPantallaConfig;

import java.util.Scanner;
import java.util.logging.Logger;


public class Navegacion {

    private static final Logger logger =
            LoggerConfig.getLogger(Navegacion.class.getName());

    private static final Logger escritorPantalla =
            MensajesPantallaConfig.getLogger(Navegacion.class.getName());


    public static void mostrarMenuPrincipal() {

        logger.info("Mostrando menu principal");

        escritorPantalla.info("Escoge una opcion: ");
        escritorPantalla.info("1-. Gestión de Clientes");
        escritorPantalla.info("2-. Gestión de vehículos");
        escritorPantalla.info("x-. Salir");


    }

    public static void mostrarMenuCliente() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Cliente");
        System.out.println("2-. Modificacion de cliente");
        System.out.println("3-. Eliminar Cliente");
        System.out.println("4-. Búsqueda de cliente");
        System.out.println("5-. Listar Clientes");
    }

    public static void mostrarMenuVehiculo() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Vehiculo");
        System.out.println("2-. Modificacion de Vehiculo");
        System.out.println("3-. Eliminar Vehiculo");
        System.out.println("4-. Búsqueda de Vehiculo");
        System.out.println("5-. Listar Vehiculos");
    }

    public static String leerRespuesta() {
        Scanner s = new Scanner(System.in);
        String respuesta = s.next();
        return respuesta;
    }

}