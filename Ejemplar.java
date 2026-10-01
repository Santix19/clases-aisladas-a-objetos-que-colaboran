/**
 * Copia física de un libro. Implementación básica para soportar el préstamo.
 */
public class Ejemplar {

    private final String codigo;
    private final String titulo;

    public Ejemplar(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
}
