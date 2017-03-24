package com.roisoftstudio.data.gp;

import com.roisoftstudio.domain.model.GrandPrix;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GPRepository {
    List<GrandPrix> getByYear(int year);

    GrandPrix getByYearAndId(int year, int id);

}
