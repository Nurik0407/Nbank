package com.example.nbank.services;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.dto.client.ClientRequest;

public interface ClientService {
    SimpleResponse save(ClientRequest request);
}
