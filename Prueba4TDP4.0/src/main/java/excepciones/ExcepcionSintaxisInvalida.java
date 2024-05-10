package excepciones;

public class ExcepcionSintaxisInvalida extends ExcepcionBase {
    public ExcepcionSintaxisInvalida(String mensajeError) {
        super("Error de sintaxis: " + mensajeError);
    }
}