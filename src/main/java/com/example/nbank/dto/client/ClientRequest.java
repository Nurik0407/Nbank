package com.example.nbank.dto.client;

import java.time.LocalDate;

public record ClientRequest(
        String firstName,
        String lastName,
        String address,
        String phoneNumber,
        String email,
        String numberPassport,
        String INN,
        LocalDate birthDate) {
}
