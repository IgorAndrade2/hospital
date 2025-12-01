package com.senai.backend.hospital.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Hospital com Vida",
        version = "1.0",
        description = "API para o sistema Hospitalar"
    )
)
public class Swagger {
    
}
