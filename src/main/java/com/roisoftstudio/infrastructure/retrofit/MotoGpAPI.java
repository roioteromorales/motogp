package com.roisoftstudio.infrastructure.retrofit;

import com.roisoftstudio.externalapi.ApiSeasonCalendar;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MotoGpAPI {
    @GET("2016/calendar.json")
    Call<ApiSeasonCalendar> calendar();
}