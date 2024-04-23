package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Cliente. Esta es la clase que utilizamos para guardar la informacion de los clientes.
 */
public class Cliente {


    /**
     * The Codigo cliente.
     */
    String codigoCliente;
    /**
     * The Nombre.
     */
    String nombre;
    /**
     * The Direccion.
     */
    String direccion;
    /**
     * The Dni.
     */
    String dni;
    /**
     * The Vehiculos.
     */
    List<Vehiculo> vehiculos;


    /**
     * Instantiates a new Cliente.
     */
    public Cliente() {
    }

    /**
     * Instantiates a new Cliente.
     *
     * @param codigoCliente the codigo cliente
     * @param nombre        the nombre
     * @param direccion     the direccion
     * @param dni           the dni
     * @param vehiculos     the vehiculos
     */
    public Cliente(String codigoCliente, String nombre, String direccion, String dni, List<Vehiculo> vehiculos) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.vehiculos = vehiculos;
    }

    /**
     * Gets codigo cliente.
     *
     * @return the codigo cliente
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets codigo cliente.
     *
     * @param codigoCliente the codigo cliente
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets direccion.
     *
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets direccion.
     *
     * @param direccion the direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Gets dni.
     *
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Sets dni.
     *
     * @param dni the dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Gets vehiculos.
     *
     * @return the vehiculos
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Sets vehiculos.
     *
     * @param vehiculos the vehiculos
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
