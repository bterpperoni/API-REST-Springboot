package com.cardest.backend.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootConfiguration
public class CorsConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "PUT", "DELETE");
        super.addCorsMappings(registry);
    }
}