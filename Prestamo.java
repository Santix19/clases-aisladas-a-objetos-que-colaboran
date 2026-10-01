import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Préstamo de un ejemplar a un estudiante, con historial de renovaciones.
 */
public class Prestamo {

    private final Estudiante estudiante;
    private final Ejemplar ejemplar;
    private LocalDate fechaPrevistaDevolucion;
    private final List<Renovacion> renovaciones = new ArrayList<>();

    public Prestamo(Estudiante estudiante, Ejemplar ejemplar, LocalDate fechaPrevistaDevolucion) {
        this.estudiante = estudiante;
        this.ejemplar = ejemplar;
        this.fechaPrevistaDevolucion = fechaPrevistaDevolucion;
    }

    /**
     * Renueva el préstamo con una nueva fecha de devolución.
     *
     * Regla de negocio: la nueva fecha debe ser ESTRICTAMENTE posterior a la
     * fecha de devolución vigente.
     *
     * @param nuevaFecha nueva fecha prevista de devolución
     * @throws IllegalArgumentException si nuevaFecha es nula o no es posterior a la vigente
     */
    public void renovar(LocalDate nuevaFecha) {
        if (nuevaFecha == null) {
            throw new IllegalArgumentException("La nueva fecha no puede ser nula.");
        }
        if (!nuevaFecha.isAfter(fechaPrevistaDevolucion)) {
            throw new IllegalArgumentException(
                "La nueva fecha (" + nuevaFecha + ") debe ser posterior a la fecha de devolución vigente ("
                + fechaPrevistaDevolucion + ").");
        }

        // Se registra la renovación ANTES de actualizar la fecha vigente,
        // para conservar la fecha anterior.
        Renovacion renovacion = new Renovacion(LocalDate.now(), fechaPrevistaDevolucion, nuevaFecha);
        renovaciones.add(renovacion);
        fechaPrevistaDevolucion = nuevaFecha;
    }

    public Estudiante getEstudiante()                { return estudiante; }
    public Ejemplar getEjemplar()                    { return ejemplar; }
    public LocalDate getFechaPrevistaDevolucion()    { return fechaPrevistaDevolucion; }

    /** Vista de solo lectura para no exponer la lista interna. */
    public List<Renovacion> getRenovaciones()        { return Collections.unmodifiableList(renovaciones); }
}
