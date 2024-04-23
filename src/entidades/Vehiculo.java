package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * The type Vehiculo.
 */
public class Vehiculo {

    /**
     * The Matricula.
     */
    String matricula;
    /**
     * The Numero bastidor.
     */
    String numeroBastidor;
    /**
     * The Marca.
     */
    String marca;
    /**
     * The Modelo.
     */
    String modelo;
    /**
     * The Color.
     */
    String color;
    /**
     * The Fecha fabricacion.
     */
    LocalDate fechaFabricacion;
    /**
     * The Fecha itv.
     */
    LocalDate fechaITV;


    /**
     * Instantiates a new Vehiculo.
     */
    public Vehiculo() {
    }

    /**
     * Instantiates a new Vehiculo.
     *
     * @param matricula        the matricula
     * @param numeroBastidor   the numero bastidor
     * @param marca            the marca
     * @param modelo           the modelo
     * @param color            the color
     * @param fechaFabricacion the fecha fabricacion
     * @param fechaITV         the fecha itv
     */
    public Vehiculo(String matricula, String numeroBastidor, String marca, String modelo, String color, LocalDate fechaFabricacion, LocalDate fechaITV) {
        this.matricula = matricula;
        this.numeroBastidor = numeroBastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaITV = fechaITV;
    }

    /**
     * Gets matricula.
     *
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets matricula.
     *
     * @param matricula the matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Gets numero bastidor.
     *
     * @return the numero bastidor
     */
    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    /**
     * Sets numero bastidor.
     *
     * @param numeroBastidor the numero bastidor
     */
    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    /**
     * Gets marca.
     *
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets marca.
     *
     * @param marca the marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Gets modelo.
     *
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets modelo.
     *
     * @param modelo the modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets fecha fabricacion.
     *
     * @return the fecha fabricacion
     */
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * Sets fecha fabricacion.
     *
     * @param fechaFabricacion the fecha fabricacion
     */
    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Gets fecha itv.
     *
     * @return the fecha itv
     */
    public LocalDate getFechaITV() {
        return fechaITV;
    }

    /**
     * Sets fecha itv.
     *
     * @param fechaITV the fecha itv
     */
    public void setFechaITV(LocalDate fechaITV) {
        this.fechaITV = fechaITV;
    }
}
