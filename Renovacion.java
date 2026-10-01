import java.time.LocalDate;

/**
 * Registro inmutable de una renovación de préstamo.
 */
public class Renovacion {

    private final LocalDate fechaRenovacion; // día en que se hizo la renovación
    private final LocalDate fechaAnterior;   // fecha de devolución antes de renovar
    private final LocalDate nuevaFecha;      // fecha de devolución después de renovar

    public Renovacion(LocalDate fechaRenovacion, LocalDate fechaAnterior, LocalDate nuevaFecha) {
        this.fechaRenovacion = fechaRenovacion;
        this.fechaAnterior = fechaAnterior;
        this.nuevaFecha = nuevaFecha;
    }

    public LocalDate getFechaRenovacion() { return fechaRenovacion; }
    public LocalDate getFechaAnterior()   { return fechaAnterior; }
    public LocalDate getNuevaFecha()      { return nuevaFecha; }
}
