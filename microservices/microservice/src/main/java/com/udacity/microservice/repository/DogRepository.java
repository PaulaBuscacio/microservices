package com.udacity.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.udacity.microservice.entity.Dog;


public interface DogRepository extends CrudRepository<Dog, Long> {
}