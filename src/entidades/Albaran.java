package entidades;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Albaran. Un albarán o nota de entrega, es un documento mercantil que acredita la entrega de un pedido. Al comprador le sirve para comprobar que lo que ha recibido coincide con lo que solicitó y verificarlo con la facturación del pedido cuando ésta sea posterior.
 */
public class Albaran {

    /**
     * El número del albarán. Sirve para identificarlo de manera unequívoca.
     */
    String numeroAlbaran;
    /**
     * The Fecha entrega.
     */
    LocalDateTime fechaEntrega;
    /**
     * The Piezas.
     */
    List<Pieza> piezas;
    /**
     * The Proveedor.
     */
    Proveedor proveedor;
    /**
     * The Factura.
     */
    Factura factura;


    /**
     * Instantiates a new Albaran.
     */
    public Albaran() {
    }

    /**
     * Instantiates a new Albaran.
     *
     * @param numeroAlbaran the numero albaran
     * @param fechaEntrega  the fecha entrega
     * @param piezas        the piezas
     * @param proveedor     the proveedor
     * @param factura       the factura
     */
    public Albaran(String numeroAlbaran, LocalDateTime fechaEntrega, List<Pieza> piezas, Proveedor proveedor, Factura factura) {
        this.numeroAlbaran = numeroAlbaran;
        this.fechaEntrega = fechaEntrega;
        this.piezas = piezas;
        this.proveedor = proveedor;
        this.factura = factura;
    }

    /**
     * Gets numero albaran.
     *
     * @return the numero albaran
     */
    public String getNumeroAlbaran() {
        return numeroAlbaran;
    }

    /**
     * Sets numero albaran.
     *
     * @param numeroAlbaran the numero albaran
     */
    public void setNumeroAlbaran(String numeroAlbaran) {
        this.numeroAlbaran = numeroAlbaran;
    }

    /**
     * Gets fecha entrega.
     *
     * @return the fecha entrega
     */
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Sets fecha entrega.
     *
     * @param fechaEntrega the fecha entrega
     */
    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Gets piezas.
     *
     * @return the piezas
     */
    public List<Pieza> getPiezas() {
        return piezas;
    }

    /**
     * Sets piezas.
     *
     * @param piezas the piezas
     */
    public void setPiezas(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    /**
     * Gets proveedor.
     *
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Sets proveedor.
     *
     * @param proveedor the proveedor
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Gets factura.
     *
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * Sets factura.
     *
     * @param factura the factura
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
