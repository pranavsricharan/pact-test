package com.example.labs.pact.providerapp.store;

import com.example.labs.pact.providerapp.model.Show;
import com.example.labs.pact.providerapp.model.ShowTime;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
public class DataStore {
    private HashMap<String, ShowTime> movieShowTimes;

    public DataStore() {
        movieShowTimes = new HashMap<>();
        initData();
    }

    public ShowTime getMovieShowTimes(String movieName) {
        return movieShowTimes.getOrDefault(
                movieName,
                ShowTime.builder().shows(Collections.emptyList()).build()
        );
    }

    private void initData() {
        ArrayList<Show> shows = new ArrayList<Show>();
        shows.add(new Show("6", "8:10"));
        shows.add(new Show("3", "11:40"));
        shows.add(new Show("6", "15:30"));
        movieShowTimes.put("Baahubali", ShowTime.builder().shows(shows).build());
    }
}
