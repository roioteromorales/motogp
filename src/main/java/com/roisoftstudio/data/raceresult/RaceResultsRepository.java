package com.roisoftstudio.data.raceresult;

import com.roisoftstudio.domain.model.RaceResult;
import com.roisoftstudio.domain.model.event.Category;

import java.util.List;

public interface RaceResultsRepository {
    List<RaceResult> getCurrent(Category category);
}
