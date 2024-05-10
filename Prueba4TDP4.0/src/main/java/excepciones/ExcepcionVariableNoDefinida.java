package excepciones;

public class ExcepcionVariableNoDefinida extends ExcepcionBase {
    public ExcepcionVariableNoDefinida(String nombreVariable) {
        super("Variable no definida utilizada: " + nombreVariable);
    }
}

