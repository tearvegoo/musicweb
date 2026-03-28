package com.example.musicweb.controller;

import com.example.musicweb.entity.Song;
import com.example.musicweb.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongRepository repo;

    @GetMapping
    public List<Song> getAll() {
        return repo.findAll();
    }


    @PostMapping
    public Song add(@RequestBody Song song) {
        return repo.save(song);
    }
}