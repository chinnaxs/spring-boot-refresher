package mle.pinder.app.service;

import lombok.extern.slf4j.Slf4j;
import mle.pinder.app.controller.MatchController;
import mle.pinder.app.domain.Match;
import mle.pinder.app.domain.Pet;
import mle.pinder.app.repository.PetstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class MatchService {

    @Autowired
    private PetstoreRepository petstoreRepository;

    public Match getMatch() {
        Random rn = new Random();
        Long id1 =  Integer.toUnsignedLong(rn.nextInt(10)) + 1;
        Long id2 =  Integer.toUnsignedLong(rn.nextInt(10)) + 1;

        Pet pet1 = petstoreRepository.getPetById(id1);
        Pet pet2 = petstoreRepository.getPetById(id2);
        Match match = new Match(pet1, pet2);
        log.info(match.toString());
        return match;
    }
}
