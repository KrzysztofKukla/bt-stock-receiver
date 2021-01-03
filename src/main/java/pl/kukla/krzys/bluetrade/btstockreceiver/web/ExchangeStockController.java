package pl.kukla.krzys.bluetrade.btstockreceiver.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.bluetrade.btstockreceiver.model.ExchangeSetDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.service.ExchangeService;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping(ExchangeStockController.EXCHANGE_API_URL)
@RequiredArgsConstructor
@Slf4j
public class ExchangeStockController {

    static final String EXCHANGE_API_URL = "/api/v1/exchanges";

    private final ExchangeService exchangeService;

    @GetMapping
    public ExchangeSetDto getExchanges(@RequestParam("access_key") String accessKey){
        return exchangeService.getAll(accessKey);
    }
}
