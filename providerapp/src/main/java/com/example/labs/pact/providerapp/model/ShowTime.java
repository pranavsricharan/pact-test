package com.example.labs.pact.providerapp.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShowTime {
    private List<Show> shows;
}
