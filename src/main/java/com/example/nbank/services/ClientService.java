package com.example.nbank.services;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.dto.client.ClientRequest;
import com.example.nbank.dto.client.ClientResponse;

import java.util.List;

public interface ClientService {
    SimpleResponse save(ClientRequest request);

    List<ClientResponse> getAllClients();
}
