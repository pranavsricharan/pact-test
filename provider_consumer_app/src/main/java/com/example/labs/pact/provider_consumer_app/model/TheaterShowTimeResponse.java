package com.example.labs.pact.provider_consumer_app.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
public class TheaterShowTimeResponse {
    private String name;
    List<TheaterShowTime> theaters;
}
