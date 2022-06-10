package com.example.springboot.shared.openapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        title = "Dávid's Library to learn spring boot",
        description = "Lorem ipsum...",
        version = "1.0"
    ),
    servers = @Server(url = "http://localhost:8080")
)
public class OpenAPIConfiguration {
    
}
