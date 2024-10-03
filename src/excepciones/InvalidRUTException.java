
package excepciones;

public class InvalidRUTException extends Exception {
    public InvalidRUTException (){
        super("El RUT no es valido.");
    }
}
