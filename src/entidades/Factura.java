package entidades;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The type Factura.
 */
public class Factura {

    /**
     * The Estado pago.
     */
    boolean estadoPago;
    /**
     * The Importe.
     */
    float importe;

    /**
     * The Codigo factura.
     */
    String codigoFactura;

    /**
     * The Fecha factura.
     */
    LocalDateTime fechaFactura;
    /**
     * The Fecha vencimiento.
     */
    LocalDateTime fechaVencimiento;

    /**
     * The Cliente.
     */
    Cliente cliente;
    /**
     * The Empleado.
     */
    Empleado empleado;

    /**
     * The Trabajos realizados.
     */
    List<TrabajoRealizado> trabajosRealizados;


    /**
     * Instantiates a new Factura.
     */
    public Factura() {
    }

    /**
     * Instantiates a new Factura.
     *
     * @param estadoPago         the estado pago
     * @param importe            the importe
     * @param codigoFactura      the codigo factura
     * @param fechaFactura       the fecha factura
     * @param fechaVencimiento   the fecha vencimiento
     * @param cliente            the cliente
     * @param empleado           the empleado
     * @param trabajosRealizados the trabajos realizados
     */
    public Factura(boolean estadoPago, float importe, String codigoFactura, LocalDateTime fechaFactura, LocalDateTime fechaVencimiento, Cliente cliente, Empleado empleado, List<TrabajoRealizado> trabajosRealizados) {
        this.estadoPago = estadoPago;
        this.importe = importe;
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.empleado = empleado;
        this.trabajosRealizados = trabajosRealizados;
    }

    /**
     * Is estado pago boolean.
     *
     * @return the boolean
     */
    public boolean isEstadoPago() {
        return estadoPago;
    }

    /**
     * Sets estado pago.
     *
     * @param estadoPago the estado pago
     */
    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    /**
     * Gets importe.
     *
     * @return the importe
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Sets importe.
     *
     * @param importe the importe
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }

    /**
     * Gets codigo factura.
     *
     * @return the codigo factura
     */
    public String getCodigoFactura() {
        return codigoFactura;
    }

    /**
     * Sets codigo factura.
     *
     * @param codigoFactura the codigo factura
     */
    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    /**
     * Gets fecha factura.
     *
     * @return the fecha factura
     */
    public LocalDateTime getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Sets fecha factura.
     *
     * @param fechaFactura the fecha factura
     */
    public void setFechaFactura(LocalDateTime fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * Gets fecha vencimiento.
     *
     * @return the fecha vencimiento
     */
    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets fecha vencimiento.
     *
     * @param fechaVencimiento the fecha vencimiento
     */
    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Gets cliente.
     *
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets cliente.
     *
     * @param cliente the cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    /**
     * Gets trabajos realizados.
     *
     * @return the trabajos realizados
     */
    public List<TrabajoRealizado> getTrabajosRealizados() {
        return trabajosRealizados;
    }

    /**
     * Sets trabajos realizados.
     *
     * @param trabajosRealizados the trabajos realizados
     */
    public void setTrabajosRealizados(List<TrabajoRealizado> trabajosRealizados) {
        this.trabajosRealizados = trabajosRealizados;
    }
}
