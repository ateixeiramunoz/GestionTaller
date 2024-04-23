package entidades;

import java.time.LocalDateTime;

/**
 * The type Trabajo realizado.
 */
public class TrabajoRealizado {

    /**
     * The Servicio.
     */
    Servicio servicio;
    /**
     * The Fecha inicio.
     */
    LocalDateTime fechaInicio;
    /**
     * The Fecha fin.
     */
    LocalDateTime fechaFin;
    /**
     * The Fecha garantia de revision.
     */
    LocalDateTime fechaGarantiaDeRevision;
    /**
     * The Fecha garantia montaje.
     */
    LocalDateTime fechaGarantiaMontaje;
    /**
     * The Fecha garantia pieza.
     */
    LocalDateTime fechaGarantiaPieza;
    /**
     * The Empleado.
     */
    Empleado empleado;


    /**
     * Instantiates a new Trabajo realizado.
     */
    public TrabajoRealizado() {
    }

    /**
     * Instantiates a new Trabajo realizado.
     *
     * @param servicio                the servicio
     * @param fechaInicio             the fecha inicio
     * @param fechaFin                the fecha fin
     * @param fechaGarantiaDeRevision the fecha garantia de revision
     * @param fechaGarantiaMontaje    the fecha garantia montaje
     * @param fechaGarantiaPieza      the fecha garantia pieza
     * @param empleado                the empleado
     */
    public TrabajoRealizado(Servicio servicio, LocalDateTime fechaInicio, LocalDateTime fechaFin, LocalDateTime fechaGarantiaDeRevision, LocalDateTime fechaGarantiaMontaje, LocalDateTime fechaGarantiaPieza, Empleado empleado) {
        this.servicio = servicio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaGarantiaDeRevision = fechaGarantiaDeRevision;
        this.fechaGarantiaMontaje = fechaGarantiaMontaje;
        this.fechaGarantiaPieza = fechaGarantiaPieza;
        this.empleado = empleado;
    }

    /**
     * Gets servicio.
     *
     * @return the servicio
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * Sets servicio.
     *
     * @param servicio the servicio
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Gets fecha inicio.
     *
     * @return the fecha inicio
     */
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Sets fecha inicio.
     *
     * @param fechaInicio the fecha inicio
     */
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Gets fecha fin.
     *
     * @return the fecha fin
     */
    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    /**
     * Sets fecha fin.
     *
     * @param fechaFin the fecha fin
     */
    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Gets fecha garantia de revision.
     *
     * @return the fecha garantia de revision
     */
    public LocalDateTime getFechaGarantiaDeRevision() {
        return fechaGarantiaDeRevision;
    }

    /**
     * Sets fecha garantia de revision.
     *
     * @param fechaGarantiaDeRevision the fecha garantia de revision
     */
    public void setFechaGarantiaDeRevision(LocalDateTime fechaGarantiaDeRevision) {
        this.fechaGarantiaDeRevision = fechaGarantiaDeRevision;
    }

    /**
     * Gets fecha garantia montaje.
     *
     * @return the fecha garantia montaje
     */
    public LocalDateTime getFechaGarantiaMontaje() {
        return fechaGarantiaMontaje;
    }

    /**
     * Sets fecha garantia montaje.
     *
     * @param fechaGarantiaMontaje the fecha garantia montaje
     */
    public void setFechaGarantiaMontaje(LocalDateTime fechaGarantiaMontaje) {
        this.fechaGarantiaMontaje = fechaGarantiaMontaje;
    }

    /**
     * Gets fecha garantia pieza.
     *
     * @return the fecha garantia pieza
     */
    public LocalDateTime getFechaGarantiaPieza() {
        return fechaGarantiaPieza;
    }

    /**
     * Sets fecha garantia pieza.
     *
     * @param fechaGarantiaPieza the fecha garantia pieza
     */
    public void setFechaGarantiaPieza(LocalDateTime fechaGarantiaPieza) {
        this.fechaGarantiaPieza = fechaGarantiaPieza;
    }

    /**
     * Gets empleado.
     *
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Sets empleado.
     *
     * @param empleado the empleado
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
