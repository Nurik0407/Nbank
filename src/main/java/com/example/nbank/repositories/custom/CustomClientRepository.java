package com.example.nbank.repositories.custom;

import com.example.nbank.dto.client.ClientResponse;

import java.util.List;

public interface CustomClientRepository {
    List<ClientResponse> getAllClients();
}
