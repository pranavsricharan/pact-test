package com.example.labs.pact.provider_consumer_app.service;

import com.example.labs.pact.provider_consumer_app.model.ShowTime;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

@Service
public class PVRService {
    private PVRServiceInterface service;
    public PVRService() {
        this.service = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PVRServiceInterface.class);
    }

    @SneakyThrows
    public ShowTime getShowTimes(String movieName) {
        return service.getShowTimes(movieName).execute().body();
    }

    interface PVRServiceInterface {
        @GET("getShowTimes/{movieName}/")
        Call<ShowTime> getShowTimes(@Path("movieName") String movieName);
    }
}
