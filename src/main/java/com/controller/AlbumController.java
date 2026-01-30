package com.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Album;
import com.domain.Artist;
import com.domain.Song;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public Album getAlbum(@PathVariable("id") Long id) {
        // Dummy data for demonstration
        Artist artist = new Artist("John", "Doe", "JD", new Date());
        List<Song> songs = Arrays.asList(
            new Song("Song One", 210),
            new Song("Song Two", 180),
            new Song("Song Tres", 185),
            new Song("Song Four", 185)
        );
        Album album = new Album("Greatest Hits", artist, 2023, songs);
        return album;
    }
}
