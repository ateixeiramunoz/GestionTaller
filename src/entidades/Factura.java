package entidades;

import java.time.LocalDateTime;
import java.util.List;

public class Factura {

    boolean estadoPago;
    float importe;

    String codigoFactura;

    LocalDateTime fechaFactura;
    LocalDateTime fechaVencimiento;

    Cliente cliente;
    Empleado empleado;

    List<Servicio> servicios;



}
