package com.roisoftstudio.domain.service;

import com.roisoftstudio.data.gp.GPRepository;
import com.roisoftstudio.domain.model.GrandPrix;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;


@Service
public class GPService {

    private GPRepository gpRepository;

    @Inject
    public GPService(GPRepository gpRepository) {
        this.gpRepository = gpRepository;
    }

    public List<GrandPrix> get(int year) {
        return gpRepository.getByYear(year);
    }

    public GrandPrix get(int year, int gpId) {
        return gpRepository.getByYearAndId(year, gpId);
    }
}
