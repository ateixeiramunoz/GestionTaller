package entidades;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The type Reparacion.
 */
public class Reparacion {


    /**
     * The Vehiculo.
     */
    Vehiculo vehiculo;
    /**
     * The Instalacion de piezas.
     */
    List<InstalacionDePieza> instalacionDePiezas;
    /**
     * The Manos de obra.
     */
    List<TrabajoRealizado> manosDeObra;
    /**
     * The Descripción.
     */
    String descripción;
    /**
     * The Fecha.
     */
    LocalDateTime fecha;
    /**
     * The Fecha garantia.
     */
    LocalDateTime fechaGarantia;


    /**
     * Instantiates a new Reparacion.
     */
    public Reparacion() {
    }

    /**
     * Instantiates a new Reparacion.
     *
     * @param vehiculo            the vehiculo
     * @param instalacionDePiezas the instalacion de piezas
     * @param manosDeObra         the manos de obra
     * @param descripción         the descripción
     * @param fecha               the fecha
     * @param fechaGarantia       the fecha garantia
     */
    public Reparacion(Vehiculo vehiculo, List<InstalacionDePieza> instalacionDePiezas, List<TrabajoRealizado> manosDeObra, String descripción, LocalDateTime fecha, LocalDateTime fechaGarantia) {
        this.vehiculo = vehiculo;
        this.instalacionDePiezas = instalacionDePiezas;
        this.manosDeObra = manosDeObra;
        this.descripción = descripción;
        this.fecha = fecha;
        this.fechaGarantia = fechaGarantia;
    }

    /**
     * Gets vehiculo.
     *
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Sets vehiculo.
     *
     * @param vehiculo the vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Gets instalacion de piezas.
     *
     * @return the instalacion de piezas
     */
    public List<InstalacionDePieza> getInstalacionDePiezas() {
        return instalacionDePiezas;
    }

    /**
     * Sets instalacion de piezas.
     *
     * @param instalacionDePiezas the instalacion de piezas
     */
    public void setInstalacionDePiezas(List<InstalacionDePieza> instalacionDePiezas) {
        this.instalacionDePiezas = instalacionDePiezas;
    }

    /**
     * Gets manos de obra.
     *
     * @return the manos de obra
     */
    public List<TrabajoRealizado> getManosDeObra() {
        return manosDeObra;
    }

    /**
     * Sets manos de obra.
     *
     * @param manosDeObra the manos de obra
     */
    public void setManosDeObra(List<TrabajoRealizado> manosDeObra) {
        this.manosDeObra = manosDeObra;
    }

    /**
     * Get descripción string.
     *
     * @return the string
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * Set descripción.
     *
     * @param descripción the descripción
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * Gets fecha.
     *
     * @return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Sets fecha.
     *
     * @param fecha the fecha
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
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
