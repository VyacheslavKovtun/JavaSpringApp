package com.example.demo.controllers;

import com.example.demo.repositories.PhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/photos")
public class PhotosController {
    private final PhotosRepository photosRepository;

    public PhotosController(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        
        return "photos/index";
    }
}
