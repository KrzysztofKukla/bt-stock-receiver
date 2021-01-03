package pl.kukla.krzys.bluetrade.btstockreceiver.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.bluetrade.btstockreceiver.exception.StockReceiverException;
import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExternalExchangeConverterImpl implements ExternalExchangeConverter {

    private final ObjectMapper objectMapper;

    @Override
    public ExchangeDto convertToExchangesDto(String externalExchange) {
        try {
            return objectMapper.readValue(externalExchange, ExchangeDto.class);
        } catch (JsonProcessingException e) {
            throw new StockReceiverException("Cannot convert to Exchange",e);
        }
    }

    @Override
    public ExchangeSetDto convertToExchangeSet(String exchangeSetDto) {
        try {
            return objectMapper.readValue(exchangeSetDto, ExchangeSetDto.class);
        } catch (JsonProcessingException e) {
            throw new StockReceiverException("Cannot convert to Exchange",e);
        }
    }

}
