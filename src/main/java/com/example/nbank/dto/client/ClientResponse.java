package com.example.nbank.dto.client;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ClientResponse(
        Long id,
        String surname,
        LocalDate dateOfBirth,
        String numberPassport,
        String INN) {
}
