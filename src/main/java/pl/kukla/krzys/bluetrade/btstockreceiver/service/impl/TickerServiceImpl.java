package pl.kukla.krzys.bluetrade.btstockreceiver.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.bluetrade.btmodel.TickerDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.converter.ExternalTickerConverter;
import pl.kukla.krzys.bluetrade.btstockreceiver.gateway.ExternalTickerApiClient;
import pl.kukla.krzys.bluetrade.btstockreceiver.service.TickerService;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class TickerServiceImpl implements TickerService {
    private final ExternalTickerApiClient externalTickerApiClient;
    private final ExternalTickerConverter externalTickerConverter;

    @Override
    public TickerDto getTicker(String apiKey, String ticker) {
        String tickerResult = externalTickerApiClient.getTicker(apiKey, ticker);
        return externalTickerConverter.convertToTicker(tickerResult);
    }

}
