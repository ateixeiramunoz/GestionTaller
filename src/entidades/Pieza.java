package entidades;

/**
 * The type Pieza.
 */
public class Pieza {

    /**
     * The Codigo de pieza.
     */
    String codigoDePieza;
    /**
     * The Marca.
     */
    String marca;
    /**
     * The Descripción.
     */
    String descripción;
    /**
     * The Garantia fabricante.
     */
    boolean garantiaFabricante;
    /**
     * The Garantia montaje.
     */
    boolean garantiaMontaje;

    /**
     * Instantiates a new Pieza.
     */
    public Pieza() {
    }

    /**
     * Instantiates a new Pieza.
     *
     * @param codigoDePieza      the codigo de pieza
     * @param marca              the marca
     * @param descripción        the descripción
     * @param garantiaFabricante the garantia fabricante
     * @param garantiaMontaje    the garantia montaje
     */
    public Pieza(String codigoDePieza, String marca, String descripción, boolean garantiaFabricante, boolean garantiaMontaje) {
        this.codigoDePieza = codigoDePieza;
        this.marca = marca;
        this.descripción = descripción;
        this.garantiaFabricante = garantiaFabricante;
        this.garantiaMontaje = garantiaMontaje;
    }

    /**
     * Gets codigo de pieza.
     *
     * @return the codigo de pieza
     */
    public String getCodigoDePieza() {
        return codigoDePieza;
    }

    /**
     * Sets codigo de pieza.
     *
     * @param codigoDePieza the codigo de pieza
     */
    public void setCodigoDePieza(String codigoDePieza) {
        this.codigoDePieza = codigoDePieza;
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
     * Is garantia fabricante boolean.
     *
     * @return the boolean
     */
    public boolean isGarantiaFabricante() {
        return garantiaFabricante;
    }

    /**
     * Sets garantia fabricante.
     *
     * @param garantiaFabricante the garantia fabricante
     */
    public void setGarantiaFabricante(boolean garantiaFabricante) {
        this.garantiaFabricante = garantiaFabricante;
    }

    /**
     * Is garantia montaje boolean.
     *
     * @return the boolean
     */
    public boolean isGarantiaMontaje() {
        return garantiaMontaje;
    }

    /**
     * Sets garantia montaje.
     *
     * @param garantiaMontaje the garantia montaje
     */
    public void setGarantiaMontaje(boolean garantiaMontaje) {
        this.garantiaMontaje = garantiaMontaje;
    }
}
