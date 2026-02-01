package com.controller;

import java.util.Optional;

import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.exception.ResourceNotFoundException;
import com.data.SongEntity;
import com.data.SongRepository;
import com.domain.Song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/songs")
public class SongController {
    private final ConversionService conversionService;
    private final SongRepository repository;

    SongController(ConversionService conversionService, SongRepository repository) {
        this.conversionService = conversionService;
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        Optional<SongEntity> songEntity = repository.findById(id);

        if(songEntity.isEmpty()) {
            throw new ResourceNotFoundException("Song not found");
        }
        return conversionService.convert(songEntity, Song.class);
    }
    
    
    @PostMapping("")
    public Song addSong(@RequestBody Song newSong) {
        System.out.println("Received new song: " + newSong);
        SongEntity songEntity = conversionService.convert(newSong, SongEntity.class);
        System.out.println("Converted SongEntity: " + songEntity);

        SongEntity saved = repository.save(songEntity);
        
        return conversionService.convert(saved, Song.class);
    }
}
