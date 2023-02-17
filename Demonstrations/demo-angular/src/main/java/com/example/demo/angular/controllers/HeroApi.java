package com.example.demo.angular.controllers;

import com.example.demo.angular.models.Hero;
import com.example.demo.angular.services.HeroServiceInterface;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200")
public class HeroApi {

    private final HeroServiceInterface heroServiceInterface;

    @GetMapping("/heroes")
    public List<Hero> all() {
        System.out.println("Fetched all heroes");
        return heroServiceInterface.getAll();
    }

    @GetMapping("/heroes/{id}")
    public Hero one(@PathVariable Long id) {
        System.out.println("Fetched hero with id: " + id);
        return heroServiceInterface.getOne(id);
    }

    @PostMapping("/heroes")
    public Hero add(@RequestBody Hero hero) {
        System.out.println("Got a hero");
        return heroServiceInterface.add(hero);
    }

    @PutMapping("/heroes")
    public Hero update(@RequestBody Hero hero) {
        System.out.println("Updated a hero");
        return heroServiceInterface.update(hero);
    }

    @DeleteMapping("/heroes/{id}")
    public void delete(@PathVariable Long id) {
        System.out.println("Deleted hero with id: " + id);
        heroServiceInterface.deleteById(id);
    }

}
