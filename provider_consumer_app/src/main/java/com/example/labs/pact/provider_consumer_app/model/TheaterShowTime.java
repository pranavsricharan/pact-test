package com.example.labs.pact.provider_consumer_app.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class TheaterShowTime {
    private String name;
    private List<Show> shows;
}
