package entidades;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Albaran {

    String numeroAlbaran;
    LocalDateTime fechaEntrega;
    List<Pieza> piezas;
    Proveedor proveedor;
    Factura factura;

}
