
package excepciones;

public class InvalidFutureDateException extends Exception {

    public InvalidFutureDateException() {
        super("Fecha invalida: La fecha es futura.");
    }
}

