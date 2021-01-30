package pl.kukla.krzys.bluetrade.btstockreceiver.converter;

import pl.kukla.krzys.bluetrade.btmodel.ExchangeDto;
import pl.kukla.krzys.bluetrade.btmodel.ExchangeSetDto;

/**
 * @author Krzysztof Kukla
 */
public interface ExternalExchangeConverter {
    ExchangeDto convertToExchangesDto(String externalExchanges);

    ExchangeSetDto convertToExchangeSet(String exchangeSetDto);

}
