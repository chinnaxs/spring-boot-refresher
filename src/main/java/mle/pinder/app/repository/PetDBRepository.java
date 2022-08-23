package mle.pinder.app.repository;

import mle.pinder.app.domain.Pet;
import mle.pinder.app.repository.entity.PetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PetDBRepository {

    @Autowired
    PetDao petDao;

    @Autowired
    PetMapper mapper;

    public Pet getPet(Long id) {
        PetEntity petEntity = petDao.getReferenceById(id);
        if (petEntity == null) {
            return null;
        }
        return mapper.fromEntity(petEntity);
    }
}
