package selfstudy.springframework.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import selfstudy.springframework.msscbeerservice.domain.Beer;
import selfstudy.springframework.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
