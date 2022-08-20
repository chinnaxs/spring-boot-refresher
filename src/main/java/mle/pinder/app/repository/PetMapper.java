package mle.pinder.app.repository;

import mle.pinder.app.domain.Pet;
import mle.pinder.petstore.dto.PetDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PetMapper {
    PetDto toDto(Pet pet);
    Pet fromDto(PetDto petDto);
}
