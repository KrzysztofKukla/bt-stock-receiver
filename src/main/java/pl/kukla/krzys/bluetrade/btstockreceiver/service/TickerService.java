package pl.kukla.krzys.bluetrade.btstockreceiver.service;

import pl.kukla.krzys.bluetrade.btmodel.TickerDto;

/**
 * @author Krzysztof Kukla
 */
public interface TickerService {

    TickerDto getTicker(String apiKey, String ticker);

}
