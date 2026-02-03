package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.AlbumEntity;
import com.data.AlbumRepository;
import com.domain.Album;

import java.util.List;

import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    final ConversionService conversionService;
    final AlbumRepository repository;

    AlbumController(ConversionService conversionService, AlbumRepository repository) {
        this.conversionService = conversionService;
        this.repository = repository;
    }

    @GetMapping("")
    public List<Album> getAllAlbums() {
        List<AlbumEntity> albums = repository.findAll();

        return albums.stream()
                .map(albumEntity -> conversionService.convert(albumEntity, Album.class))
                .toList();
    }

}
