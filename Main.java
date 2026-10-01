import java.time.LocalDate;

/**
 * Prueba mínima del módulo de renovaciones de SmartLibrary.
 */
public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "1085000000", "Laura Gómez", "laura.gomez@universidad.edu.co",
                "20231045", "Ingeniería de Sistemas");
        Ejemplar ejemplar = new Ejemplar("EJ-001", "Clean Code");
        Prestamo prestamo = new Prestamo(estudiante, ejemplar, LocalDate.of(2026, 10, 5));

        // ---------- Caso exitoso ----------
        System.out.println("=== CASO EXITOSO ===");
        System.out.println("Fecha de devolución inicial: " + prestamo.getFechaPrevistaDevolucion());
        LocalDate fechaValida = LocalDate.of(2026, 10, 15);
        prestamo.renovar(fechaValida);
        estudiante.notificar("Tu préstamo de '" + ejemplar.getTitulo()
                + "' fue renovado hasta el " + prestamo.getFechaPrevistaDevolucion() + ".");
        System.out.println("Nueva fecha de devolución: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones: " + prestamo.getRenovaciones().size());

        // ---------- Caso inválido ----------
        System.out.println("\n=== CASO INVÁLIDO ===");
        LocalDate fechaInvalida = LocalDate.of(2026, 10, 15); // igual a la vigente
        try {
            prestamo.renovar(fechaInvalida);
            System.out.println("ERROR: la renovación inválida no debió aceptarse.");
        } catch (IllegalArgumentException e) {
            System.out.println("Renovación rechazada: " + e.getMessage());
        }
        System.out.println("Fecha vigente (sin cambios): " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones (sin cambios): " + prestamo.getRenovaciones().size());
    }
}
