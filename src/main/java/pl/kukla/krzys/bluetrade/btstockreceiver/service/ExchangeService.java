package pl.kukla.krzys.bluetrade.btstockreceiver.service;

import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;

/**
 * @author Krzysztof Kukla
 */
public interface ExchangeService {

    ExchangeSetDto getAllExchanges(String accessKey);

    ExchangeDto getExchangeDto(String accessKey, String countryIndex);

}
