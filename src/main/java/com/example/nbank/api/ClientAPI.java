package com.example.nbank.api;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.dto.client.ClientRequest;
import com.example.nbank.services.ClientService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
@Tag(name = "Клиент API", description = "Для увравления клиентами и их данными")
public class ClientAPI {
    private final ClientService clientService;

    @PostMapping("/create")
    public SimpleResponse createClient(@RequestBody @Valid ClientRequest request) {
        return clientService.save(request);
    }

    @PostMapping("/register")
    public SimpleResponse register(String phoneNumber){
        return null;
    }
}
