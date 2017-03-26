package com.roisoftstudio.domain.service;

import com.roisoftstudio.data.raceresult.RaceResultsRepository;
import com.roisoftstudio.domain.model.RaceResult;
import com.roisoftstudio.domain.model.event.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceResultsService {
    private final RaceResultsRepository raceResultsRepository;

    public RaceResultsService(RaceResultsRepository raceResultsRepository) {
        this.raceResultsRepository = raceResultsRepository;
    }

    public List<RaceResult> getCurrent(Category category) {
        return raceResultsRepository.getCurrent(category);
    }
}
