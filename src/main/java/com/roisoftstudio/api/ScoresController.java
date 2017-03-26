package com.roisoftstudio.api;

import com.roisoftstudio.domain.model.score.Score;
import com.roisoftstudio.domain.service.ScoresService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
@RequestMapping("/scores")
public class ScoresController {

    @Inject
    private ScoresService scoresService;

    @RequestMapping(value = "/", method = GET)
    public List<Score> getAllScores() {
        return scoresService.getAll();
    }

}