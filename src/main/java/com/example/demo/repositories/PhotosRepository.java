package com.example.demo.repositories;

import com.example.demo.entities.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Long> {
    
}
