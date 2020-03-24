package com.example.labs.pact.providerapp.controller;

import com.example.labs.pact.providerapp.model.ShowTime;
import com.example.labs.pact.providerapp.store.DataStore;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Setter
public class ShowsController {
    @Autowired
    private DataStore dataStore;

    @GetMapping("/getShowTimes/{movieName}")
    public ShowTime getBooks(@PathVariable String movieName) {
        return dataStore.getMovieShowTimes(movieName);
    }
}
