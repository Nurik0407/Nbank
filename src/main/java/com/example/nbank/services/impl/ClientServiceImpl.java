package com.example.nbank.services.impl;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.dto.client.ClientRequest;
import com.example.nbank.dto.client.ClientResponse;
import com.example.nbank.entities.Client;
import com.example.nbank.repositories.ClientRepository;
import com.example.nbank.repositories.custom.CustomClientRepository;
import com.example.nbank.services.ClientService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final CustomClientRepository customCLientRepository;

    @Override
    public SimpleResponse save(ClientRequest request) {
        Client client = Client.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .numberPassport(request.numberPassport())
                .INN(request.INN())
                .birthDate(request.birthDate())
                .address(request.address())
                .phoneNumber(request.phoneNumber())
                .email(request.email())
                .build();

        clientRepository.save(client);
        return SimpleResponse.builder()
                .message("Client successfully saved")
                .status(HttpStatus.OK)
                .build();
    }

    @Override
    public List<ClientResponse> getAllClients() {
        return customCLientRepository.getAllClients();
    }
}
