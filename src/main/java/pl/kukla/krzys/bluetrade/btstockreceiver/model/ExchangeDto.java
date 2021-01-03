package pl.kukla.krzys.bluetrade.btstockreceiver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.kukla.krzys.bluetrade.btmodel.CurrencyDto;

/**
 * @author Krzysztof Kukla
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeDto {

    private String name;
    private String acronym;
    private String country;
    private String mic;

    @JsonProperty("country_code")
    private String countryCode;

    private String city;
    private String website;
    private TimezoneDto timezone;
    private Currency currency;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    private static class TimezoneDto{
        private String timezone;
        private String abbr;
        private String abbr_dst;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    private static class Currency{
        private String code;
        private String symbol;
        private String name;
    }
}
