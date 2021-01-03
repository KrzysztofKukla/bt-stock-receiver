package pl.kukla.krzys.bluetrade.btstockreceiver.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Krzysztof Kukla
 */
@FeignClient(name = "stock-external", url = "${stock.external.api.url}")
public interface ExternalExchangeApiClient {
    @GetMapping("/exchanges")
    String getAll(@RequestParam("access_key") String access_key);
}
