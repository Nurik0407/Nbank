package com.example.nbank.dto.client;

public record ClientRequest(
        String firstName,
        String lastName,
        String address,
        String phoneNumber,
        String email) {
}
