package com.data;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class SongEntity implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    final String title;
    final int durationSeconds;
}