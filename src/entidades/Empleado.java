package entidades;

import java.util.List;

/**
 * The type Empleado.
 */
public class Empleado {

    /**
     * The Codigo empleado.
     */
    String codigoEmpleado;
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
     * The Categoria.
     */
    String categoria;


    /**
     * Instantiates a new Empleado.
     */
    public Empleado() {
    }

    /**
     * Instantiates a new Empleado.
     *
     * @param codigoEmpleado the codigo empleado
     * @param nombre         the nombre
     * @param direccion      the direccion
     * @param dni            the dni
     * @param categoria      the categoria
     */
    public Empleado(String codigoEmpleado, String nombre, String direccion, String dni, String categoria) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.categoria = categoria;
    }

    /**
     * Gets codigo empleado.
     *
     * @return the codigo empleado
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Sets codigo empleado.
     *
     * @param codigoEmpleado the codigo empleado
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
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
     * Gets categoria.
     *
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets categoria.
     *
     * @param categoria the categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
