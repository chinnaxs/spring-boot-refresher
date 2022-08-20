package mle.pinder.app.controller;


import mle.pinder.app.controller.dto.MatchDto;
import mle.pinder.app.domain.Match;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PetDtoMapper.class})
public interface MatchDtoMapper {

    MatchDto toDto(Match match);
    Match fromDto(MatchDto matchDto);
}
