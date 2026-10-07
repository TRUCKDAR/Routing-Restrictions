package escuelaing.edu.co.truckdar.routing_restrictions.exception;

public class RestrictionNotFoundException extends RuntimeException {
    public RestrictionNotFoundException(String message) {
        super(message);
    }
}