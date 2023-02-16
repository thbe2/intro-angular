package com.example.demo.angular.repositories;

import com.example.demo.angular.models.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


public interface HeroRepository extends JpaRepository<Hero, Long> {
}
