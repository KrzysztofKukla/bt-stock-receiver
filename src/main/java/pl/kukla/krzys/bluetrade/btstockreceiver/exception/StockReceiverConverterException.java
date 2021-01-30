package pl.kukla.krzys.bluetrade.btstockreceiver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Krzysztof Kukla
 */
@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class StockReceiverConverterException extends RuntimeException {

    public StockReceiverConverterException() {
    }

    public StockReceiverConverterException(String message) {
        super(message);
    }

    public StockReceiverConverterException(String message, Throwable cause) {
        super(message, cause);
    }

}
