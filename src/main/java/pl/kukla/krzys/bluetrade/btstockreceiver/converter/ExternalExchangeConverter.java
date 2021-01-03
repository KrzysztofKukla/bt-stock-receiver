package pl.kukla.krzys.bluetrade.btstockreceiver.converter;

import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;

/**
 * @author Krzysztof Kukla
 */
public interface ExternalExchangeConverter {
    ExchangeSetDto convertToExchangesDto(String externalExchanges);

    ExchangeSetDto getExchangeSetData(String exchangeSetDto);

}
