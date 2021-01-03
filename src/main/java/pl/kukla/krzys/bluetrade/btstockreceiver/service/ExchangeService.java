package pl.kukla.krzys.bluetrade.btstockreceiver.service;

import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;

/**
 * @author Krzysztof Kukla
 */
public interface ExchangeService {

    ExchangeSetDto getAll(String accessKey);

}
