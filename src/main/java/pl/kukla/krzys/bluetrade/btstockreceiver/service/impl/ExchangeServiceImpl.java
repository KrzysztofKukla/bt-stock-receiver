package pl.kukla.krzys.bluetrade.btstockreceiver.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.bluetrade.btstockreceiver.converter.ExternalExchangeConverter;
import pl.kukla.krzys.bluetrade.btstockreceiver.gateway.ExternalExchangeApiClient;
import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.service.ExchangeService;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExchangeServiceImpl implements ExchangeService {

    private final ExternalExchangeApiClient externalExchangeApiClient;
    private final ExternalExchangeConverter externalExchangeConverter;

    @Override
    public ExchangeSetDto getAll(String accessKey) {
        String externalExchanges = externalExchangeApiClient.getAll(accessKey);
        return externalExchangeConverter.getExchangeSetData(externalExchanges);
    }

}
