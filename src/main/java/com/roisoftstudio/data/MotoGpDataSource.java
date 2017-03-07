package com.roisoftstudio.data;

import com.roisoftstudio.externalapi.ApiSeasonCalendar;
import com.roisoftstudio.infrastructure.retrofit.MotoGpAPI;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import javax.inject.Inject;
import java.io.IOException;

@Service
public class MotoGpDataSource {

    private MotoGpAPI motoGpAPI;

    @Inject
    public MotoGpDataSource(MotoGpAPI motoGpAPI) {
        this.motoGpAPI = motoGpAPI;
    }

    public ApiSeasonCalendar getCalendar() {
        try {
            Response<ApiSeasonCalendar> calendarResponse = motoGpAPI.calendar().execute();
            if (calendarResponse.isSuccessful()) {
                return calendarResponse.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Error getting calendar");
    }
}
