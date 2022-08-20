package mle.pinder.app.controller;

import mle.pinder.app.controller.dto.MatchDto;
import mle.pinder.app.domain.Match;
import mle.pinder.app.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

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
