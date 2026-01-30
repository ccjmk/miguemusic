package com.domain;

import java.util.List;

import lombok.Data;

@Data
public class Album {
    final String title;
    final Artist artist;
    final int releaseYear;
    final List<Song> songs;
}
