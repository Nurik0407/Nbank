package com.example.nbank.api;

import com.example.nbank.dto.SimpleResponse;
import com.example.nbank.services.AccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
@Tag(name = "Счет API", description = "Для увравления счетами клиентов")
public class AccountAPI {
    private final AccountService accountService;

}
