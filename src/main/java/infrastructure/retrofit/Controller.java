package infrastructure.retrofit;

import domain.Calendar;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.inject.Inject;

@Service
public class Controller implements Callback<Calendar> {

    private MotoGpAPI motoGpAPI;
    private Runnable callback;

    @Inject
    public Controller(MotoGpAPI motoGpAPI) {
        this.motoGpAPI = motoGpAPI;
    }

    public void start(Runnable callback) {
        this.callback = callback;
        Call<Calendar> call = motoGpAPI.calendar();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Calendar> call, Response<Calendar> response) {
        if (response.isSuccessful()) {
            Calendar calendar = response.body();
            callback.run();
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<Calendar> call, Throwable t) {
        t.printStackTrace();
    }
}