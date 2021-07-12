package com.example.demo.controllers;

import com.example.demo.entities.Photo;
import com.example.demo.repositories.PhotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/photos")
public class PhotosController {
    private final PhotosRepository photosRepository;

    @Autowired
    public PhotosController(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    @GetMapping("")
    public String index(Map<String, Object> model) {
        var photos = photosRepository.findAll();
        model.put("photos", photos);
        return "photos/index";
    }

    @GetMapping("/create")
    public String create() {
        return "photos/create";
    }

    @PostMapping("/create")
    public String create(String path) {
        Photo photo = new Photo(path);
        photosRepository.save(photo);
        return "redirect:/";
    }

    @PostMapping("")
    public String delete(long id) {
        photosRepository.deleteById(id);
        return "redirect:/photos";
    }
}
