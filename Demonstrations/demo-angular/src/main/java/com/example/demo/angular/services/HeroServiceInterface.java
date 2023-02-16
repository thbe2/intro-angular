package com.example.demo.angular.services;

import com.example.demo.angular.models.Hero;

import java.util.List;

public interface HeroServiceInterface {

    List<Hero> getAll();
    Hero getOne(Long id);
    Hero add(Hero hero);
    Hero update(Hero hero);
    void deleteById(Long id);

}
