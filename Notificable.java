/**
 * Contrato para cualquier entidad que pueda recibir notificaciones.
 */
public interface Notificable {
    void notificar(String mensaje);
}
