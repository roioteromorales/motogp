package com.roisoftstudio.data.gp;

import com.roisoftstudio.domain.model.GrandPrix;

import java.util.List;

public interface GPRepository {
    List<GrandPrix> getByYear(int year);

    GrandPrix getById(String id);

}
