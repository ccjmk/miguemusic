package com.controller;

import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.SongEntity;

import com.domain.Song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/songs")
public class SongController {
    private ConversionService conversionService;

    SongController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        Song newSong = new Song("Song One", 210);
        newSong.setId(id);

        return newSong;
    }
    
    
    @PostMapping("")
    public Song addSong(@RequestBody Song newSong) {
        System.out.println("Received new song: " + newSong);
        SongEntity songEntity = conversionService.convert(newSong, SongEntity.class);
        System.out.println("Converted SongEntity: " + songEntity);

        // repository.save(newAlbum);
        
        return newSong;
    }
}
