package DATA_FRAMEWORK.v04_ALMACEN_ESTATICO;

import entidades.Vehiculo;

import java.time.LocalDate;

public class EjecutaEjemploEstatico {

    public static void main(String[] args) {
        ejecutar();
    }


    public static void ejecutar() {

        // Crear un nuevo vehículo
        Vehiculo vehiculo = new Vehiculo("ABC123", "BASTIDOR1", "Toyota", "Corolla", "Blanco", LocalDate.parse( "2013-07-01" ), LocalDate.parse( "2024-07-01" ) );

        AlmacenDeDatos.getVehiculoRepository().save(vehiculo);

        // Buscar un vehículo por su matrícula
        Vehiculo vehiculoEncontrado = AlmacenDeDatos.getVehiculoRepository().findById("ABC123");

        // Imprimir los datos del vehículo encontrado
        if (vehiculoEncontrado != null) {
            System.out.println("Vehículo encontrado: " + vehiculoEncontrado);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

}
