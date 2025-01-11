package com.ahmetyagiz.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
        @Bean
        public OpenAPI todoAPI() {
                return new OpenAPI()
                        .info(new Info()
                                .title("Todo List API")
                                .description("Spring Boot REST API for Todo List Application")
                                .version("1.0"));
        }
}