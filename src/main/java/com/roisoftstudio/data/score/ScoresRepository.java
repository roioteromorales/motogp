package com.roisoftstudio.data.score;

import com.roisoftstudio.domain.model.score.Score;

import java.util.List;

public interface ScoresRepository {
    List<Score> getAll();
}
