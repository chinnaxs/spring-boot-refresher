package mle.pinder.app.controller;

import mle.pinder.app.controller.dto.PetDto;
import mle.pinder.app.domain.Pet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetDtoMapper {

    Pet fromtDto(PetDto petDto);
    PetDto toDto(Pet pet);

}
