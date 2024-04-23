package entidades;

import java.time.LocalDateTime;

/**
 * The type Proveedor.
 */
public class Proveedor {

    /**
     * The Cif.
     */
    String CIF;
    /**
     * The Nombre proveedor.
     */
    String nombreProveedor;
    /**
     * The Nacional.
     */
    boolean nacional;
    /**
     * The Garantia.
     */
    boolean garantia;
    /**
     * The Tiempo de entrega.
     */
    LocalDateTime tiempoDeEntrega;
    /**
     * The Costed de envio.
     */
    float costedDeEnvio;
    /**
     * The Pedido minimo.
     */
    float pedidoMinimo;


    /**
     * Instantiates a new Proveedor.
     */
    public Proveedor() {
    }

    /**
     * Instantiates a new Proveedor.
     *
     * @param CIF             the cif
     * @param nombreProveedor the nombre proveedor
     * @param nacional        the nacional
     * @param garantia        the garantia
     * @param tiempoDeEntrega the tiempo de entrega
     * @param costedDeEnvio   the costed de envio
     * @param pedidoMinimo    the pedido minimo
     */
    public Proveedor(String CIF, String nombreProveedor, boolean nacional, boolean garantia, LocalDateTime tiempoDeEntrega, float costedDeEnvio, float pedidoMinimo) {
        this.CIF = CIF;
        this.nombreProveedor = nombreProveedor;
        this.nacional = nacional;
        this.garantia = garantia;
        this.tiempoDeEntrega = tiempoDeEntrega;
        this.costedDeEnvio = costedDeEnvio;
        this.pedidoMinimo = pedidoMinimo;
    }

    /**
     * Gets cif.
     *
     * @return the cif
     */
    public String getCIF() {
        return CIF;
    }

    /**
     * Sets cif.
     *
     * @param CIF the cif
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     * Gets nombre proveedor.
     *
     * @return the nombre proveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * Sets nombre proveedor.
     *
     * @param nombreProveedor the nombre proveedor
     */
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * Is nacional boolean.
     *
     * @return the boolean
     */
    public boolean isNacional() {
        return nacional;
    }

    /**
     * Sets nacional.
     *
     * @param nacional the nacional
     */
    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    /**
     * Is garantia boolean.
     *
     * @return the boolean
     */
    public boolean isGarantia() {
        return garantia;
    }

    /**
     * Sets garantia.
     *
     * @param garantia the garantia
     */
    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    /**
     * Gets tiempo de entrega.
     *
     * @return the tiempo de entrega
     */
    public LocalDateTime getTiempoDeEntrega() {
        return tiempoDeEntrega;
    }

    /**
     * Sets tiempo de entrega.
     *
     * @param tiempoDeEntrega the tiempo de entrega
     */
    public void setTiempoDeEntrega(LocalDateTime tiempoDeEntrega) {
        this.tiempoDeEntrega = tiempoDeEntrega;
    }

    /**
     * Gets costed de envio.
     *
     * @return the costed de envio
     */
    public float getCostedDeEnvio() {
        return costedDeEnvio;
    }

    /**
     * Sets costed de envio.
     *
     * @param costedDeEnvio the costed de envio
     */
    public void setCostedDeEnvio(float costedDeEnvio) {
        this.costedDeEnvio = costedDeEnvio;
    }

    /**
     * Gets pedido minimo.
     *
     * @return the pedido minimo
     */
    public float getPedidoMinimo() {
        return pedidoMinimo;
    }

    /**
     * Sets pedido minimo.
     *
     * @param pedidoMinimo the pedido minimo
     */
    public void setPedidoMinimo(float pedidoMinimo) {
        this.pedidoMinimo = pedidoMinimo;
    }
}
