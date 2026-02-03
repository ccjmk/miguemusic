package com.domain;

import java.util.List;

import lombok.Data;

@Data
public class Album {
    Long id;
    final Artist artist;
    final int releaseYear;
    final String title;
    final List<Song> songs;
}
