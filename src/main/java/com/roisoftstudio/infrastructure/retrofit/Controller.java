package com.roisoftstudio.infrastructure.retrofit;


import com.roisoftstudio.externalapi.ApiSeasonCalendar;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.inject.Inject;

@Service
public class Controller implements Callback<ApiSeasonCalendar> {

    private MotoGpAPI motoGpAPI;
    private Runnable callback;

    @Inject
    public Controller(MotoGpAPI motoGpAPI) {
        this.motoGpAPI = motoGpAPI;
    }

    public void start(Runnable callback) {
        this.callback = callback;
        Call<ApiSeasonCalendar> call = motoGpAPI.calendar();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<ApiSeasonCalendar> call, Response<ApiSeasonCalendar> response) {
        if (response.isSuccessful()) {
            ApiSeasonCalendar seasonCalendar = response.body();
            callback.run();
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<ApiSeasonCalendar> call, Throwable t) {
        t.printStackTrace();
    }
}