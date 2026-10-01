/**
 * Clase abstracta base para los usuarios del sistema SmartLibrary.
 * No se instancia directamente: solo sus subclases (Estudiante, Bibliotecario).
 */
public abstract class Usuario {

    private final String identificacion;
    private final String nombre;
    private final String correo;

    public Usuario(String identificacion, String nombre, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIdentificacion() { return identificacion; }
    public String getNombre()         { return nombre; }
    public String getCorreo()         { return correo; }
}
