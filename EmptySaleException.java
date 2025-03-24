package S102ExceptionsNivel1;
import java.lang.Exception;

public class EmptySaleException extends Exception{

    public EmptySaleException(String message){
        super(message);
    }
}
