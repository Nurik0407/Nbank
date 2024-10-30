package com.example.nbank.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Collections;

@OpenAPIDefinition(
        info = @Info(
                title = "Запросы тех поддержки",
                version = "1.0.0",
                description = "Сервис для тех поддержки выполнять запросы ",
                license = @License(
                        name = "Apache 2.0",
                        url = "https://springdoc.org"))
)
@Configuration
public class OpenApiConfig {

    @Bean
    @Profile("local")
    public OpenAPI localOpenAPI() {
        return buildOpenApi("Local server");
    }

    @Bean
    @Profile("dev")
    public OpenAPI devOpenAPI() {
        return buildOpenApi("Dev server");
    }

    @Bean
    @Profile("prod")
    public OpenAPI prodOpenAPI() {
        return buildOpenApi("Prod server");
    }

    private OpenAPI buildOpenApi(String description) {
        io.swagger.v3.oas.models.servers.Server server = new Server().url("http://localhost:2024").description(description);
        return new OpenAPI().servers(Collections.singletonList(server));
    }
}
