package mle.pinder.app.controller;

import mle.pinder.app.controller.dto.MatchDto;
import mle.pinder.app.domain.Match;
import mle.pinder.app.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {

    @Autowired
    MatchService matchService;

    @Autowired
    MatchDtoMapper matchDtoMapper;

    @GetMapping(path="/", produces = "application/json")
    MatchDto getMatch() {
        Match match = matchService.getMatch();
        return matchDtoMapper.toDto(match);
    }
}
