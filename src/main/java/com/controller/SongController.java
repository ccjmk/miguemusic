package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controller.exception.ResourceNotFoundException;
import com.data.SongEntity;
import com.data.SongRepository;
import com.domain.Song;

import org.springframework.web.bind.annotation.DeleteMapping;
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

    @GetMapping()
    public List<Song> listSongs() {
        List<SongEntity> songs = repository.findAll();

        return songs.stream()
                .map(songEntity -> conversionService.convert(songEntity, Song.class))
                .toList();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        Optional<SongEntity> songEntity = repository.findById(id);

        if (songEntity.isEmpty()) {
            throw new ResourceNotFoundException("Song not found");
        }
        return conversionService.convert(songEntity, Song.class);
    }

    // @PatchMapping("/{id}")
    // public Song updateSong(@PathVariable Long id, @RequestBody Song updatedSong)
    // {
    // Optional<SongEntity> existingSongEntity = repository.findById(id);

    // if(existingSongEntity.isEmpty()) {
    // throw new ResourceNotFoundException("Song not found");
    // }

    // SongEntity songEntityToUpdate = existingSongEntity.get();
    // songEntityToUpdate.setTitle(updatedSong.getTitle());
    // songEntityToUpdate.setDurationSeconds(updatedSong.getDurationInSeconds());

    // SongEntity saved = repository.save(songEntityToUpdate);

    // return conversionService.convert(saved, Song.class);
    // }

    @PostMapping("")
    public Song addSong(@RequestBody Song newSong) {
        System.out.println("Received new song: " + newSong);
        SongEntity songEntity = conversionService.convert(newSong, SongEntity.class);
        System.out.println("Converted SongEntity: " + songEntity);

        SongEntity saved = repository.save(songEntity);

        return conversionService.convert(saved, Song.class);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new ResourceNotFoundException("Song not found");
        }
    }
}
