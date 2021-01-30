package pl.kukla.krzys.bluetrade.btstockreceiver.converter.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.bluetrade.btmodel.TickerDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.converter.ExternalTickerConverter;
import pl.kukla.krzys.bluetrade.btstockreceiver.exception.StockReceiverConverterException;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExternalTickerConverterImpl implements ExternalTickerConverter {

    private final ObjectMapper objectMapper;

    @Override
    public TickerDto convertToTicker(String externalTicker) {
        try {
            return objectMapper.readValue(externalTicker, TickerDto.class);
        } catch (JsonProcessingException e) {
            throw new StockReceiverConverterException("Cannot convert to TickerDto", e);
        }
    }

}
