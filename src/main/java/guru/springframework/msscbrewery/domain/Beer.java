package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
