package pl.kukla.krzys.bluetrade.btstockreceiver.converter;

import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;

/**
 * @author Krzysztof Kukla
 */
public interface ExternalExchangeConverter {
    ExchangeDto convertToExchangesDto(String externalExchanges);

    ExchangeSetDto convertToExchangeSet(String exchangeSetDto);

}
