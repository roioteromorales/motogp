package infrastructure.retrofit;

import domain.Calendar;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MotoGpAPI {
    @GET("2016/calendar.json")
    Call<Calendar> calendar();
}