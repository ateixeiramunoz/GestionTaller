package entidades;

/**
 * The type Servicio.
 */
public class Servicio {

    /**
     * The Descripcion.
     */
    String descripcion; //Cambio de rueda
    /**
     * The Precio unidad.
     */
    float precioUnidad;
    /**
     * The Precio hora.
     */
    float precioHora;

    /**
     * Instantiates a new Servicio.
     */
    public Servicio() {
    }

    /**
     * Instantiates a new Servicio.
     *
     * @param descripcion  the descripcion
     * @param precioUnidad the precio unidad
     * @param precioHora   the precio hora
     */
    public Servicio(String descripcion, float precioUnidad, float precioHora) {
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
        this.precioHora = precioHora;
    }

    /**
     * Gets descripcion.
     *
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets descripcion.
     *
     * @param descripcion the descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Gets precio unidad.
     *
     * @return the precio unidad
     */
    public float getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * Sets precio unidad.
     *
     * @param precioUnidad the precio unidad
     */
    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    /**
     * Gets precio hora.
     *
     * @return the precio hora
     */
    public float getPrecioHora() {
        return precioHora;
    }

    /**
     * Sets precio hora.
     *
     * @param precioHora the precio hora
     */
    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }
}
