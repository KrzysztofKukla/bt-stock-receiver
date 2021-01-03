package pl.kukla.krzys.bluetrade.btstockreceiver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Krzysztof Kukla
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeSetDto {

    private PaginationDto pagination;

    @JsonProperty("data")
    private List<ExchangeDto> exchanges;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    private static class PaginationDto{
        private Integer limit;
        private Integer offset;
        private Integer count;
        private Integer total;
    }
}
