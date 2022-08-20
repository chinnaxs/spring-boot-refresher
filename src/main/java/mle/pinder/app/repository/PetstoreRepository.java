package mle.pinder.app.repository;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import mle.pinder.app.domain.Pet;
import mle.pinder.petstore.ApiClient;
import mle.pinder.petstore.Configuration;
import mle.pinder.petstore.api.PetApi;
import mle.pinder.petstore.dto.PetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class PetstoreRepository {

    @Autowired
    private PetMapper mapper;
    private PetApi petApi;

    @Value("${petstore.basepath}")
    String petstoreBasepath;

    @PostConstruct
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(petstoreBasepath);
        log.info("Loaded petstore basepath: %s".formatted(petstoreBasepath));

        petApi = new PetApi(defaultClient);
    }

    @SneakyThrows
    public Pet getPetById(Long petId) {
        PetDto petDto = petApi.getPetById(petId);
        return mapper.fromDto(petDto);
    }


}
