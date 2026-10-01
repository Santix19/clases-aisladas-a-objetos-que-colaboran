/**
 * Estudiante de la biblioteca. Hereda de Usuario y puede recibir notificaciones
 * (por ejemplo, confirmaciones de renovación o avisos de vencimiento).
 */
public class Estudiante extends Usuario implements Notificable {

    private final String codigoEstudiantil;
    private final String programaAcademico;

    public Estudiante(String identificacion, String nombre, String correo,
                      String codigoEstudiantil, String programaAcademico) {
        super(identificacion, nombre, correo);
        this.codigoEstudiantil = codigoEstudiantil;
        this.programaAcademico = programaAcademico;
    }

    public String getCodigoEstudiantil()  { return codigoEstudiantil; }
    public String getProgramaAcademico()  { return programaAcademico; }

    /** Simula el envío de la notificación imprimiéndola en consola. */
    @Override
    public void notificar(String mensaje) {
        System.out.println("[NOTIFICACIÓN a " + getNombre() + " <" + getCorreo() + ">] " + mensaje);
    }
}
