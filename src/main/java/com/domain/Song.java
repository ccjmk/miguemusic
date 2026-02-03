package com.domain;

import java.util.List;

import lombok.Data;

@Data
public class Song {
    Long id;
    final String title;
    final int durationInSeconds;
    final List<Artist> artists;
}
