package com.domain;

import lombok.Data;

@Data
public class Song {
    Long id;
    final String title;
    final int durationInSeconds;
}
