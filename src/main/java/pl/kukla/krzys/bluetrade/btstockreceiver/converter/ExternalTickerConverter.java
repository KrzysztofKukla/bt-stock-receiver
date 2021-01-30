package pl.kukla.krzys.bluetrade.btstockreceiver.converter;

import pl.kukla.krzys.bluetrade.btmodel.TickerDto;

/**
 * @author Krzysztof Kukla
 */
public interface ExternalTickerConverter {

    TickerDto convertToTicker(String externalTicker);

}
