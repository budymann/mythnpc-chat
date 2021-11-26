package com.example.budymann.mythnpcchat.repository;

import com.example.budymann.mythnpcchat.domain.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByEmail(String email);
}
