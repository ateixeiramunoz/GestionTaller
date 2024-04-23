package entidades;

import java.time.LocalDateTime;

/**
 * The type Instalacion de pieza.
 */
public class InstalacionDePieza {

    /**
     * The Pieza.
     */
    Pieza pieza;
    /**
     * The Fecha instalacion.
     */
    LocalDateTime fechaInstalacion;
    /**
     * The Fecha garantia.
     */
    LocalDateTime fechaGarantia;

    /**
     * Instantiates a new Instalacion de pieza.
     */
    public InstalacionDePieza() {
    }

    /**
     * Instantiates a new Instalacion de pieza.
     *
     * @param pieza            the pieza
     * @param fechaInstalacion the fecha instalacion
     * @param fechaGarantia    the fecha garantia
     */
    public InstalacionDePieza(Pieza pieza, LocalDateTime fechaInstalacion, LocalDateTime fechaGarantia) {
        this.pieza = pieza;
        this.fechaInstalacion = fechaInstalacion;
        this.fechaGarantia = fechaGarantia;
    }

    /**
     * Gets pieza.
     *
     * @return the pieza
     */
    public Pieza getPieza() {
        return pieza;
    }

    /**
     * Sets pieza.
     *
     * @param pieza the pieza
     */
    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    /**
     * Gets fecha instalacion.
     *
     * @return the fecha instalacion
     */
    public LocalDateTime getFechaInstalacion() {
        return fechaInstalacion;
    }

    /**
     * Sets fecha instalacion.
     *
     * @param fechaInstalacion the fecha instalacion
     */
    public void setFechaInstalacion(LocalDateTime fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    /**
     * Gets fecha garantia.
     *
     * @return the fecha garantia
     */
    public LocalDateTime getFechaGarantia() {
        return fechaGarantia;
    }

    /**
     * Sets fecha garantia.
     *
     * @param fechaGarantia the fecha garantia
     */
    public void setFechaGarantia(LocalDateTime fechaGarantia) {
        this.fechaGarantia = fechaGarantia;
    }
}
