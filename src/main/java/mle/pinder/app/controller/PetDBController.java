package mle.pinder.app.controller;

import mle.pinder.app.controller.dto.PetDto;
import mle.pinder.app.domain.Pet;
import mle.pinder.app.repository.PetDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2")
public class PetDBController {

    @Autowired
    PetDBRepository repository;

    @Autowired
    PetDtoMapper mapper;

    @GetMapping("/{id}")
    PetDto getPet(@PathVariable Long id) {
        Pet pet = repository.getPet(id);
        return mapper.toDto(pet);
    }
}