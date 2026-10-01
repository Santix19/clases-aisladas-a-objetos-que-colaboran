/**
 * Bibliotecario del sistema. Hereda de Usuario.
 *
 * Decisión de diseño: NO implementa Notificable. En el flujo actual de
 * SmartLibrary las notificaciones (renovaciones, vencimientos) se dirigen a
 * los estudiantes; el bibliotecario es quien ejecuta la gestión, no quien
 * recibe avisos. Implementarla sin un caso de uso real violaría el principio
 * YAGNI. Si más adelante se requieren alertas internas (p. ej. reportes de
 * mora), bastará con añadir "implements Notificable".
 */
public class Bibliotecario extends Usuario {

    private final String codigoEmpleado;
    private final String turno;

    public Bibliotecario(String identificacion, String nombre, String correo,
                         String codigoEmpleado, String turno) {
        super(identificacion, nombre, correo);
        this.codigoEmpleado = codigoEmpleado;
        this.turno = turno;
    }

    public String getCodigoEmpleado() { return codigoEmpleado; }
    public String getTurno()          { return turno; }
}
