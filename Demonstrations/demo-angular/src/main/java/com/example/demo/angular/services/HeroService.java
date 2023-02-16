package com.example.demo.angular.services;

import com.example.demo.angular.models.Hero;
import com.example.demo.angular.repositories.HeroRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeroService implements HeroServiceInterface{

    private final HeroRepository heroRepository;

    @Override
    public List<Hero> getAll() {
        return heroRepository.findAll();
    }

    @Override
    public Hero getOne(Long id) throws EntityNotFoundException {
        return heroRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No entity found for id " + id));
    }

    @Override
    public Hero add(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public Hero update(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public void deleteById(Long id) {
        heroRepository.deleteById(id);
    }
}
