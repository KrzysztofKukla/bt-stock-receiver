package pl.kukla.krzys.bluetrade.btstockreceiver.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Krzysztof Kukla
 */
@FeignClient(name = "external-ticker", url = "${stock.external.api.url}")
public interface ExternalTickerApiClient {

    @GetMapping("/tickers/{ticker}/eod/latest")
    String getTicker(@RequestParam("access_key") String access_key,
                     @PathVariable String ticker);
}
