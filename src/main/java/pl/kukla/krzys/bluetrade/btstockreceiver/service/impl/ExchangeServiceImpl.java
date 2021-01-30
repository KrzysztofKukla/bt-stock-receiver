package pl.kukla.krzys.bluetrade.btstockreceiver.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.bluetrade.btmodel.ExchangeDto;
import pl.kukla.krzys.bluetrade.btmodel.ExchangeSetDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.converter.ExternalExchangeConverter;
import pl.kukla.krzys.bluetrade.btstockreceiver.gateway.ExternalExchangeApiClient;
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
    public ExchangeSetDto getAllExchanges(String accessKey) {
        String externalExchanges = externalExchangeApiClient.getAllExchanges(accessKey);
        return externalExchangeConverter.convertToExchangeSet(externalExchanges);
    }

    @Override
    public ExchangeDto getExchangeDto(String accessKey, String exchangeIndex) {
        String exchangeResult = externalExchangeApiClient.getExchangeByIndex(accessKey, exchangeIndex);
        return externalExchangeConverter.convertToExchangesDto(exchangeResult);
    }

}
