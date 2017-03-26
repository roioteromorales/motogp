package com.roisoftstudio.domain.service;

import com.roisoftstudio.data.score.ScoresRepository;
import com.roisoftstudio.domain.model.score.Score;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ScoresService {

    private ScoresRepository scoresRepository;

    @Inject
    public ScoresService(ScoresRepository scoresRepository) {
        this.scoresRepository = scoresRepository;
    }

    public List<Score> getAll() {
        return scoresRepository.getAll();
    }
}
