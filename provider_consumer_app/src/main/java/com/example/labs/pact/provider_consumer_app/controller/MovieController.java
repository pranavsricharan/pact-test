package com.example.labs.pact.provider_consumer_app.controller;

import com.example.labs.pact.provider_consumer_app.model.ShowTime;
import com.example.labs.pact.provider_consumer_app.model.TheaterShowTime;
import com.example.labs.pact.provider_consumer_app.model.TheaterShowTimeResponse;
import com.example.labs.pact.provider_consumer_app.service.PVRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {
    @Autowired
    private PVRService pvrService;

    @GetMapping("getShowTimes/{movieName}")
    public TheaterShowTimeResponse getMovieShowTime(@PathVariable String movieName) {
        ShowTime showTimes = pvrService.getShowTimes(movieName);
        TheaterShowTimeResponse response = TheaterShowTimeResponse.builder()
                .name(movieName)
                .theaters(new ArrayList<>())
                .build();
        response.getTheaters().add(TheaterShowTime.builder()
                .name("PVR Cinemas")
                .shows(showTimes.getShows())
                .build());

        return response;
    }
}
