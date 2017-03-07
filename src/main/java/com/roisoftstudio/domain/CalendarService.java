package com.roisoftstudio.domain;

import com.roisoftstudio.data.MotoGpDataSource;
import com.roisoftstudio.externalapi.ApiSeasonCalendar;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CalendarService {
    private MotoGpDataSource motoGpDataSource;

    @Inject
    public CalendarService(MotoGpDataSource motoGpDataSource) {
        this.motoGpDataSource = motoGpDataSource;
    }

    public ApiSeasonCalendar getCalendar() {
        return motoGpDataSource.getCalendar();
    }

}
