package pl.kukla.krzys.bluetrade.btstockreceiver.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.bluetrade.btmodel.TickerDto;
import pl.kukla.krzys.bluetrade.btstockreceiver.service.TickerService;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping(TickerController.TICKERS_API)
@RequiredArgsConstructor
@Slf4j
public class TickerController {

    static final String TICKERS_API = "/api/v1/tickers";

    private final TickerService tickerService;

    @GetMapping("/{ticker}")
    public TickerDto getTicker(@RequestParam("access_key") String accessKey,
                               @PathVariable String ticker) {
        return tickerService.getTicker(accessKey, ticker);
    }

}
