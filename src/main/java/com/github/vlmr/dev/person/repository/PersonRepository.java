package com.github.vlmr.dev.person.repository;

import com.github.vlmr.dev.person.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}