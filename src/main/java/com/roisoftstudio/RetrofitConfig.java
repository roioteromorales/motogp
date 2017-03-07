package com.roisoftstudio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.roisoftstudio.infrastructure.retrofit.MotoGpAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    private static final String BASE_URL = "http://54.171.219.170/live/json/motogp/";

    @Bean
    public Retrofit retrofit(Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Bean
    public MotoGpAPI motoGpAPI(Retrofit retrofit) {
        return retrofit.create(MotoGpAPI.class);
    }

    @Bean
    public Gson gson() {
        return new GsonBuilder()
                .setLenient()
                .create();
    }
}
