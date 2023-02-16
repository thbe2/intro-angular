package com.example.demo.angular.config;

import com.example.demo.angular.models.Hero;
import com.example.demo.angular.repositories.HeroRepository;
import com.example.demo.angular.services.HeroServiceInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ApiConfig {

    @Bean
    CommandLineRunner commandLineRunner(HeroRepository heroRepository) {
        return args -> {
            heroRepository.saveAll(List.of(
                    new Hero(null, "Dr. Nice"),
                    new Hero(null, "Bombasto"),
                    new Hero(null, "Celeritas"),
                    new Hero(null, "Magneta"),
                    new Hero(null, "RubberMan"),
                    new Hero(null, "Dynama"),
                    new Hero(null, "Dr. IQ"),
                    new Hero(null, "Magma"),
                    new Hero(null, "Tornado")
            ));
        };
    }

}
