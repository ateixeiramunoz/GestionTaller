package entidades;

import java.time.LocalDateTime;
import java.util.List;

public class Reparacion {


    Vehiculo vehiculo;
    List<InstalacionDePieza> instalacionDePiezas;
    List<TrabajoRealizado> manosDeObra;
    String descripción;
    LocalDateTime fecha;
    LocalDateTime fechaGarantia;


}
