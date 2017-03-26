package com.roisoftstudio.data.score;

import com.roisoftstudio.domain.model.score.Score;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class ScoresInMemoryRepository implements ScoresRepository {

    @Override
    public List<Score> getAll() {
        return createScores();
    }

    private List<Score> createScores() {
        return asList(
                new Score(1, "Magda", 493),
                new Score(2, "Moldes", 456),
                new Score(3, "Roi", 152),
                new Score(4, "Rebe", 125),
                new Score(5, "Mauro", 36)
        );
    }
}
