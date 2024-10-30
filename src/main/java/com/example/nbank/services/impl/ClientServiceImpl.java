package com.example.nbank.services.impl;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.dto.client.ClientRequest;
import com.example.nbank.repositories.ClientRepository;
import com.example.nbank.services.ClientService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    @Override
    public SimpleResponse save(ClientRequest request) {
        return null ;
    }
}
