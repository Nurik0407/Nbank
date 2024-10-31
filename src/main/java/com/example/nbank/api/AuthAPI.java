package com.example.nbank.api;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.dto.client.ClientRequest;
import com.example.nbank.services.ClientService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Tag(name = "Authentication API", description = "API for user authentication (sign in/sign up)")
@CrossOrigin(origins = "*")
public class AuthAPI {
    private final ClientService clientService;

    @GetMapping
    public SimpleResponse auth(ClientRequest clientRequest) {
        return clientService.save(clientRequest);
    }
}
