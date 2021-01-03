package pl.kukla.krzys.bluetrade.btstockreceiver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Krzysztof Kukla
 */
@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class StockReceiverException extends RuntimeException {

    public StockReceiverException() {
    }

    public StockReceiverException(String message) {
        super(message);
    }

    public StockReceiverException(String message, Throwable cause) {
        super(message, cause);
    }

}
