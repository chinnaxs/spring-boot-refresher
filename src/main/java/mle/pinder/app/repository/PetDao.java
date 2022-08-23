package mle.pinder.app.repository;

import mle.pinder.app.repository.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PetDao extends JpaRepository<PetEntity, Long> { }
