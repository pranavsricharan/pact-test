package com.example.labs.pact.provider_consumer_app.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShowTime {
    private List<Show> shows;
}
